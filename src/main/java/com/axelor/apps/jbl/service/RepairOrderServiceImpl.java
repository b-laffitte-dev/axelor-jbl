package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.JblRepairOrderRepository;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Singleton
public class RepairOrderServiceImpl implements RepairOrderService {

  @Inject private JblRepairOrderRepository repairOrderRepository;
  @Inject private QuotationService quotationService;
  @Inject private JblStockService stockService;

  @Override
  public void compute(JblRepairOrder repairOrder) {
    BigDecimal totalHT = BigDecimal.ZERO;
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        BigDecimal lineTotal = computeLineTotal(line);
        line.setTotalHT(lineTotal);
        totalHT = totalHT.add(lineTotal);
      }
    }
    repairOrder.setTotalHT(totalHT);

    BigDecimal vatRate =
        repairOrder.getVatRate() != null ? repairOrder.getVatRate() : BigDecimal.ZERO;
    BigDecimal vat =
        totalHT.multiply(vatRate).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    repairOrder.setTotalVAT(vat);
    repairOrder.setTotalTTC(totalHT.add(vat));
  }

  private BigDecimal computeLineTotal(JblRepairLine line) {
    BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
    BigDecimal pu = line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO;
    return qty.multiply(pu);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void confirm(JblRepairOrder repairOrder) {
    compute(repairOrder);
    JblQuotation quotation = quotationService.createFromRepairOrder(repairOrder);
    repairOrder.setQuotation(quotation);
    repairOrder.setStatusSelect(STATUS_QUOTATION_SENT);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void startRepair(JblRepairOrder repairOrder) {
    repairOrder.setStatusSelect(STATUS_IN_PROGRESS);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void complete(JblRepairOrder repairOrder) {
    stockService.consumeParts(repairOrder);
    repairOrder.setStatusSelect(STATUS_DONE);
    repairOrderRepository.save(repairOrder);
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
