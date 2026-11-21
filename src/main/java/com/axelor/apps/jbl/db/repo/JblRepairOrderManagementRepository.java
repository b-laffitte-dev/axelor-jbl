package com.axelor.apps.jbl.db.repo;

import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.db.JpaSequence;

/**
 * Attribue le numéro d'OR via la séquence AOP "jbl.repair.order.seq" (MetaSequence, créée en
 * data-init) : OR-00001, OR-00002...
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
