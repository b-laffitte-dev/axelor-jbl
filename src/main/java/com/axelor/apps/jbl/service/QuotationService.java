package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblInvoice;
import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.db.JblRepairOrder;

public interface QuotationService {

  // Statuts du devis (miroir de jbl.quotation.status.select)
  int STATUS_DRAFT = 0;
  int STATUS_SENT = 1;
  int STATUS_ACCEPTED = 2;
  int STATUS_REFUSED = 3;

  /** Crée un devis à partir des lignes d'un ordre de réparation. */
  JblQuotation createFromRepairOrder(JblRepairOrder repairOrder);

  /** Recalcule les totaux du devis. */
  void compute(JblQuotation quotation);

  void send(JblQuotation quotation);

  void accept(JblQuotation quotation);

  void refuse(JblQuotation quotation);

  /** Génère la facture à partir d'un devis accepté. */
  JblInvoice createInvoice(JblQuotation quotation);
}
