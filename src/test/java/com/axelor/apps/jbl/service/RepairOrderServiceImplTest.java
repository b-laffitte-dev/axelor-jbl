package com.axelor.apps.jbl.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Tests unitaires de la logique métier de {@link RepairOrderServiceImpl}.
 * La méthode {@code compute()} est pure (calcul sur l'objet passé) : on instancie
 * le service directement, sans conteneur Guice ni base de données.
 */
class RepairOrderServiceImplTest {

  private final RepairOrderServiceImpl service = new RepairOrderServiceImpl();

  @Test
  void testCompute_sansLignes_totalZero() {
    JblRepairOrder order = new JblRepairOrder();
    order.setRepairLineList(null);

    service.compute(order);

    assertEquals(BigDecimal.ZERO, order.getTotalHT());
  }

  @Test
  void testCompute_listeVide_totalZero() {
    JblRepairOrder order = new JblRepairOrder();
    order.setRepairLineList(new ArrayList<>());

    service.compute(order);

    assertEquals(BigDecimal.ZERO, order.getTotalHT());
  }

  @Test
  void testCompute_deuxLignes_totalSommeDesLignes() {
    JblRepairOrder order = new JblRepairOrder();
    List<JblRepairLine> lines = new ArrayList<>();

    JblRepairLine line1 = new JblRepairLine();
    line1.setQuantity(new BigDecimal("2"));
    line1.setUnitPriceHT(new BigDecimal("10.50"));
    lines.add(line1);

    JblRepairLine line2 = new JblRepairLine();
    line2.setQuantity(new BigDecimal("1"));
    line2.setUnitPriceHT(new BigDecimal("100"));
    lines.add(line2);

    order.setRepairLineList(lines);

    service.compute(order);

    // 2 * 10.50 + 1 * 100 = 121.00
    assertEquals(0, new BigDecimal("121.00").compareTo(order.getTotalHT()));
    assertEquals(0, new BigDecimal("21.00").compareTo(line1.getTotalHT()));
    assertEquals(0, new BigDecimal("100.00").compareTo(line2.getTotalHT()));
  }

  @Test
  void testCompute_quantiteOuPrixNull_gefaultAUnOuZero() {
    JblRepairOrder order = new JblRepairOrder();
    List<JblRepairLine> lines = new ArrayList<>();

    JblRepairLine line = new JblRepairLine();
    line.setQuantity(null); // défaut à 1 dans le calcul
    line.setUnitPriceHT(null); // défaut à 0
    lines.add(line);

    order.setRepairLineList(lines);

    service.compute(order);

    assertEquals(0, BigDecimal.ZERO.compareTo(order.getTotalHT()));
    assertEquals(0, BigDecimal.ZERO.compareTo(line.getTotalHT()));
  }
}
