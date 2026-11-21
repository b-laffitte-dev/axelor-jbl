package com.axelor.apps.jbl.service;

import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.account.db.InvoiceLine;
import com.axelor.apps.account.db.repo.InvoiceLineRepository;
import com.axelor.apps.account.db.repo.InvoiceRepository;
import com.axelor.apps.account.service.invoice.InvoiceService;
import com.axelor.apps.base.AxelorException;
import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.base.db.Company;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.db.Product;
import com.axelor.apps.base.db.repo.TraceBackRepository;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.repo.JblRepairOrderRepository;
import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.apps.sale.db.SaleOrderLine;
import com.axelor.apps.sale.db.repo.SaleOrderRepository;
import com.axelor.apps.sale.service.saleorder.SaleOrderComputeService;
import com.axelor.apps.stock.db.StockLocation;
import com.axelor.apps.stock.db.StockMove;
import com.axelor.apps.stock.db.StockMoveLine;
import com.axelor.apps.stock.db.repo.StockLocationRepository;
import com.axelor.apps.stock.db.repo.StockMoveRepository;
import com.axelor.apps.stock.service.StockMoveService;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class RepairOrderServiceImpl implements RepairOrderService {

  // StockMove.typeSelect : 1 = mouvement interne ; StockLocation.typeSelect : 1 = interne, 3 = virtuel
  private static final int STOCK_MOVE_TYPE_INTERNAL = 1;
  private static final int STOCK_MOVE_STATUS_DRAFT = 1;
  private static final int LOCATION_TYPE_INTERNAL = 1;
  private static final int LOCATION_TYPE_VIRTUAL = 3;
  // SaleOrder.statusSelect : 1 = devis brouillon
  private static final int SALE_ORDER_STATUS_DRAFT_QUOTATION = 1;

  @Inject private JblRepairOrderRepository repairOrderRepository;
  @Inject private StockMoveRepository stockMoveRepository;
  @Inject private StockMoveService stockMoveService;
  @Inject private StockLocationRepository stockLocationRepository;
  @Inject private InvoiceRepository invoiceRepository;
  @Inject private InvoiceService invoiceService;
  @Inject private SaleOrderRepository saleOrderRepository;
  @Inject private SaleOrderComputeService saleOrderComputeService;

  @Override
  public void compute(JblRepairOrder repairOrder) {
    BigDecimal totalHT = BigDecimal.ZERO;
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
        BigDecimal pu = line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO;
        BigDecimal lineTotal = qty.multiply(pu);
        line.setTotalHT(lineTotal);
        totalHT = totalHT.add(lineTotal);
      }
    }
    repairOrder.setTotalHT(totalHT);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void startRepair(JblRepairOrder repairOrder) {
    repairOrder.setStatusSelect(STATUS_IN_PROGRESS);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void complete(JblRepairOrder repairOrder) throws AxelorMessageException {
    StockMove move = consumeParts(repairOrder);
    if (move != null) {
      repairOrder.setStockMove(move);
    }
    repairOrder.setStatusSelect(STATUS_DONE);
    repairOrderRepository.save(repairOrder);
  }

  /**
   * Consomme les pièces détachées de l'OR via un mouvement de stock interne
   * (magasin -> emplacement virtuel "atelier") réalisé avec axelor-stock :
   * le contrôle de disponibilité et la mise à jour des niveaux de stock sont natifs.
   */
  private StockMove consumeParts(JblRepairOrder repairOrder) throws AxelorMessageException {
    List<JblRepairLine> parts = new ArrayList<>();
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        if (line.getLineTypeSelect() != null
            && line.getLineTypeSelect() == LINE_PART
            && line.getProduct() != null) {
          parts.add(line);
        }
      }
    }
    if (parts.isEmpty()) {
      return null;
    }

    Company company = repairOrder.getCompany();
    StockLocation from = getOrCreateLocation(company, "Magasin atelier", LOCATION_TYPE_INTERNAL);
    StockLocation to = getOrCreateLocation(company, "Atelier (pièces consommées)", LOCATION_TYPE_VIRTUAL);

    StockMove move = new StockMove();
    move.setCompany(company);
    move.setTypeSelect(STOCK_MOVE_TYPE_INTERNAL);
    move.setStatusSelect(STOCK_MOVE_STATUS_DRAFT);
    move.setFromStockLocation(from);
    move.setToStockLocation(to);
    move.setEstimatedDate(LocalDate.now());
    move.setRealDate(LocalDate.now());
    move.setName("Conso OR " + repairOrder.getName());

    List<StockMoveLine> moveLines = new ArrayList<>();
    for (JblRepairLine line : parts) {
      Product product = line.getProduct();
      BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
      StockMoveLine ml = new StockMoveLine();
      ml.setStockMove(move);
      ml.setProduct(product);
      ml.setProductName(product.getName());
      ml.setDescription(line.getDescription());
      ml.setQty(qty);
      ml.setRealQty(qty);
      ml.setUnit(product.getUnit());
      ml.setFromStockLocation(from);
      ml.setToStockLocation(to);
      moveLines.add(ml);
    }
    move.setStockMoveLineList(moveLines);
    move = stockMoveRepository.save(move);

    try {
      stockMoveService.realize(move);
    } catch (AxelorException e) {
      throw new AxelorMessageException(
          TraceBackRepository.CATEGORY_INCONSISTENCY,
          "Impossible de consommer les pièces (stock insuffisant ?) : " + e.getMessage());
    }
    return stockMoveRepository.save(move);
  }

  private StockLocation getOrCreateLocation(Company company, String name, int typeSelect) {
    StockLocation location =
        company != null
            ? stockLocationRepository
                .all()
                .filter("self.name = ?1 AND self.company = ?2", name, company)
                .fetchOne()
            : stockLocationRepository
                .all()
                .filter("self.name = ?1 AND self.company IS NULL", name)
                .fetchOne();
    if (location == null) {
      location = new StockLocation();
      location.setName(name);
      location.setTypeSelect(typeSelect);
      location.setCompany(company);
      location = stockLocationRepository.save(location);
    }
    return location;
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public Invoice createInvoice(JblRepairOrder repairOrder) throws AxelorMessageException {
    Partner partner = repairOrder.getPartner();
    Company company = repairOrder.getCompany();

    Invoice invoice = new Invoice();
    invoice.setPartner(partner);
    invoice.setCompany(company);
    invoice.setInvoiceDate(LocalDate.now());
    invoice.setDueDate(LocalDate.now().plusDays(30));
    invoice.setOperationTypeSelect(InvoiceRepository.OPERATION_TYPE_CLIENT_SALE);
    invoice.setOperationSubTypeSelect(1); // facture standard
    invoice.setStatusSelect(InvoiceRepository.STATUS_DRAFT);
    if (company != null && company.getCurrency() != null) {
      invoice.setCurrency(company.getCurrency());
    }
    if (partner != null) {
      invoice.setPaymentMode(partner.getOutPaymentMode());
      invoice.setPaymentCondition(partner.getOutPaymentCondition());
      invoice.setAddress(partner.getMainAddress());
    }

    List<InvoiceLine> lines = new ArrayList<>();
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        Product product = line.getProduct();
        InvoiceLine il = new InvoiceLine();
        il.setInvoice(invoice);
        il.setTypeSelect(InvoiceLineRepository.TYPE_NORMAL);
        il.setProduct(product);
        il.setProductName(product != null ? product.getName() : line.getDescription());
        il.setDescription(line.getDescription());
        il.setQty(line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE);
        il.setPrice(line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO);
        if (product != null) {
          il.setUnit(product.getUnit());
        }
        lines.add(il);
      }
    }
    invoice.setInvoiceLineList(lines);
    invoice = invoiceRepository.save(invoice);

    try {
      invoiceService.compute(invoice); // totaux HT/TVA/TTC + lignes de taxe natifs axelor-account
    } catch (AxelorException e) {
      throw new AxelorMessageException(
          TraceBackRepository.CATEGORY_INCONSISTENCY,
          "Erreur de calcul de la facture : " + e.getMessage());
    }
    invoice = invoiceRepository.save(invoice);

    repairOrder.setInvoice(invoice);
    repairOrderRepository.save(repairOrder);
    return invoice;
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public SaleOrder createQuotation(JblRepairOrder repairOrder) throws AxelorMessageException {
    Partner partner = repairOrder.getPartner();
    Company company = repairOrder.getCompany();

    SaleOrder saleOrder = new SaleOrder();
    saleOrder.setClientPartner(partner);
    saleOrder.setCompany(company);
    if (company != null && company.getCurrency() != null) {
      saleOrder.setCurrency(company.getCurrency());
    }
    saleOrder.setCreationDate(LocalDate.now());
    saleOrder.setOrderDate(LocalDate.now());
    saleOrder.setStatusSelect(SALE_ORDER_STATUS_DRAFT_QUOTATION);
    saleOrder.setEndOfValidityDate(LocalDate.now().plusDays(30));
    saleOrder.setTitle("Devis réparation " + repairOrder.getName());

    List<SaleOrderLine> lines = new ArrayList<>();
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        Product product = line.getProduct();
        SaleOrderLine sl = new SaleOrderLine();
        sl.setSaleOrder(saleOrder);
        sl.setProduct(product);
        sl.setProductName(product != null ? product.getName() : line.getDescription());
        sl.setDescription(line.getDescription());
        sl.setQty(line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE);
        sl.setPrice(line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO);
        if (product != null) {
          sl.setUnit(product.getUnit());
        }
        lines.add(sl);
      }
    }
    saleOrder.setSaleOrderLineList(lines);
    saleOrder = saleOrderRepository.save(saleOrder);

    try {
      saleOrderComputeService.computeSaleOrder(saleOrder); // totaux natifs axelor-sale
    } catch (AxelorException e) {
      throw new AxelorMessageException(
          TraceBackRepository.CATEGORY_INCONSISTENCY,
          "Erreur de calcul du devis : " + e.getMessage());
    }
    saleOrder = saleOrderRepository.save(saleOrder);

    repairOrder.setQuotation(saleOrder);
    repairOrderRepository.save(repairOrder);
    return saleOrder;
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void markInvoiced(JblRepairOrder repairOrder) {
    repairOrder.setStatusSelect(STATUS_INVOICED);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void cancel(JblRepairOrder repairOrder) {
    repairOrder.setStatusSelect(STATUS_CANCELED);
    repairOrderRepository.save(repairOrder);
  }
}
