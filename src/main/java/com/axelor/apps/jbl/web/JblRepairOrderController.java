package com.axelor.apps.jbl.web;

import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.service.JblNumberService;
import com.axelor.apps.jbl.service.RepairOrderService;
import com.axelor.auth.db.User;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;

public class JblRepairOrderController {

  @Inject private RepairOrderService repairOrderService;
  @Inject private JblNumberService numberService;

  /** Valeurs par défaut à la création d'un OR. */
  public void onNew(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrder.setName(numberService.nextNumber("OR", "JblRepairOrder"));
    repairOrder.setReceptionDate(LocalDate.now());
    repairOrder.setStatusSelect(RepairOrderService.STATUS_DRAFT);
    repairOrder.setVatRate(new BigDecimal("20"));
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

  public void confirm(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.confirm(repairOrder);
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

  public void cancel(ActionRequest request, ActionResponse response) {
    JblRepairOrder repairOrder = request.getContext().asType(JblRepairOrder.class);
    repairOrderService.cancel(repairOrder);
    response.setReload(true);
  }
}
