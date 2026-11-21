# ADK 10.0 — Import / export de données (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/data-import/*`, `dev-guide/data-exchange/*`).

## Data-import (framework XML de transformation — dev)

- Mapping déclaratif XML (`csv-inputs` / `xml-inputs`, ns `http://axelor.com/xml/ns/data-import`,
  XSD `data-import_10.0.xsd`) : `<input name model>`, `<bind from to adapter eval/>`,
  scripts Groovy inline (`eval` par champ, `process` sur le bean : méthodes
  `processValues`, `importData(bean, values)` dans une classe helper).
- **CSV** : `CSVImporter`, config `csv-config` (séparateur, encodage, `search-fields`...).
- **XML** : `XMLImporter`, `<bind node="xpath/@attr" to="field" alias/>`.
- **SOAP** : via actions `action-ws` + `action-import`.
- **Adapters de type** prédéfinis : `LocalDate`, `LocalTime`, `LocalDateTime`,
  `DateTime`, `BigDecimal`, `Boolean`... reconfigurables (`<adapter name type><option .../>`),
  `JavaTimeAdapter` avec `format`.
- Intégration Java : `Importer`, `ImportTask`, `Listener` (stats/erreurs, `continueOnError`),
  `Launcher` (tâche CLI).
- Data-init du projet : `src/main/resources/data-init/input-config.xml` + CSV
  (ex. `jbl_sequence.csv`) — c'est le mécanisme à utiliser pour les séquences/données
  de démarrage.

## Data-exchange (import/export interactif — utilisateurs)

- Export de masse depuis la recherche avancée : sélection de champs (y compris relations),
  **Excel `.xlsx`** ou archive **CSV `.zip`** ; configurations d'export sauvegardables ;
  round-trip export→édition→import ; limite `data.export.max-size`.
- Import : `.xlsx` (une source par feuille), `.zip` de CSV, ou CSV seul ; mapping des
  colonnes revu avant écriture ; identité des enregistrements (clés stables) pour
  mises à jour ; résultat détaillé (importés/erreurs) ; « flat import » pour résoudre
  les relations aplaties.
- Permissions et limites opérationnelles configurables (voir `data-exchange/reference`).
