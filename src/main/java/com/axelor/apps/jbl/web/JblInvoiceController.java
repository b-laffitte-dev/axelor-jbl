package com.axelor.apps.jbl.web;

import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.service.JblInvoiceService;
import com.axelor.apps.jbl.service.JblNumberService;
import com.axelor.auth.db.User;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;

public class JblInvoiceController {

  @Inject private JblInvoiceService invoiceService;
  @Inject private JblNumberService numberService;

  public void onNew(ActionRequest request, ActionResponse response) {
    JblInvoice invoice = request.getContext().asType(JblInvoice.class);
    invoice.setName(numberService.nextNumber("FACT", "JblInvoice"));
    invoice.setInvoiceDate(LocalDate.now());
    invoice.setDueDate(LocalDate.now().plusDays(30));
    invoice.setStatusSelect(JblInvoiceService.STATUS_DRAFT);
    invoice.setVatRate(new BigDecimal("20"));
    User user = request.getUser();
    if (user != null && user.getActiveCompany() != null) {
      invoice.setCompany(user.getActiveCompany());
    }
  }

  public void compute(ActionRequest request, ActionResponse response) {
    JblInvoice invoice = request.getContext().asType(JblInvoice.class);
    invoiceService.compute(invoice);
    response.setReload(true);
  }

  public void validate(ActionRequest request, ActionResponse response) {
    JblInvoice invoice = request.getContext().asType(JblInvoice.class);
    invoiceService.validate(invoice);
    response.setReload(true);
  }

  public void recordPayment(ActionRequest request, ActionResponse response) {
    JblInvoice invoice = request.getContext().asType(JblInvoice.class);
    invoiceService.recordPayment(invoice);
    response.setReload(true);
  }

  public void cancel(ActionRequest request, ActionResponse response) {
    JblInvoice invoice = request.getContext().asType(JblInvoice.class);
    invoiceService.cancel(invoice);
    response.setReload(true);
  }
}
