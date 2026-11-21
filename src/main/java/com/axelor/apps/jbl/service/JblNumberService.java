package com.axelor.apps.jbl.service;

import com.axelor.db.JPA;
import com.google.inject.Singleton;
import java.time.LocalDate;

/**
 * Génère les numéros lisibles des documents JBL : OR-2026-00001, DEV-2026-00001, FACT-2026-00001,
 * MOUV-2026-00001. V0 : numérotation par comptage annuel (remplacer par une Sequence AOP en V1).
 */
@Singleton
public class JblNumberService {

  public String nextNumber(String prefix, String entityName) {
    String year = String.valueOf(LocalDate.now().getYear());
    String pattern = prefix + "-" + year + "-%";
    Long count =
        JPA.em()
            .createQuery(
                "SELECT COUNT(e.id) FROM " + entityName + " e WHERE e.name LIKE :pattern",
                Long.class)
            .setParameter("pattern", pattern)
            .getSingleResult();
    return String.format("%s-%s-%05d", prefix, year, count + 1);
  }
}
