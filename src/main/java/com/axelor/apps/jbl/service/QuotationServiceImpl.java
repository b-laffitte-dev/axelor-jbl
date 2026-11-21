package com.axelor.apps.jbl.service;

import com.axelor.apps.jbl.db.JblQuotation;
import com.axelor.apps.jbl.db.JblQuotationLine;
import com.axelor.apps.jbl.db.repo.JblQuotationRepository;
import com.axelor.apps.jbl.db.JblRepairLine;
import com.axelor.apps.jbl.db.JblRepairOrder;
import com.axelor.apps.jbl.db.repo.JblRepairOrderRepository;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class QuotationServiceImpl implements QuotationService {

  @Inject private JblQuotationRepository quotationRepository;
  @Inject private JblRepairOrderRepository repairOrderRepository;
  @Inject private JblNumberService numberService;

  @Override
  @Transactional(rollbackOn = Exception.class)
  public JblRepairOrder createRepairOrder(JblQuotation quotation) {
    JblRepairOrder repairOrder = new JblRepairOrder();
    repairOrder.setName(numberService.nextNumber("OR", "JblRepairOrder"));
    repairOrder.setPartner(quotation.getPartner());
    repairOrder.setEquipment(quotation.getEquipment());
    repairOrder.setCompany(quotation.getCompany());
    repairOrder.setQuotation(quotation);
    repairOrder.setReceptionDate(LocalDate.now());
    repairOrder.setStatusSelect(RepairOrderService.STATUS_DRAFT);
    repairOrder.setVatRate(
        quotation.getVatRate() != null ? quotation.getVatRate() : new BigDecimal("20"));

    List<JblRepairLine> lines = new ArrayList<>();
    if (quotation.getLineList() != null) {
      for (JblQuotationLine line : quotation.getLineList()) {
        JblRepairLine rl = new JblRepairLine();
        rl.setRepairOrder(repairOrder);
        rl.setProduct(line.getProduct());
        rl.setDescription(line.getDescription());
        rl.setQuantity(line.getQuantity());
        rl.setUnitPriceHT(line.getUnitPriceHT());
        rl.setLineTypeSelect(
            line.getProduct() != null
                ? RepairOrderService.LINE_PART
                : RepairOrderService.LINE_FLAT);
        lines.add(rl);
      }
    }
    repairOrder.setRepairLineList(lines);

    repairOrder = repairOrderRepository.save(repairOrder);

    quotation.setRepairOrder(repairOrder);
    quotationRepository.save(quotation);
    return repairOrder;
  }

  @Override
  public void compute(JblQuotation quotation) {
    BigDecimal totalHT = BigDecimal.ZERO;
    if (quotation.getLineList() != null) {
      for (JblQuotationLine line : quotation.getLineList()) {
        BigDecimal qty = line.getQuantity() != null ? line.getQuantity() : BigDecimal.ONE;
        BigDecimal pu = line.getUnitPriceHT() != null ? line.getUnitPriceHT() : BigDecimal.ZERO;
        BigDecimal lineTotal = qty.multiply(pu);
        line.setTotalHT(lineTotal);
        totalHT = totalHT.add(lineTotal);
      }
    }
    quotation.setTotalHT(totalHT);
    BigDecimal vatRate = quotation.getVatRate() != null ? quotation.getVatRate() : BigDecimal.ZERO;
    BigDecimal vat =
        totalHT.multiply(vatRate).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    quotation.setTotalVAT(vat);
    quotation.setTotalTTC(totalHT.add(vat));
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void send(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_SENT);
    quotationRepository.save(quotation);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void accept(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_ACCEPTED);
    quotationRepository.save(quotation);
  }

  @Override
  @Transactional(rollbackOn = Exception.class)
  public void refuse(JblQuotation quotation) {
    quotation.setStatusSelect(STATUS_REFUSED);
    quotationRepository.save(quotation);
  }
}
