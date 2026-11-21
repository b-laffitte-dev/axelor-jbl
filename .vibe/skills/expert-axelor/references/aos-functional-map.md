# AOS — Carte des modules fonctionnels (synthèse)

Source : `references/raw/aos-7.2.md` (132 pages, version 7.2 complète) et
`references/raw/aos-8.0.md` (26 pages, 8.0 ; la racine `/aos/` sert la 9.1 FR).
Doc fonctionnelle des applications métiers AOS (Config applicative → Gestion des
applications → <module> → Configurer = point d'activation de chaque fonctionnalité).

## Modules AOS (web)

| Module | Contenu (extraits des pages crawlees) |
|---|---|
| **Base** | Tiers (`Partner` : clients/fournisseurs/prospects, adresses, banque, préférences), Produits (`Product` : articles/prestations, familles, comptabilité, unités), Société (multi-société, devise, impressions), Calendrier, GED/Documents (étiquettes), Messenger, Travail d'équipe (équipes, tâches, fréquences), config base (séquences, préfixe brouillon `#`) |
| **CRM** | Pistes, prospects (statuts, doublons), contacts (fusion doublons), opportunités (gagnée/perdue), événements (+rappels), catalogues (PDF envoyés aux clients), rapports (appels/opportunités/pistes) |
| **Ventes** | Fiche client, **devis client** (versions, modèles de devis, validité), **commande client** (échéancier de facturation, génération livraison/facture), produits (packs, complémentaires, configurateur de vente low-code, barèmes = règles de prix en Groovy), listes de prix (client/tiers, historisées) |
| **Achats** | Fiche fournisseur, demande d'achat interne (→ devis fournisseur → commande), **devis fournisseur**, **commande d'achat** (→ BR → facture), liste de prix fournisseur, produit achat (PMP, coût d'achat) |
| **Facturation** | Facture client/fournisseur, avoirs (direct, sur facture, sur bon de retour), facture de solde, multi-échéances (conditions de paiement : net, fin de mois + n jours), escomptes, cut-off (FNP/FAE, PCA/CCA), config par société |
| **Stock** | Emplacements de stock, mouvements (internes, client, fournisseur), inventaires, **allocations & réservations** (stock dispo vs réservation), traçabilité (n° de suivi/lot, FIFO/LIFO), règles de stock (min. de réappro), CBN (calcul des besoins), fiche logistique (colisage) |
| **Supply chain** | Allocation auto à la demande de mise à disposition, CBN et règles de stock |
| **Comptabilité** | Écritures (saisie, saisie en masse, modèles d'écriture, FEC), grand livre/balance, analytique (axes/comptes analytiques), clôture d'exercice, lettrage, recouvrement (batch), DAS2, affacturage, immobilisations (catégories, amortissements prorata temporis, scinder/sortir, rapports), taxes (TVA, écart de taxe autorisé) |
| **Trésorerie** | Saisie de paiement (assistant paiement facture), ordres bancaires (virement SEPA/international, virement de trésorerie, prélèvement, LCR ; EBICS pour envoi banque direct sinon fichier XML/TXT), remises de chèque, relevés bancaires, **rapprochement bancaire** (pointage, compta auto, récupération du tiers par sélection ou formule Groovy) |
| **Production** | Nomenclature (BOM) & gamme, **ordre de fabrication** (planification, produits consommés, temps passés, livraison client), calcul des coûts (groupes de coûts directs/indirects), capacité & ordonnancement, postes de charge (machine/homme), ateliers (emplacements), sous-traitance, PIC/PDP (prévisions), code-barres |
| **Gestion à l'affaire** | Projet vs affaire (rattachée à un client), tâches (coûts, temps), planification/temps saisis (feuille de temps RH), réservations de ressources, achats depuis l'affaire, génération d'affaire depuis devis/commande, facturation à l'affaire, reporting (temps, financier, facturation) |
| **Contrats** | Modèles de contrat, contrats périodiques (prorata temporis / par versions), batch d'activation/clôture |
| **RH** | Fiche employé, notes de frais (valeur probante), congés (types d'absence, modèles d'email), feuilles de temps, recrutement (offres, candidatures), primes, tickets restaurant, formations & évaluations |
| **Qualité** | Fiches d'amélioration qualité (kanban), défauts, détection (liens entre fiches), relevés de contrôle |
| **Budget** | Budgets (manuel, par modèle, versions depuis 7.2), distribution budgétaire (lignes de facture), suivi (réalisé/écart), archivage |
| **Autres** | Flotte auto (véhicules, kilométrage, carburant), prévisions de trésorerie, marketing (campagnes emailing, événements/participants), RGPD (pseudonymisation), support client (tickets), G Suite |
| **AOM (mobile)** | App mobile React Native modulaire : CRM, stock (niveaux, mouvements internes, livraisons, inventaires), production (OF, temps), qualité, RH (frais, feuilles de temps), helpdesk, OCR/data capture, mode hors-ligne |

## Admin transverse

- Utilisateurs (société active, équipe active, employé lié), groupes, rôles (Manager =
  CRUD+export, User = lecture/écriture/création, Read = lecture seule), droits
  (couches d'assignation user→rôle, user→groupe→rôle...), gestion des menus par
  groupes (export/import Excel des croix), modèles/vues (métadonnées), traductions,
  planificateurs (batchs), aide contextuelle (info-bulles), modules.
