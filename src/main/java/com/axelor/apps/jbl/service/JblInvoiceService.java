package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblInvoice;

public interface JblInvoiceService {

  // Statuts de la facture (miroir de jbl.invoice.status.select)
  int STATUS_DRAFT = 0;
  int STATUS_VALIDATED = 1;
  int STATUS_PAID = 2;
  int STATUS_CANCELED = 3;

  /** Recalcule les totaux de la facture. */
  void compute(JblInvoice invoice);

  /** Valide la facture et marque l'OR lié comme facturé. */
  void validate(JblInvoice invoice);

  /** Enregistre le paiement (statut "Payée", date de règlement = aujourd'hui). */
  void recordPayment(JblInvoice invoice);

  void cancel(JblInvoice invoice);
}
