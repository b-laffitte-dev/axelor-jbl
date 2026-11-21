package com.axelor.apps.jbl.service;

import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.db.Product;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.JblStock;
import com.axelor.apps.jbl.db.JblStockMovement;
import com.axelor.apps.jbl.db.JblStockMovementRepository;
import com.axelor.apps.jbl.db.JblStockRepository;
import com.axelor.exception.AxelorRuntimeException;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;

@Singleton
public class JblStockServiceImpl implements JblStockService {

  @Inject private JblStockRepository stockRepository;
  @Inject private JblStockMovementRepository movementRepository;
  @Inject private JblNumberService numberService;

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblStock getOrCreateStock(Product product) {
    JblStock stock = stockRepository.all().filter("self.product = ?1", product).fetchOne();
    if (stock == null) {
      stock = new JblStock();
      stock.setProduct(product);
      stock.setQuantity(BigDecimal.ZERO);
      stock.setMinQuantity(BigDecimal.ZERO);
      stock = stockRepository.save(stock);
    }
    return stock;
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblStockMovement newMovement(
      Product product,
      BigDecimal quantity,
      int typeSelect,
      JblRepairOrder repairOrder,
      Partner supplier,
      String reference,
      String note) {
    JblStockMovement movement = new JblStockMovement();
    movement.setName(numberService.nextNumber("MOUV", "JblStockMovement"));
    movement.setTypeSelect(typeSelect);
    movement.setProduct(product);
    movement.setQuantity(quantity);
    movement.setMovementDate(LocalDate.now());
    movement.setRepairOrder(repairOrder);
    movement.setPartner(supplier);
    movement.setReference(reference);
    movement.setNote(note);
    movement.setStock(getOrCreateStock(product));
    movement.setApplied(false);
    return movementRepository.save(movement);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void applyMovement(JblStockMovement movement) {
    if (Boolean.TRUE.equals(movement.getApplied())) {
      return;
    }
    Product product = movement.getProduct();
    JblStock stock = movement.getStock() != null ? movement.getStock() : getOrCreateStock(product);
    BigDecimal current = stock.getQuantity() != null ? stock.getQuantity() : BigDecimal.ZERO;
    BigDecimal quantity =
        movement.getQuantity() != null ? movement.getQuantity() : BigDecimal.ZERO;
    int type = movement.getTypeSelect() != null ? movement.getTypeSelect() : TYPE_IN;

    BigDecimal delta;
    switch (type) {
      case TYPE_IN:
        delta = quantity;
        break;
      case TYPE_OUT:
        if (current.compareTo(quantity) < 0) {
          throw new AxelorRuntimeException(
              String.format(
                  "Stock insuffisant pour la pièce '%s' : disponible %s, demandé %s.",
                  product != null ? product.getName() : "?", current, quantity));
        }
        delta = quantity.negate();
        break;
      case TYPE_ADJUSTMENT:
        // la quantité du mouvement devient la nouvelle quantité réelle
        delta = quantity.subtract(current);
        break;
      default:
        throw new AxelorRuntimeException("Type de mouvement inconnu : " + type);
    }

    stock.setQuantity(current.add(delta));
    stockRepository.save(stock);

    movement.setStock(stock);
    movement.setApplied(true);
    movementRepository.save(movement);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void consumeParts(JblRepairOrder repairOrder) {
    if (repairOrder.getRepairLineList() == null) {
      return;
    }
    for (JblRepairLine line : repairOrder.getRepairLineList()) {
      if (line.getLineTypeSelect() != null
          && line.getLineTypeSelect() == RepairOrderService.LINE_PART
          && line.getProduct() != null) {
        BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
        JblStockMovement movement =
            newMovement(
                line.getProduct(),
                qty,
                TYPE_OUT,
                repairOrder,
                null,
                repairOrder.getName(),
                "Consommation sur OR " + repairOrder.getName());
        applyMovement(movement);
      }
    }
  }
}
