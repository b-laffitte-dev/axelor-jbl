package com.axelor.apps.jbl.service;

import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.db.JblInvoiceLine;
import com.axelor.apps.jbl.db.repo.JblInvoiceRepository;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.repo.JblRepairOrderRepository;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class RepairOrderServiceImpl implements RepairOrderService {

  @Inject private JblRepairOrderRepository repairOrderRepository;
  @Inject private JblInvoiceRepository invoiceRepository;
  @Inject private JblNumberService numberService;
  @Inject private JblInvoiceService invoiceService;
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
  public void startRepair(JblRepairOrder repairOrder) {
    repairOrder.setStatusSelect(STATUS_IN_PROGRESS);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void complete(JblRepairOrder repairOrder) throws AxelorMessageException {
    stockService.consumeParts(repairOrder);
    repairOrder.setStatusSelect(STATUS_DONE);
    repairOrderRepository.save(repairOrder);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblInvoice createInvoice(JblRepairOrder repairOrder) {
    JblInvoice invoice = new JblInvoice();
    invoice.setName(numberService.nextNumber("FACT", "JblInvoice"));
    invoice.setPartner(repairOrder.getPartner());
    invoice.setCompany(repairOrder.getCompany());
    invoice.setRepairOrder(repairOrder);
    invoice.setQuotation(repairOrder.getQuotation());
    invoice.setInvoiceDate(LocalDate.now());
    invoice.setDueDate(LocalDate.now().plusDays(30));
    invoice.setStatusSelect(JblInvoiceService.STATUS_DRAFT);
    invoice.setVatRate(
        repairOrder.getVatRate() != null ? repairOrder.getVatRate() : new BigDecimal("20"));

    List<JblInvoiceLine> lines = new ArrayList<>();
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        JblInvoiceLine il = new JblInvoiceLine();
        il.setInvoice(invoice);
        il.setProduct(line.getProduct());
        il.setDescription(line.getDescription());
        il.setQuantity(line.getQuantity());
        il.setUnitPriceHT(line.getUnitPriceHT());
        lines.add(il);
      }
    }
    invoice.setLineList(lines);

    invoiceService.compute(invoice);
    invoice = invoiceRepository.save(invoice);

    repairOrder.setInvoice(invoice);
    repairOrderRepository.save(repairOrder);
    return invoice;
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
