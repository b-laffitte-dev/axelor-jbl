# ADK 10.0 — Modèles / domaines XML (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/models/*`). **Projet = XSD 8.2** (voir `project-context.md`).

## Déclaration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<domain-models xmlns="http://axelor.com/xml/ns/domain-models"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://axelor.com/xml/ns/domain-models
  https://axelor.com/xml/ns/domain-models/domain-models_10.0.xsd">
  <module name="contact" package="com.axelor.contact.db"/>
  <entity name="Contact"> ... </entity>
</domain-models>
```

- Entités = POJO JPA (Hibernate), générés par le **code generator** depuis le XML :
  classes entité + repositories dans `<package>.db` / `<package>.db.repo`.
- **Jamais de mot réservé Java comme nom de champ, ni de mot réservé PostgreSQL comme
  nom de colonne.**

## `<entity>` — attributs clés

`name` (UpperCamelCase), `cacheable`, `table`, `extends`, `implements`, `persistable`
(false = `@MappedSuperclass`), `strategy` (héritage : `SINGLE` défaut | `JOINED` |
`CLASS` — éviter CLASS en perf), `repository="default|abstract|none"`, `logUpdates`,
`dynamicUpdate` (auto si champ `binary`/`large` ou table large), `equalsIncludeAll`,
`jsonAttrs`, `allocationSize` (pré-allocation des IDs par bloc, défaut 1).

## Champs — types et attributs usuels

- Types : `string` (attributs `min`,`max`,`large="true"`,`required`,`unique`,`sequence`,
  `namecolumn="true"`,`search="a,b"`,`copy`,`massUpdate`,`default`,`title`,`formula`...),
  `text` **remplacé par `string large="true"`**, `integer`, `long`, `decimal`
  (**`precision` + `scale` obligatoires** si scale), `boolean`, `date`, `time`,
  `datetime`, `binary`, `json`, `enum`.
- Relations : `many-to-one ref="..."` (ref FQN pour autre module), `one-to-many
  ref="..." mappedBy="..."`, `many-to-many ref="..."`, `one-to-one`.
- Champ calculé : formule Groovy en CDATA dans le champ (ex. `fullName`).
- `finder-method name="findByX" using="champ"` : méthodes de recherche générées.

Exemple :

```xml
<entity name="JblRepairOrder" cacheable="true">
  <string name="name" unique="true" readonly="true" copy="false" sequence="jbl.repair.order.seq"/>
  <integer name="statusSelect" selection="jbl.repair.order.status.select" default="0"/>
  <many-to-one name="partner" ref="com.axelor.apps.base.db.Partner" required="true"/>
  <one-to-many name="repairLineList" ref="com.axelor.apps.jbl.db.JblRepairLine" mappedBy="repairOrder"/>
  <decimal name="totalHT" precision="19" scale="2" readonly="true"/>
</entity>
```

## Repositories

- Générés automatiquement (`repository="default"`), héritent de `JpaRepository` :
  `save`, `find`, `all`, `remove` + finders déclarés. `repository="abstract"` → le
  module fournit l'implémentation (ex. `JblRepairOrderManagementRepository extends
  JblRepairOrderRepository`).
- Code custom dans le repository (finders, méthodes métier d'accès) ; la logique
  métier va dans les **services**, pas le repository.

## Séquences (`<sequence>`)

```xml
<sequence name="sale.order.seq" prefix="SO" padding="5" .../>
```
Stockées en `MetaSequence` (mettre à jour les méta-records après ajout). Utilisation :
champ `<string name="name" sequence="sale.order.seq"/>` → rempli auto à la création ;
ou en Java `JpaSequence.nextValue("sale.order.seq")` dans un service `@Transactional`.
Préfixe brouillon configurable (défaut `#`).

## Data queries (`<query>`)

- DSL XML déclaratif, type-safe, avec sécurité row-level : stocké en `MetaQuery`,
  exécuté via le moteur de requêtes (génération JPQL automatique, paramètres).
  Opérateurs : `eq`, `notEq`, `gt/gte/lt/lte`, `in/notIn`, `between`, `isNull/isNotNull`,
  `like`... Utilisé par les dashboards/data-widgets et l'API REST de requête.

## Custom models & custom fields

- Depuis AOP 5 : modèles custom dynamiques (runtime, stockage JSON `attrs`) créés via
  Model Management ou Studio ; vues form/grid/menu auto-générées. Champs custom sur
  modèles existants via JSON (`attrs.xxx`), administrables par data-import
  (`<custom-fields for="..." on="attrs">`).
