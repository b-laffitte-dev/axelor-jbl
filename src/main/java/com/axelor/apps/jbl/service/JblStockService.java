package com.axelor.apps.jbl.service;

import com.axelor.apps.base.AxelorMessageException;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.db.Product;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.JblStock;
import com.axelor.apps.jbl.db.JblStockMovement;
import java.math.BigDecimal;

public interface JblStockService {

  // Types de mouvement (miroir de jbl.stock.movement.type.select)
  int TYPE_IN = 0;
  int TYPE_OUT = 1;
  int TYPE_ADJUSTMENT = 2;

  /** Retourne la ligne de stock du produit, la crée à 0 si absente. */
  JblStock getOrCreateStock(Product product);

  /** Crée un mouvement de stock (non encore appliqué). */
  JblStockMovement newMovement(
      Product product,
      BigDecimal quantity,
      int typeSelect,
      JblRepairOrder repairOrder,
      Partner supplier,
      String reference,
      String note);

  /** Applique un mouvement au stock (met à jour la quantité, marque le mouvement appliqué). */
  void applyMovement(JblStockMovement movement) throws AxelorMessageException;

  /** Crée et applique les sorties de stock pour toutes les lignes "pièce" d'un OR. */
  void consumeParts(JblRepairOrder repairOrder) throws AxelorMessageException;
}
