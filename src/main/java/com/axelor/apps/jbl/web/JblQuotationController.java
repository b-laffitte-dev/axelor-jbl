package com.axelor.apps.jbl.web;

import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.db.JblRepairOrder;
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

  /** Génère l'ordre de réparation depuis le devis accepté et ouvre l'OR créé. */
  public void createRepairOrder(ActionRequest request, ActionResponse response) {
    JblQuotation quotation = request.getContext().asType(JblQuotation.class);
    JblRepairOrder repairOrder = quotationService.createRepairOrder(quotation);
    response.setReload(true);
    response.setView(
        com.axelor.meta.schema.actions.ActionView.define("Ordre de réparation " + repairOrder.getName())
            .model("com.axelor.apps.jbl.db.JblRepairOrder")
            .add("form", "jbl-repair-order-form")
            .param("forceEdit", "true")
            .context("_showRecord", String.valueOf(repairOrder.getId()))
            .map());
  }
}
