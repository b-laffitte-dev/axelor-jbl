package com.axelor.apps.jbl.web;

import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.service.RepairOrderService;
import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.auth.db.User;
import com.axelor.meta.schema.actions.ActionView;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import java.time.LocalDate;

public class JblRepairOrderController {

  @Inject private RepairOrderService repairOrderService;

  /** Valeurs par défaut à la création d'un OR (le n° est posé par le repository via Sequence). */
  public void onNew(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrder.setReceptionDate(LocalDate.now());
    repairOrder.setStatusSelect(RepairOrderService.STATUS_DRAFT);
    User user = request.getUser();
    if (user != null && user.getActiveCompany() != null) {
      repairOrder.setCompany(user.getActiveCompany());
    }
  }

  public void compute(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.compute(repairOrder);
    response.setReload(true);
  }

  public void startRepair(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.startRepair(repairOrder);
    response.setReload(true);
  }

  public void complete(ActionRequest request, ActionResponse response) throws AxelorMessageException {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.complete(repairOrder);
    response.setReload(true);
  }

  /** Génère la facture (account.Invoice) depuis l'OR terminé et ouvre la facture créée. */
  public void createInvoice(ActionRequest request, ActionResponse response)
      throws AxelorMessageException {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    Invoice invoice = repairOrderService.createInvoice(repairOrder);
    response.setReload(true);
    response.setView(
        ActionView.define("Facture " + invoice.getInvoiceId())
            .model("com.axelor.apps.account.db.Invoice")
            .add("form", "invoice-form")
            .param("forceEdit", "true")
            .context("_showRecord", String.valueOf(invoice.getId()))
            .map());
  }

  /** Génère le devis (sale.SaleOrder) depuis l'OR et ouvre le devis créé. */
  public void createQuotation(ActionRequest request, ActionResponse response)
      throws AxelorMessageException {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    SaleOrder saleOrder = repairOrderService.createQuotation(repairOrder);
    response.setReload(true);
    response.setView(
        ActionView.define("Devis " + saleOrder.getSaleOrderSeq())
            .model("com.axelor.apps.sale.db.SaleOrder")
            .add("form", "sale-order-form")
            .param("forceEdit", "true")
            .context("_showRecord", String.valueOf(saleOrder.getId()))
            .map());
  }

  public void cancel(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.cancel(repairOrder);
    response.setReload(true);
  }
}
