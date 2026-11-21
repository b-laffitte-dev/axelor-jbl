package com.axelor.apps.jbl.service;

import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.sale.db.SaleOrder;

public interface RepairOrderService {

  // Statuts de l'ordre de réparation (miroir de la sélection jbl.repair.order.status.select)
  int STATUS_DRAFT = 0;
  int STATUS_IN_PROGRESS = 1;
  int STATUS_DONE = 2;
  int STATUS_INVOICED = 3;
  int STATUS_CANCELED = 4;

  // Types de ligne (miroir de jbl.repair.line.type.select)
  int LINE_PART = 0;
  int LINE_LABOR = 1;
  int LINE_FLAT = 2;

  /** Recalcule le total HT indicatif de l'OR à partir de ses lignes. */
  void compute(JblRepairOrder repairOrder);

  /** Passe l'OR en "Réparation en cours". */
  void startRepair(JblRepairOrder repairOrder);

  /** Termine l'OR : consomme les pièces détachées via un StockMove (axelor-stock), puis "Terminée". */
  void complete(JblRepairOrder repairOrder) throws AxelorMessageException;

  /** Génère la facture (account.Invoice) à partir des lignes de l'OR (OR "Terminée"). */
  Invoice createInvoice(JblRepairOrder repairOrder) throws AxelorMessageException;

  /** Génère le devis (sale.SaleOrder) à partir des lignes de l'OR. */
  SaleOrder createQuotation(JblRepairOrder repairOrder) throws AxelorMessageException;

  /** Marque l'OR comme facturé. */
  void markInvoiced(JblRepairOrder repairOrder);

  /** Annule l'OR. */
  void cancel(JblRepairOrder repairOrder);
}
