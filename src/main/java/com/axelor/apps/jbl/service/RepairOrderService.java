package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblRepairOrder;

public interface RepairOrderService {

  // Statuts de l'ordre de réparation (miroir de la sélection jbl.repair.order.status.select)
  int STATUS_DRAFT = 0;
  int STATUS_QUOTATION_SENT = 1;
  int STATUS_IN_PROGRESS = 2;
  int STATUS_DONE = 3;
  int STATUS_INVOICED = 4;
  int STATUS_CANCELED = 5;

  // Types de ligne (miroir de jbl.repair.line.type.select)
  int LINE_PART = 0;
  int LINE_LABOR = 1;
  int LINE_FLAT = 2;

  /** Recalcule les totaux de l'OR à partir de ses lignes (HT, TVA, TTC). */
  void compute(JblRepairOrder repairOrder);

  /** Confirme l'OR : génère le devis à partir des lignes et passe le statut à "Devis envoyé". */
  void confirm(JblRepairOrder repairOrder);

  /** Passe l'OR en "Réparation en cours". */
  void startRepair(JblRepairOrder repairOrder);

  /** Termine l'OR : consomme les pièces détachées en stock, puis passe à "Terminée". */
  void complete(JblRepairOrder repairOrder);

  /** Marque l'OR comme facturé (appelé à la validation de la facture). */
  void markInvoiced(JblRepairOrder repairOrder);

  /** Annule l'OR. */
  void cancel(JblRepairOrder repairOrder);
}
