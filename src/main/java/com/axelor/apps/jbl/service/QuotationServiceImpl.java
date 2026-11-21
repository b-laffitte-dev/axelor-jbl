package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.db.JblInvoiceLine;
import com.axelor.apps.jbl.db.JblInvoiceRepository;
import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.db.JblQuotationLine;
import com.axelor.apps.jbl.db.JblQuotationRepository;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class QuotationServiceImpl implements QuotationService {

  @Inject private JblQuotationRepository quotationRepository;
  @Inject private JblInvoiceRepository invoiceRepository;
  @Inject private JblNumberService numberService;
  @Inject private JblInvoiceService invoiceService;

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblQuotation createFromRepairOrder(JblRepairOrder repairOrder) {
    JblQuotation quotation = new JblQuotation();
    quotation.setName(numberService.nextNumber("DEV", "JblQuotation"));
    quotation.setPartner(repairOrder.getPartner());
    quotation.setCompany(repairOrder.getCompany());
    quotation.setRepairOrder(repairOrder);
    quotation.setQuotationDate(LocalDate.now());
    quotation.setValidUntil(LocalDate.now().plusDays(30));
    quotation.setStatusSelect(STATUS_DRAFT);
    quotation.setVatRate(
        repairOrder.getVatRate() != null ? repairOrder.getVatRate() : new BigDecimal("20"));

    List<JblQuotationLine> lines = new ArrayList<>();
    if (repairOrder.getRepairLineList() != null) {
      for (JblRepairLine line : repairOrder.getRepairLineList()) {
        JblQuotationLine ql = new JblQuotationLine();
        ql.setQuotation(quotation);
        ql.setProduct(line.getProduct());
        ql.setDescription(line.getDescription());
        ql.setQuantity(line.getQuantity());
        ql.setUnitPriceHT(line.getUnitPriceHT());
        lines.add(ql);
      }
    }
    quotation.setLineList(lines);

    compute(quotation);
    return quotationRepository.save(quotation);
  }

  @Override
  public void compute(JblQuotation quotation) {
    BigDecimal totalHT = BigDecimal.ZERO;
    if (quotation.getLineList() != null) {
      for (JblQuotationLine line : quotation.getLineList()) {
        BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
        BigDecimal pu = line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO;
        BigDecimal lineTotal = qty.multiply(pu);
        line.setTotalHT(lineTotal);
        totalHT = totalHT.add(lineTotal);
      }
    }
    quotation.setTotalHT(totalHT);
    BigDecimal vatRate = quotation.getVatRate() != null ? quotation.getVatRate() : BigDecimal.ZERO;
    BigDecimal vat =
        totalHT.multiply(vatRate).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    quotation.setTotalVAT(vat);
    quotation.setTotalTTC(totalHT.add(vat));
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void send(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_SENT);
    quotationRepository.save(quotation);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void accept(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_ACCEPTED);
    quotationRepository.save(quotation);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void refuse(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_REFUSED);
    quotationRepository.save(quotation);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblInvoice createInvoice(JblQuotation quotation) {
    JblInvoice invoice = new JblInvoice();
    invoice.setName(numberService.nextNumber("FACT", "JblInvoice"));
    invoice.setPartner(quotation.getPartner());
    invoice.setCompany(quotation.getCompany());
    invoice.setQuotation(quotation);
    invoice.setRepairOrder(quotation.getRepairOrder());
    invoice.setInvoiceDate(LocalDate.now());
    invoice.setDueDate(LocalDate.now().plusDays(30));
    invoice.setStatusSelect(JblInvoiceService.STATUS_DRAFT);
    invoice.setVatRate(
        quotation.getVatRate() != null ? quotation.getVatRate() : new BigDecimal("20"));

    List<JblInvoiceLine> lines = new ArrayList<>();
    if (quotation.getLineList() != null) {
      for (JblQuotationLine line : quotation.getLineList()) {
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

    quotation.setInvoice(invoice);
    quotationRepository.save(quotation);

    if (quotation.getRepairOrder() != null) {
      JblRepairOrder repairOrder = quotation.getRepairOrder();
      repairOrder.setInvoice(invoice);
    }
    return invoice;
  }
}
