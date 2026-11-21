package com.axelor.apps.jbl.db.repo;

import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.db.JpaSequence;

/**
 * Attribue le numéro d'OR via la séquence AOP "jbl.repair.order.seq" (base.Sequence, créée en
 * data-init) : OR-2026-00001, OR-2026-00002... Pattern identique à EquipmentRepository
 * (axelor-intervention).
 */
public class JblRepairOrderManagementRepository extends JblRepairOrderRepository {

  @Override
  public JblRepairOrder save(JblRepairOrder entity) {
    if (entity.getName() == null || entity.getName().isEmpty()) {
      entity.setName(JpaSequence.nextValue("jbl.repair.order.seq"));
    }
    return super.save(entity);
  }
}
