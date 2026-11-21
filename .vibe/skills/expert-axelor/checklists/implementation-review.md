# Checklist de contrôle d'une implémentation (technique + fonctionnelle)

À dérouler à **chaque** demande sur axelor-jbl, avant d'écrire la moindre ligne.
Cocher mentalement chaque point ; tout point non conforme = écart à signaler avec la
règle ADK/AOS de référence (voir `references/` et `references/raw/`) avant de coder.

## 1. Cadrage fonctionnel (AOS)

- [ ] Le besoin est-il déjà couvert par un module AOS standard (base/sale/account/
      stock/purchase/supplychain/crm...) ? Si oui, on **réutilise** l'objet AOS
      (`Partner`, `Product`, `SaleOrder`, `Invoice`, `StockMove`...) plutôt que de
      recréer un objet maison.
- [ ] L'objet métier JBL concerné est identifié (`JblRepairOrder`, `JblRepairLine`...)
      et le parcours utilisateur est décrit (statuts, boutons, écrans).
- [ ] Impacts fonctionnels listés : stock (mouvements, seuils), facturation (devis →
      OR → facture), numérotation, droits d'accès, impressions éventuelles.
- [ ] Cohérence avec le workflow Devis → OR → Facture du README.

## 2. Modèle de données (domaine XML — ADK `models`)

- [ ] Fichier dans `src/main/resources/domains/`, racine `<domain-models>` avec XSD
      **8.2** (`domain-models_8.2.xsd`), `<module/>` frère des `<entity>`.
- [ ] Noms de champs : pas de mot réservé Java ; pas de mot réservé PostgreSQL comme
      nom de colonne. Entité en UpperCamelCase, champs en lowerCamelCase.
- [ ] Types adaptés : `string` (+ `large="true"` pour les textes longs, jamais
      `<text>`), `decimal` avec **`precision` + `scale`** obligatoires, `date`,
      `integer` + `selection="..."` pour les statuts, `boolean`, `many-to-one` /
      `one-to-many` (`mappedBy`) / `many-to-many` avec `ref` fully qualified pour les
      entités d'autres modules (ex. `com.axelor.apps.base.db.Partner`).
- [ ] Champ calculé : `namecolumn="true"` sur le champ nom, `search="..."` pour la
      recherche rapide, formule en CDATA si calcul.
- [ ] Unicité : `unique="true"` sur le numéro (`name`), `sequence="jbl....seq"` pour
      la numérotation (séquence déclarée en data-init), `copy="false"` sur le numéro.
- [ ] `cacheable="true"` si l'entité est souvent lue ; `repository="abstract"` si
      repository custom (classe `...ManagementRepository` dans `db/repo`).
- [ ] `finder-method` déclaré si recherche custom nécessaire.
- [ ] Après modif : `./gradlew generateCode` puis build.

## 3. Vues & actions (ADK `views`, `actions`)

- [ ] Vues dans `src/main/resources/views/*.xml`, racine `<object-views>` (XSD 8.2).
- [ ] Grid : champs affichés = colonnes utiles uniquement (perf), `orderBy`.
- [ ] Form : panels/panel-tabs, champs avec `title`, `required`, `readonly`,
      `hidden`, `showIf`/`hideIf`, `onChange`/`onLoad`/`onSave` référençant des actions
      nommées existantes.
- [ ] Sélections (statuts, types) dans `Selects.xml`, clés i18n dans
      `i18n/messages_fr.properties`.
- [ ] Boutons d'action : `action-method` vers le contrôleur (`web/`), champ
      `showIf`/`readonlyIf` piloté par `action-attrs` ; validations par
      `action-validate` (`error` bloque, `alert` demande confirmation, `notify`
      informe).
- [ ] Menus : `Menus.xml`, `action-view` (`com.axelor.meta.schema.actions.ActionView`),
      `top="true"` pour le menu racine Atelier JBL.
- [ ] Kanban (pipeline des OR) : `columnBy="statusSelect"`, `onNew`, `sequenceBy`.
- [ ] Aucun libellé en dur : tout passe par i18n (`messages_fr.properties`).

## 4. Services & contrôleurs Java (ADK `modules/coding`)

- [ ] Logique métier dans `service/XxxService.java` (interface) +
      `XxxServiceImpl.java` (`@Singleton`, `@Inject` des repositories/services AOS),
      **jamais** dans le contrôleur.
- [ ] Binding Guice dans `module/JblModule.java` (`bind(XxxService.class).to(XxxServiceImpl.class)`).
- [ ] Transactions : `@Transactional` (Guice persist) sur les méthodes qui écrivent.
- [ ] Contrôleur `web/XxxController.java` : lit `ActionRequest.getContext()`,
      appelle le service, remplit `ActionResponse` (`setValue`, `setError`,
      `notify`, `reload`...). Pas de SQL/JPQL direct dans le contrôleur.
- [ ] Exceptions utilisateur : `AxelorMessageException` +
      `TraceBackRepository.CATEGORY_*` (ex. `CATEGORY_INCONSISTENCY`), jamais de
      `RuntimeException` nue.
- [ ] Repositories : utiliser le repo généré (`JblRepairOrderRepository.of(...)`) ou
      le management repository ; requêtes via `JPA`/`Query` AOP, filtres de sécurité
      Shiro appliqués automatiquement.
- [ ] Appels aux services AOS standard plutôt que réimplémentation (ex.
      `SaleOrderComputeService`, `InvoiceService`, `StockMoveService`).
- [ ] Records m2o obligatoires (`required="true"`) vérifiés côté service aussi.

## 5. Sécurité, i18n, config

- [ ] Nouveaux objets/menus couverts par des permissions (Role/Group/Permission,
      deny-all par défaut ; ne pas ouvrir l'accès admin-only par mégarde).
- [ ] Toutes les clés i18n ajoutées dans `messages_fr.properties`.
- [ ] `axelor-config.properties` : driver JDBC déclaré, persistence-unit
      `persistenceUnit` inchangée, pas de wildcard de version.

## 6. Data-init / import

- [ ] Nouvelles séquences ou données de démo dans `data-init/` (`input-config.xml` +
      CSV), jamais de SQL direct.
- [ ] Import CSV/XML conforme aux règles data-import ADK (adapters de type, mapping
      XML) si import de données.

## 7. Build, run, tests

- [ ] `./gradlew build` passe (compile + tests + WAR).
- [ ] Tests écrits AVANT l'implémentation (voir `checklists/tdd.md`) et exécutés
      (`./gradlew test`).
- [ ] En dev : hot-reload XML OK ; modif Java → redémarrage (`dev.sh`).
- [ ] Aucune régression sur les modules AOS embarqués (menus Studio/Messagerie masqués
      en base, ne pas les réafficher).

## 8. Rapport de contrôle (à produire en fin de réponse)

- Conforme / écarts (avec règle de référence) / tests exécutés et résultats /
  solution retenue (KISS) / points d'attention (perf stock, droits, i18n).
