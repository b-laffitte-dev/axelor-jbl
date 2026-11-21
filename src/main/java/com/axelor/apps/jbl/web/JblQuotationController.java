package com.axelor.apps.jbl.web;

import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.service.JblNumberService;
import com.axelor.apps.jbl.service.QuotationService;
import com.axelor.auth.db.User;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;

public class JblQuotationController {

  @Inject private QuotationService quotationService;
  @Inject private JblNumberService numberService;

  public void onNew(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    quotation.setName(numberService.nextNumber("DEV", "JblQuotation"));
    quotation.setQuotationDate(LocalDate.now());
    quotation.setValidUntil(LocalDate.now().plusDays(30));
    quotation.setStatusSelect(QuotationService.STATUS_DRAFT);
    quotation.setVatRate(new BigDecimal("20"));
    User user = request.getUser();
    if (user != null && user.getActiveCompany() != null) {
      quotation.setCompany(user.getActiveCompany());
    }
  }

  public void compute(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    quotationService.compute(quotation);
    response.setReload(true);
  }

  public void send(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    quotationService.send(quotation);
    response.setReload(true);
  }

  public void accept(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    quotationService.accept(quotation);
    response.setReload(true);
  }

  public void refuse(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    quotationService.refuse(quotation);
    response.setReload(true);
  }

  public void createInvoice(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    JblInvoice invoice = quotationService.createInvoice(quotation);
    response.setReload(true);
    response.setView(
        com.axelor.rpc.ActionView.define("Facture " + invoice.getName())
            .model("com.axelor.apps.jbl.db.JblInvoice")
            .add("form", "jbl-invoice-form")
            .param("forceEdit", "true")
            .context("_showRecord", String.valueOf(invoice.getId()))
            .build());
  }
}
