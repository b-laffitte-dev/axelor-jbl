# AOS — Modules utiles au projet JBL (détail fonctionnel)

Source : `references/raw/aos-7.2.md` / `aos-8.0.md`. Pour un atelier de réparation :
les objets AOS déjà utilisés ou candidats V1.

## Base — référentiels (déjà utilisés par JBL)

- **Tiers (`Partner`)** : référentiel unique clients/fournisseurs/prospects/contacts ;
  adresse (ville/territoire), coordonnées bancaires ; client = `isCustomer`, fournisseur =
  `isSupplier`. Le projet filtre les menus Clients/Fournisseurs sur ces flags.
- **Produits (`Product`)** : articles vs prestations (`productTypeSelect='storable'` pour
  les pièces détachées), famille produit, famille comptable (compte achat/vente, TVA),
  unités, prix de vente/d'achat, PMP (coût moyen pondéré) côté achats.
- **Société (`Company`)** : multi-société (option Base), devise, configuration des
  impressions (BIRT) par société ; champ `company` sur les documents JBL.
- **Séquences** : config base (génération auto, préfixe brouillon `#`) — remplace la
  numérotation maison JBL en V1.
- Config applicative par module : Config applicative → Gestion des applications →
  <module> → Configurer, puis **sauvegarder + rafraîchir**.

## Ventes — devis & commandes (cœur du flux JBL)

- **Devis client (`SaleOrder`)** : création manuelle, duplication, depuis un modèle de
  devis (réutilisable pour tout tiers, devise + liste de prix), versions (option
  « Gérer les versions des devis », chaque version archivée en PDF), validité (devis
  périmés en rouge en liste), envoi au client, acceptation → génère la commande.
- **Commande client** : créée depuis le devis accepté ; lignes de détail produit/qte/prix,
  totaux HT/TVA/TTC calculés ; échéancier de facturation (facturation en plusieurs fois) ;
  génère livraison client (mouvement de stock) et facture.
- L'OR JBL est lié au devis via `quotation` → `sale.SaleOrder`.
- Listes de prix (par client/tiers, historisées, remises/surcharges) ; barèmes (règles
  de classification/résultat en formules Groovy pour calculer prix) ; packs (produits
  groupés) ; configurateur de vente (low-code, produit custom) ; produits
  complémentaires du tiers.

## Facturation — facture & avoirs

- **Facture (`Invoice`)** client/fournisseur, facture de solde, avoir (direct, depuis
  facture, depuis bon de retour). La facture JBL est liée à l'OR via `invoice` →
  `account.Invoice` ; à la validation, l'OR passe « Facturé ».
- Multi-échéances : condition de paiement avec plusieurs échéances (net, fin de mois
  + n jours/mois) ; escompte (onglet dédié si activé).
- Cut-off (FNP/FAE/PCA/CCA) si compta activée ; compta analytique possible sur les
  lignes.

## Stock — pièces détachées (consommation à la fin de l'OR)

- **Emplacements (`StockLocation`)** : entrepôt principal, client, fournisseur,
  atelier... ; onglets contenu/détail/config (types de mouvements autorisés).
- **Mouvements (`StockMove`)** : internes, client (livraison), fournisseur (réception) ;
  statuts Brouillon → Planifié → Réalisé → Annulé ; lignes produit + qte (conversion
  d'unité) + prix ; la conso des pièces à la fin d'un OR JBL = mouvement de sortie
  (blocage si stock insuffisant).
- **Inventaire** : lignes produit/qte réelle vs théorique, génération PDF, validation.
- **Allocations & réservations** : allocation (stock dispo) vs réservation (stock
  futur) — options incompatibles entre elles ; allocation auto à la demande de mise à
  disposition (supply chain).
- **Traçabilité** : n° de lot/suivi, mode FIFO/LIFO, numéros générés à l'achat.
- **Règles de stock & CBN** : stock minimum, quantité min. de réapprovisionnement,
  calcul des besoins (CBN) par règles de stock.

## Achats — réappro pièces

- Fiche fournisseur (similaire client + onglet fournisseur, niveau qualité), demande
  d'achat interne (→ devis fournisseur → commande d'achat, statuts dont « Acheté »),
  commande d'achat (validation → BR réception → facture fournisseur), listes de prix
  fournisseur, PMP et prix de revient.

## Supply chain

- Chaîne devis → commande → livraison → facture automatisable ; allocation auto ;
  CBN piloté par les règles de stock.

## CRM (utile pour les clients/prospects de l'atelier)

- Pistes → prospects → clients ; contacts (fusion de doublons) ; opportunités ;
  événements/rappels ; catalogues envoyés aux clients ; rapports.

## Admin — sécurité & exploitation

- Utilisateurs/groupes/rôles/droits (Shiro) : Manager (CRUD+export), User
  (lecture/écriture/création), Read ; menus par groupes via export/import Excel ;
  planificateurs pour les batchs (recouvrement, cut-off, contrats...) ; modèles/vues en
  lecture (métadonnées) ; traductions modifiables dans l'ERP.

## Règle d'or pour JBL (KISS)

- V0 : entités `Jbl*` + `Partner`/`Product` d'axelor-base. V1 (documentée au README) :
  remplacer JblQuotation/JblInvoice/JblStock par `SaleOrder`/`Invoice`/`StockMove`
  d'AOS et la numérotation maison par les `Sequence` — ne pas réimplémenter ce que ces
  modules font déjà (voir `checklists/kiss.md`).
