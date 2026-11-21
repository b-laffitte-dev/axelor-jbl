package com.axelor.apps.jbl.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.jbl.service.JblInvoiceService;
import com.axelor.apps.jbl.service.JblInvoiceServiceImpl;
import com.axelor.apps.jbl.service.JblStockService;
import com.axelor.apps.jbl.service.JblStockServiceImpl;
import com.axelor.apps.jbl.service.QuotationService;
import com.axelor.apps.jbl.service.QuotationServiceImpl;
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
    bind(QuotationService.class).to(QuotationServiceImpl.class);
    bind(JblInvoiceService.class).to(JblInvoiceServiceImpl.class);
    bind(JblStockService.class).to(JblStockServiceImpl.class);
  }
}
