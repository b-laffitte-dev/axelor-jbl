# TDD — Test Driven Development sur axelor-jbl (AOP 8.2.6, JUnit 5)

Règle : **le test s'écrit avant le code**, pour toute évolution du projet. Cycle
strict : RED → GREEN → REFACTOR.

## Pourquoi / périmètre

- Toute logique métier (services `com.axelor.apps.jbl.service.*`) doit être testée.
- Les contrôleurs minces (délégation au service) ne nécessitent pas de test dédié :
  on teste le service.
- Les vues XML / actions / menus ne se testent pas unitairement : on vérifie la
  conformité via `checklists/implementation-review.md` + build + test manuel en dev
  (`./dev.sh`, admin/admin).

## Mise en place

- `build.gradle` : `test { useJUnitPlatform() }` est déjà configuré (JUnit 5).
- Arborescence de test : `src/test/java/com/axelor/apps/jbl/...` (miroir du main).
- Dépendances de test disponibles via le classpath AOP : JUnit 5 (`org.junit.jupiter`),
  AssertJ/Mockito si ajoutés dans `build.gradle` (`testImplementation ...`) — les
  ajouter **uniquement** si un test en a besoin (KISS).
- Base de test : AOP fournit `com.axelor.test.GuiceModules` / `AxelorTestSupport` pour
  démarrer un contexte Guice + base H2 en mémoire dans les tests d'intégration
  (pattern des tests des modules Axelor : `@GuiceModules({...})`, injection du service
  testé, `JpaTestSupport`/`withTransaction`). Pour un test unitaire pur, instancier
  le service et moquer les repositories (Mockito).

## Cycle à appliquer à chaque évolution

1. **RED** — écrire le test qui exprime le comportement attendu (ex. :
   `terminer OR sans stock suffisant → AxelorMessageException CATEGORY_INCONSISTENCY` ;
   `terminer OR avec stock OK → mouvements de sortie créés, statut « Terminée »` ;
   `générer facture depuis OR terminé → lignes copiées, totaux égaux`). Le faire
   échouer (`./gradlew test --tests ...`).
2. **GREEN** — implémenter le minimum dans le service pour passer le test.
3. **REFACTOR** — simplifier (KISS) en gardant le test vert. Rejouer
   `./gradlew build` (compile + tous les tests + WAR).

## Règles de nommage / structure des tests

- Classe : `XxxServiceImplTest` (miroir de la classe testée), package identique au
  main (`com.axelor.apps.jbl.service`).
- Méthodes : `test<Comportement>_<Condition>_<Attendu>` en français lisible, ex.
  `testTerminerOr_sansStock_lanceException`, `testGenererFacture_copieLesLignes`.
- Un test = un comportement ; arrange/act/assert explicites ; pas de test qui dépend
  d'un autre.
- Ne jamais tester le framework (pas de test "le repository save() persiste") : on
  teste **notre** logique (règles métier JBL, transitions de statut, calculs de
  totaux, consommation de stock, blocages).

## Commandes

```sh
./gradlew test                                  # tous les tests
./gradlew test --tests "com.axelor.apps.jbl.*"  # ciblés
./gradlew build                                 # compile + tests + WAR (CI)
```

## Quand le TDD s'applique à chaque demande

- Nouvelle fonctionnalité → test d'abord.
- Correction de bug → test de régression d'abord (reproduit le bug), puis fix.
- Refactor → tests existants doivent rester verts avant/après.
- Jamais de code métier non testé mergé ; si un test d'intégration AOP est trop
  lourd, au minimum un test unitaire du service avec repositories mockés.
