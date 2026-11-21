package com.axelor.apps.jbl.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.jbl.db.repo.JblRepairOrderManagementRepository;
import com.axelor.apps.jbl.db.repo.JblRepairOrderRepository;
import com.axelor.apps.jbl.service.RepairOrderService;
import com.axelor.apps.jbl.service.RepairOrderServiceImpl;

/**
 * Module métier JBL Atelier. Les entités (com.axelor.apps.jbl.db.*) et leurs repositories sont
 * générés automatiquement par AOP à partir de src/main/resources/domains/Jbl.xml.
 */
public class JblModule extends AxelorModule {

  @Override
  protected void configure() {
    bind(RepairOrderService.class).to(RepairOrderServiceImpl.class);
    // Numérotation des OR via base.Sequence (JpaSequence.nextValue("jbl.repair.order.seq"))
    bind(JblRepairOrderRepository.class).to(JblRepairOrderManagementRepository.class);
  }
}
