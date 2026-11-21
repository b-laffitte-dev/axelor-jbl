# KISS — Keep It Simple, Stupid (appliqué à axelor-jbl)

À chaque implémentation : choisir la **solution la plus simple qui respecte les
conventions AOP/AOS**. Le framework fait déjà presque tout — ne pas le contourner.

## Règles pratiques

1. **Réutiliser avant de créer** : un besoin couvert par AOS (Partner, Product,
   SaleOrder, Invoice, StockMove, séquences, permissions, i18n, import/export,
   rapports BIRT, scheduler) → on utilise l'existant, on ne recode pas.
2. **Une responsabilité par classe** : service = logique métier, contrôleur =
   adaptateur requête/réponse, vue XML = présentation, domaine XML = données.
   Pas de logique dans le contrôleur, pas de JPQL dans les vues.
3. **Pas de contournement du framework** : pas de SQL natif si une requête AOP/JPA
   suffit ; pas de script Groovy là où une `action-validate`/`action-attrs` suffit ;
   pas de service maison là où un service AOS existe.
4. **Le XML déclaratif d'abord** : default values, onChange, onNew, sélections,
   domaines (`domain="..."`) plutôt que du Java quand c'est possible.
5. **Éviter les dépendances inutiles** : n'ajouter une dépendance Gradle que si
   nécessaire (et vérifier les conflits de capacités, ex. groovy codehaus vs apache).
6. **Entités minimales** : un champ ajouté doit servir un besoin réel ; préférer
   `string large` à une nouvelle entité pour un texte long ; `selection` plutôt qu'une
   table pour une liste fermée de valeurs.
7. **Nommage explicite et stable** : noms de champs/actions/vues cohérents avec
   l'existant (`jbl.repair.order.*`), pas de renommage en cascade.
8. **Pas de code mort** : supprimer complètement ce qui est remplacé (pas de
   commentaires « removed », pas de méthodes inutilisées).
9. **Build/test comme preuve** : une implémentation n'est terminée que si
   `./gradlew build` passe (avec les tests TDD écrits avant).
10. **YAGNI** : pas de fonctionnalité « au cas où » (pas de V1 anticipée dans le
    code V0 ; les pistes V1 restent documentées dans le README, pas implémentées).

## Anti-patterns à éviter sur ce projet

- Recréer un `JblInvoice`/`JblStock` maison alors que `account.Invoice` /
  `stock.StockMove` existent (V1 du README = les brancher, pas les cloner).
- Service de numérotation maison alors que `sequence="..."` + data-init existe.
- Logique métier dans `JblRepairOrderController` au lieu de `RepairOrderServiceImpl`.
- Champs `text` (déprécié en 8.2), `scale` sans `precision`, `<entity>` imbriquée
  dans `<module>` (invalide en 8.2).
- Vues surchargées : préférer `extension="true"` (vues d'extension) à la copie
  intégrale d'une vue AOS quand on veut juste ajouter un champ/panel.
