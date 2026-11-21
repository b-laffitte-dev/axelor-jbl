package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.db.JblInvoiceLine;
import com.axelor.apps.jbl.db.repo.JblInvoiceRepository;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Singleton
public class JblInvoiceServiceImpl implements JblInvoiceService {

  @Inject private JblInvoiceRepository invoiceRepository;
  @Inject private RepairOrderService repairOrderService;

  @Override
  public void compute(JblInvoice invoice) {
    BigDecimal totalHT = BigDecimal.ZERO;
    if (invoice.getLineList() != null) {
      for (JblInvoiceLine line : invoice.getLineList()) {
        BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
        BigDecimal pu = line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO;
        BigDecimal lineTotal = qty.multiply(pu);
        line.setTotalHT(lineTotal);
        totalHT = totalHT.add(lineTotal);
      }
    }
    invoice.setTotalHT(totalHT);
    BigDecimal vatRate = invoice.getVatRate() != null ? invoice.getVatRate() : BigDecimal.ZERO;
    BigDecimal vat =
        totalHT.multiply(vatRate).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    invoice.setTotalVAT(vat);
    invoice.setTotalTTC(totalHT.add(vat));
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void validate(JblInvoice invoice) {
    compute(invoice);
    invoice.setStatusSelect(STATUS_VALIDATED);
    invoice = invoiceRepository.save(invoice);

    JblRepairOrder repairOrder = invoice.getRepairOrder();
    if (repairOrder != null) {
      repairOrder.setInvoice(invoice);
      repairOrderService.markInvoiced(repairOrder);
    }
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void recordPayment(JblInvoice invoice) {
    invoice.setStatusSelect(STATUS_PAID);
    invoice.setPaymentDate(LocalDate.now());
    invoiceRepository.save(invoice);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void cancel(JblInvoice invoice) {
    invoice.setStatusSelect(STATUS_CANCELED);
    invoiceRepository.save(invoice);
  }
}
