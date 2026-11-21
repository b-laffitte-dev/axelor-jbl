package com.axelor.apps.jbl.web;

import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.jbl.db.JblStockMovement;
import com.axelor.apps.jbl.service.JblNumberService;
import com.axelor.apps.jbl.service.JblStockService;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import java.time.LocalDate;

public class JblStockController {

  @Inject private JblStockService stockService;
  @Inject private JblNumberService numberService;

  public void onNew(ActionRequest request, ActionResponse response) {
    JblStockMovement movement = request.getContext().asType(JblStockMovement.class);
    movement.setName(numberService.nextNumber("MOUV", "JblStockMovement"));
    movement.setMovementDate(LocalDate.now());
    movement.setTypeSelect(JblStockService.TYPE_IN);
    movement.setApplied(false);
  }

  /** Applique le mouvement saisi au stock de la pièce. */
  public void apply(ActionRequest request, ActionResponse response) throws AxelorMessageException {
    JblStockMovement movement = request.getContext().asType(JblStockMovement.class);
    stockService.applyMovement(movement);
    response.setReload(true);
  }
}
