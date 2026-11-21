
    *   Opération de fabrication
    *   Ordre de fabrication
    *   Processus
    *   Suivi des relevés de contrôle
    *   Tickets
# Documentation Axelor Open Suite 8.0
# Facture multi-échéances
## Architecture modulaire​
## Configurations DAS 2​
## Configurations Immobilisations​
## Configurations comptables par société​
## Configurations du recouvrement​
## Configurations​
## Configuration​
## Création manuelle d’une immobilisation : création depuis une fiche immobilisation​
## Création manuelle d’une immobilisation : création depuis une écriture comptable​
## Disponibilité et compatibilité​
## Facture avec escompte​
## Fonctionnalités du Module Stock​
## Fonctionnalités générales​
## Génération d’une quittance subrogative​
## Installation & configuration​
## Introduction à la comptabilité analytique​
## Introduction​
## Notes de frais dans le module RH​
## Saisie d’une écriture dans AOS​
## Saisie​
### Assistant de clôture comptable​
### Automatisme de saisie​
### Autorisation & menus​
### Catalogues​
### Catégories d’immobilisations​
### Charge constatée d’avance (CCA) & Produit Constaté d’Avance (PCA)​
### Clients​
### Configuration comptable par société​
### Configuration de la clôture comptable​
### Configuration du factor​
### Configurations du compte comptable​
### Contacts​
### Corrections de stock​
### Créer une écriture​
### Ecriture analytique​
### Facture Non Parvenue (FNP) & Facture À Établir (FAE)​
### Feuilles de temps​
### Introduction​
### Les axes analytiques​
### Les comptes analytiques​
### Les journaux analytiques​
### Menu Ecritures​
### Motifs de sortie des immobilisations​
### Mouvements internes​
### Méthodes de recouvrement​
### Onglet Comptabilité​
### Opportunités​
### Opération de fabrication​
### Ordre de fabrication​
### Paiement​
### Paramétrages du module Stock​
### Pistes / Prospects​
### Processus​
### Récupération des données​
### Saisie d’une période de cut-off depuis une facture​
### Saisie d’une période de cut-off depuis une écriture comptable​
### Saisie​
### Saisir une facture fournisseur​
### Suivi des chronomètres​
### Suivi des frais​
### Suivi des relevés de contrôle​
### Synchronisation​
### Tickets​
### Traductions​
### Types d’immobilisations​
### Visualisation des produits​
### Échéanciers​
### Écran d’accueil / onglet Général​
*   **Accès**: Feuilles de temps → Feuilles de temps
*   **Calcul du montant** : le produit ou la charge constaté d’avance est calculé en fonction du nombre de jours (ou mois) de l’exercice suivant et auquel doit être rattaché le produit ou la charge .
*   **Cas des CCA** : Le montant des charges constatées d’avance figure à l’actif. Il est débité sur le compte 486. Par conséquent, les comptes de charge sont diminués( Classe 6) en créditant le compte concerné du montant de la charge.
*   **Cas des FNP** : le montant de
*   **Cas des PCA** : Le montant des produits constatés d’avance figure au passif. Il est crédité sur le compte 487. Par conséquent, les comptes de produit sont augmentés (Classe 7) en débitant le compte concerné du montant du produit.
*   **Compte de résultat (bénéfice) / (perte)** : compte utilisé lors du batch de clôture dans l’écriture de résultat générée (bénéfice ou perte).
*   **Compte d’ouverture / Compte de clôture** : compte utilisé lors du batch de clôture ou d’ouverture dans les écritures générées en contrepartie de la balance pour chacun des comptes comptables clôturés. En principe il s’agit ici d’un compte spécial 891000 ou 890000 utilisé uniquement à cet effet.
*   **Date de début et de fin** : la période d’application de cut-off saisie dans la ligne d’écriture.
*   **Durée proratisée** : c’est le nombre de jours entre la date de l’écriture et la date de fin / nombre de jours total de la période d’application du cut-off de la ligne d’écriture.
*   **Emplacement** : vous pouvez toujours sélectionner un emplacement associé à cette immobilisation.
*   **Etat** (Nouvelle ; Brouillard ; Simulée ; Comptabilisée) ;
*   **Gérer les comptes parents** : cette option permet d’autoriser sur les comptes analytiques de gérer des structures arborescentes (sur plusieurs niveaux).
*   **Impact sur l’exercice suivant:** il faut procéder à une extourne de l’écriture pour que la marge soit constatée sur l’exercice suivant.
*   **Informations d’amortissement**
*   **Journal** : le journal auquel est associé l’écriture, est également affiché (O.D.manuelle / Achats / Ventes etc).
*   **La référence**. Pour les écritures en statut brouillard, le numéro de référence sera temporaire, et changera suite au passage à un autre statut (ce numéro deviendra une séquence avec des caractères et des numéros).
*   **Ligne de facture / Écriture d’achat** : ici, vous pouvez rattacher une ligne de facture ou une écriture d’achat à postériori.
*   **Modifier/Supprimer un temps**: lorsque vous ouvrez les feuilles de temps, vous allez y trouver les fiches avec le temps saisi. Cliquez sur l’icône du crayon afin de modifier un temps, ou cliquez sur l’icône Supprimer afin de supprimer un temps.
*   **Montant non facturé** : le montant du mouvement qui n’est pas encore facturé. Calculé à partir du prix unitaire.
*   **Montant proratisé** : c’est le montant HT x Durée proratisée (exemple : 20 000 x 182 / 366).
*   **Nbr de regroupements analytiques** : les regroupements analytiques permettent d’ajouter de la profondeur d’analyse avec une autre dimension pour effectuer des regroupements de données interaxes ou potentiellement sur un même axe. Pour chaque regroupement analytique, vous pouvez définir des valeurs de regroupements, qui seront à sélectionner sur le compte analytique directement.
*   **Nombre de feuilles à valider**: ouvrez le menu “Feuilles de temps”. Eh haut à droite, vous allez voir le nombre de feuilles à valider (To validate).
*   **Numéro de suivi** : vous pouvez également associer un numéro de suivi.
*   **Onglet Analytique**
*   **Onglet Informations comptables**
*   **Onglet Méthode d'amortissement** : ouvrez cet onglet. Ici, vous allez pouvoir renseigner le plan d’amortissement / la méthode calcul / la périodicité / activer ou désactiver la prorata temporis.
*   **Origine fonctionnelle** : par exemple, il peut s’agir d’une écriture de l’Immobilisation ou du Paiement etc.
*   **PCA / CCA = Montant HT x nombre de jours en N+1 / 360 jours**
*   **Par caractéristique**: pour chaque caractéristique, il faut parcourir tous les échantillons.
*   **Par échantillon**: pour chaque échantillon, il faut parcourir toutes les caractéristiques.
*   **Période** : trouvez la période pendant laquelle l’écriture a été réalisée.
*   **Quantité facturée** : la quantité déjà facturée.
*   **Rôles autorisés pour la création/édition d’écriture sur période provisoirement clôturée**: seuls les utilisateurs associés à ces rôles auront le droit de création/édition d’écritures sur une période provisoirement clôturée.
*   **Rôles autorisés à la clôture comptable** : les utilisateurs associés à ces rôles auront le droit de procéder à la clôture définitive d’une période comptable et à la clôture de l’exercice comptable (année fiscale).
*   **Rôles autorisés à la clôture provisoire** : les utilisateurs associés à ces rôles auront le droit de procéder à la clôture provisoire d’une période comptable (passage de Ouvert à Clôturée provisoirement).
*   **Sur les arrivées fournisseurs**: si activé, permet l’ajout des lignes à la réception des commandes fournisseurs.
*   **Sur les arrivées fournisseurs**: à la réception des commandes fournisseurs.
*   **Sur les corrections de stock**: si activé, permet la validation lors des corrections de stock.
*   **Sur les inventaires** : si activé, permet la validation en réalisant l’inventaire.
*   **Sur les inventaires**: en réalisant l’inventaire.
*   **Sur les livraisons client**: si activé, permet l’ajout des lignes à la livraison d’une commande client.
*   **Sur les livraisons client**: à la livraison d’une commande client.
*   **Sur les mouvements internes**: lors des mouvements internes.
*   **Tiers / Société** : le tiers et la société auxquels est associée l’écriture, est également affiché.
*   **Valider / Annuler / Ouvrir l’action associée** : chaque étape possède trois boutons. Le premier est le bouton “Valider”, le deuxième est le bouton “Annuler”, et le troisième bouton est le bouton “Ouvrir l’action associée” qui vous permet d’ouvrir dans une nouvelle fenêtre la page de l’action associée. Vous ne pouvez pas accéder à la prochaine étape sans confirmer l’étape précédente.
*   A la création d’un nouvel enregistrement, il faut sélectionner l’entreprise et l’année fiscale pour laquelle vous souhaitez réaliser la clôture.
*   A la fin du traitement, un message en pop up est affiché, récapitulant le nombre de pièces traités et le nombre d’anomalies rencontrées.
*   Accès au dossier de production ;
*   Accès au suivi des modifications et des commentaires ;
*   Accès rapide au dernier chronomètre modifié ;
*   Apple store
*   Architecture modulaire
*   Au plus tard le deuxième jour ouvré suivant le 1er Mai (cas impôt sur le revenu ou impôt sur société avec une clôture comptable au 31 décembre) ;
*   Autres (Délai avant envoi, blocage client etc…).
*   Calculer le résultat par produit ;
*   Catégories d’immobilisations ;
*   Champs studios ;
*   Configuration
*   Configuration comptable par société
*   Configurations du compte comptable
*   Consulter les réceptions fournisseurs ;
*   Corriger les stocks ;
*   Création de chronomètre ;
*   Création de notes de frais ;
*   Créer un ticket.
*   Dans les 3 mois suivant la clôture de l’exercice (Cas Impôt sur les société avec clôture comptable en cours d’année).
*   Datées (en principe la date est identique à la date de la transaction rattachée).
*   De type Prévisionnel (Commande, Contrat, Facture) ou Réel (comptable) ;
*   Disponibilité et compatibilité
*   Définir les catégories de clients avec leurs méthodes de recouvrement respectives.
*   Définir les méthodes de recouvrement.
*   En finalisant l’enregistrement de toutes les écritures comptables de l’exercice en question.
*   En rassemblant les pièces nécessaires à l’édition du bilan de la société.
*   Envoi mail / Courrier.
*   Et l’import des écritures par FEC (Fichier des Écritures Comptables : niveau Expert de la formation).
*   Etre datées.
*   Etre inaliénables. Une fois l’écriture validée, elle ne doit pas pouvoir faire l’objet de modifications ;
*   Etre inscrites dans des journaux (par type de flux) ;
*   Etre justifiée par un événement économique qui est souvent traduit par une pièce justificative (factures, relevé bancaire etc …) ;
*   Etre équilibrées en respectant le principe de la partie double (total des débits = total des crédits) ;
*   Expliquer les résultats ;
*   Filtrez sur la référence de l’ordre de fabrication ;
*   Filtrez sur le poste de charge ;
*   Filtrez sur les machines.
*   Fournir des informations financières détaillées aux dirigeants pour la prise de décision.
*   Gestion de l’impression des rapports.
*   Gestion des champs studio ;
*   Gestion des frais ;
*   Gestion des rebuts.
*   Gestion des traductions avec la possibilité de les modifier directement depuis l’ERP ;
*   Github (icône)
*   Google Play (icône)
*   Identifier les coûts des différentes fonctions de l’entreprise ;
*   Immobilisations corporelles ;
*   Immobilisations en cours ;
*   Immobilisations financières ;
*   Immobilisations incorporelles.
*   Inscrites dans un ou des journaux (pour catégorisation si nécessaire) ;
*   Introduction
*   La gestion des stocks ;
*   La référence ;
*   La saisie des écritures ;
*   La saisie des écritures en masse ;
*   Le montant des honoraires, commissions ou courtages dépasse 1200 € par an pour un même bénéficiaire (source : service-public.fr).
*   Le paiement est réalisé lorsque vous cliquez sur “Ok”.
*   Le statut ;
*   Le type.
*   Le versement a lieu dans le cadre de l'exercice d'une activité professionnelle.
*   Les lignes affichées en rouge correspondent aux lignes pour lesquelles un cut-off a déjà été généré.
*   Les lignes affichées sont regroupées par mouvement de stock.
*   Les lignes affichées sont regroupées par écriture comptable.
*   Les ordres de fabrication liés ;
*   Mes tickets ;
*   Messagerie.
*   Modifier et créer des tickets.
*   Montant minimum pour recouvrement etc…
*   Motifs de sortie des immos.
*   Nombre de jours avant recouvrement.
*   Planning des événements.
*   Produits consommés / finis ;
*   Préparation des ordres de fabrication ;
*   Rattachement des chronomètres à une feuille de temps ;
*   Rattachement des frais à une note de frais ;
*   Représente un montant via un pourcentage de répartition applicable à la transaction rattachée (ligne de commande, ligne de facture, ligne d’écriture comptable) ;
*   Réaliser et suivre les livraisons clients ;
*   Réaliser les Inventaires.
*   Récupération d’information de contact rapide ;
*   Référence commande client ;
*   Régularisations de biens déjà livrés ou de prestations déjà réalisées mais n’ayant pas encore fait l’objet d’une facturation.
*   Régularisations de charges déjà engagées ou de produits acquis à la clôture de l’exercice comptable mais dont le montant est incertain.
*   Régularisations de charges ou produits facturées à l’avance dont la durée s’étend au-delà de l’exercice comptable.
*   Saisie du temps passé ;
*   Saisie d’une période de cut-off depuis une facture
*   Saisie d’une période de cut-off depuis une écriture comptable
*   Si vous sélectionnez une ligne dans une pièce (une ligne d’écriture dans un mouvement OU une ligne de mouvement de stock dans une livraison/réception), le cut-off est généré pour l’ensemble de la pièce.
*   Suivi des chronomètres ;
*   Suivre les mouvements de stock interne ;
*   Tableaux de bord ;
*   Tickets de mon équipe ;
*   Traductions ;
*   Types d’immobilisation ;
*   Un tableau des échéances de factures impayées. A noter que les échéances de retenue de garantie ne s’afficheront que si la totalité des autres échéances ‘classiques’ ont été réglées.
*   Un tableau des échéances qui seront payées par le paiement en cours. Ce tableau se met à jour en fonction du montant renseigné dans “Montant payé”. Les échéances sont payées progressivement, dans l’ordre chronologique. Une échéance peut être payée partiellement.
*   Une liste d’étapes de clôture est prédéfinie. Les étapes listées sont en aucun cas obligatoires, et dépendent de chaque entreprise. Il s'agit là d’une checklist facilitant l’accès au traitement et le suivi de sa progression.
*   Validation/refus des feuilles de temps des collaborateurs.
*   Validation/refus des notes de frais collaborateurs.
*   Visualisation des catalogues clients ;
*   Visualisation des fiches pistes/prospects/clients/contacts ;
*   Visualisation des opportunités ;
*   Visualisation des ordres de fabrication ;
*   Visualisation du planning journalier ;
*   Visualiser des tickets de l’utilisateur et de son équipe ;
*   Visualiser les produits (afin de vérifier les niveaux de stock) ;
*   Vous allez avoir une vue de type liste avec un aperçu de l’avancement de toutes les clôtures. Ce fait est utile lorsque vous gérez plusieurs sociétés. Si vous ouvrez une fiche, vous allez trouver l’avancement des étapes. Les étapes sont prédéfinies et il n’est pas possible d’ajouter une autre étape ou d’en supprimer. Il s’agit d’une liste de tâches où vous allez cocher ou décocher des tâches au fur et à mesure de votre avancement.
*   Vous pouvez consulter le détail des lignes traitées et générées en allant dans l’onglet Historique du batch (pensez à actualiser l’onglet du batch avant).
**Accès** : Comptabilité → Configuration → Analytique → Journaux analytiques
**Accès** : Comptabilité → Configuration → Financière → Comptes Comptables
**Accès** : Comptabilité → Ecritures → Ecritures
**Accès** : Comptabilité → Immobilisations → Configurations
**Accès** : Comptabilité → Immobilisations → Configurations → Catégorie d’immobilisations
**Accès** : Comptabilité → Immobilisations → Configurations → Motifs de sortie des immobilisations
**Accès** : Comptabilité → Immobilisations → Configurations → Types d’immobilisations
**Accès** : Comptabilité → Immobilisations → Immobilisations
**Accès** : Comptabilité → Recouvrement → Affacturage → Quittance subrogative
**Accès** : Comptabilité → Recouvrement → Configuration → Méthodes de recouvrement
**Accès** : Comptabilité → Recouvrement → Recouvrement → vous allez voir la liste “Relance de client” (**couleur orange**) en attente de validation. Cliquez sur une ligne afin de l’ouvrir.
**Accès** : Comptabilité → Traitements périodiques → Traitements annuels → Clôture annuelle
**Accès** : Config applicative → Gestion des applications → Comptabilité, configurer
**Accès** : Config applicative → Gestion des applications → Comptabilité, configurer → activez l’option “Gérer une période d’application Cut-off”
**Accès** : Config applicative → Gestion des applications → Comptabilité, configurer → cliquez sur la fiche de la société dans l’onglet Comptabilité
**Accès** : Config applicative → Gestion des applications → Installez le module Comptabilité
**Accès** : Config applicative → Traitement de masse → Batch de comptabilité → sur la fiche, sélectionnez comme action “Recouvrement” → Type de batch de recouvrement (onglet Configuration) sélectionnez “Recouvrement classique → cliquez sur le bouton “Batch recouvrement”.
**Accès** : Config applicatives → Gestion des applications → Comptabilité, configurer → cochez l’option “Gérer les factors”.
**Accès** : Config. applicative → Référentiel → Configuration → Activité DAS2
**Accès** : Facturation → Facture client
**Accès** : Facturation → Factures Fournisseurs
**Accès** : Facturation → Échéanciers
**Accès**: CRM → Catalogues
**Accès**: CRM → Clients
**Accès**: CRM → Contacts
**Accès**: CRM → Opportunités
**Accès**: CRM → Pistes
**Accès**: CRM → Prospects
**Accès**: Comptabilité → Ecriture → Ecriture
**Accès**: Config applicative → Gestion des applications → Axelor Mobile Offline, configurer
**Accès**: Config applicative → Gestion des applications → Axelor Mobile Settings → ouvrez l’onglet HR → activez les options dans la rubrique Expenses Afin de pouvoir utiliser la fonctionnalité de Notes de frais, activez les options dans l’onglet RH, dans la rubrique Expenses.
**Accès**: Config applicative → Gestion des applications → Axelor Mobile Settings → ouvrez l’onglet Stock
**Accès**: Config applicative → Gestion des applications → Axelor mobile app settings
**Accès**: Config applicative → Gestion des applications → Axelor mobile app settings → Configuration de l’application
**Accès**: Config applicative → Gestion des applications → Axelor mobile app settings → sur la page d’accueil, dans l’encart Général, cliquez sur “Personnaliser les traductions”
**Accès**: Config applicative → Gestion des applications → Axelor mobile app settings → vous allez vous trouver automatiquement sur la page d’accueil → cliquez sur l’onglet Général
**Accès**: Config applicative → Gestion des applications → Axelor mobile settings → activez les modules RH et Data Capture
**Accès**: Config. applicative → Traitements de masse → Batchs de comptabilité.
**Accès**: Facturation → Facture client / facture fournisseur
**Accès**: Feuilles de temps → Chronomètres
**Accès**: Production → Ordre de fabrication
**Accès**: Qualité → Relevés de contrôle
**Accès**: Ressources humaines → Ligne de frais → cliquez sur + pour créer une nouvelle ligne de frais
**Accès**: Ressources humaines → Lignes de frais
**Accès**: Stock → Correction de stock
**Action fonctionnelle**: une mise en attente de la requête va avoir lieu en parallèle des modifications des données du storage si cela est possible.
**Activer la gestion des BAP** : les BAP (bon à payer) permettent de signaler ou non l’accord pour paiement sur le bon de réception (soit lors de la réception sans contrôle, soit après contrôle qualité), et sera repris sur la facture.
**Activer les écritures simulées** : activez les écritures simulées. L’écriture simulée n’a pas d’impact comptable direct (elle n’est pas reflétée sur les paiements). Vous retrouvez une écriture simulée seulement sur certains rapports.
**Assistant cut-off** : le même principe s’applique depuis l’écriture comptable, un encart “Assistant cut-off” en haut à droite sur la fiche de l’écriture permet une modification en masse et un pré-remplissage de la période d’application à la création d’une nouvelle ligne.
**Autoriser le multi échéances** : cette option vous permet de gérer les paiements échelonnés dans le temps.
**Barre de recherche**: : lorsque vous vous trouvez sur une liste contenant les clients, il est possible d’effectuer la recherche dans la barre de recherche du client, avec sa séquence et son nom.
**Barre de recherche**: lorsque vous vous trouvez sur la page du produit, dans la barre de recherche il est possible de réaliser la recherche en renseignant : le code / le numéro de série / le nom.
**Barre de recherche**: lorsque vous vous trouvez sur une liste contenant les contacts, il est possible d’effectuer la recherche dans la barre de recherche du contact, avec sa séquence et son nom, son numéro de téléphone, son email et son adresse.
**Barre de recherche**: lorsque vous vous trouvez sur une liste contenant les opportunités, il est possible d’effectuer la recherche dans la barre de recherche de l’opportunité, avec sa séquence et son nom.
**Barre de recherche**: lorsque vous vous trouvez sur une liste contenant les pistes, il est possible d’effectuer la recherche d’une piste dans la barre de recherche avec les informations suivantes : le nom / le nom de l’entreprise / le numéro de téléphone (fixe et mobile) / email / l’adresse.
**Comment procéder ?** : la déclaration consiste en la transmission du formulaire DAS2 par voie numérique. Il faut inclure dedans les montants d’honoraires qui ont été versés à des tiers fournisseur.
**Comment se présente le cut-off** : c’est une écriture comptable comptabilisée dans un journal spécifique (ex : Journal d’Opérations Diverses) qui permet d’enregistrer sur un compte comptable de régularisation, le montant de l’opération à affecter, à l’exercice comptable dont la date de clôture est la plus proche.
**Comptabilisation du cut-off - dans l’exercice à clôturer** :
**Compte de CCA / Compte de PCA / Compte client pour FAE / Compte client pour FNP** : ces comptes sont utilisés au lancement du batch de génération des cut-off.
**Comptes d’escompte** : définissez les comptes d’escompte. Lorsque vous allez ajouter une facture avec escompte, l’escompte sera appliqué et une ligne sera générée (avec le compte comptable que vous avez renseigné).
**Comptes fournisseurs** : vous avez également la possibilité de gérer les comptes fournisseurs.
**Détails de produit**: cliquez sur le produit afin d’ouvrir la page “Détails de produit”. Ici, vous allez pouvoir consulter les unités et le type de l’unité de stock (pour l’achat, la vente et le stock). Il est également possible de consulter le Conditionnement et la Description. Cliquez sur le bouton “Variants” afin d’afficher tous les variantes disponibles pour ce produit.
**Emplacement de stock**: ensuite, lorsque vous avez trouvé un produit, vous pouvez utiliser le filtre sur un emplacement de stock.
**Exemple** : l’entreprise Alpha loue un garage à l’entreprise Bêta. Une facture de location annuelle d’un montant HT de 20 000€ est comptabilisée le 1er juillet N.
**Extourner** : le fait de cliquer sur extourner perm
**Gérer la comptabilité analytique** : activez cette option afin de pouvoir gérer la comptabilité analytique. Une fois activée, cette fonctionnalité fait apparaître des nouveaux champs au niveau des paramètres de la société.
**Gérer les acomptes sous forme de facture** : activez la gestion des acomptes sous forme de facture. Les factures peuvent être de type “acompte” ou alors, une facture classique peut utiliser un produit dit “d’acompte”.
**Gérer les encours clients** : permet de gérer le niveau d'encours des clients et d'en fixer un montant maximum. Un montant maximum d'encours accepté par défaut pour tous les clients peut être fixé par défaut dans les configurations des ventes par société. Le montant d'encours accepté peut être configuré par client, dans les informations comptables des fiches clients.
**Gérer les factors** : activez la gestion des factors si vous en avez besoin.
**Gérer une période d’application Cut off** : le cut off permet de générer automatiquement les écritures de charges constatées d’avances pour respecter le principe d’indépendance des exercices.
**Mode brouillard** : une nouvelle étape Brouillard est ajoutée au niveau de l’écriture qui vous permet de simplement rédiger l’écriture. C’est une étape provisoire pour une écriture en attente de validation. Pendant cette étape là, la modification est encore possible. Lorsque vous passez à l’état Comptabilisé, l’écriture sera définitivement enregistrée et comptabilisée.
**Modifier les informations de l’opportunité**: sur la fiche d’une opportunité, modifiez les informations en cliquant sur l’icône du crayon qui se trouve en bas à droite.
**Modifier les informations du client**: sur la fiche d’un client, modifiez les informations en cliquant sur l’icône du crayon qui se trouve en bas à droite.
**Modifier les informations du contact**: sur la fiche d’un contact, modifiez les informations en cliquant sur l’icône du crayon qui se trouve en bas à droite.
**Plan de compte** : sélectionnez le plan de compte par défaut utilisé par la société.
**Prospects**: ouvrez le menu de Prospects. Ici, vous trouverez la liste contenant tous les prospects. Dans la barre de recherche, trouvez un prospect avec le nom, la séquence, le numéro de téléphone (fixe et mobile), l’email et l’adresse.
**Prévisualisation des pièces (FNP /FAE)** :
**Prévisualisation des pièces (PCA / CCA)** :
**Quand faut-il envoyer?** : a réaliser une fois par an. En fonction du régime d'imposition de l’entreprise, le délai de dépôt de la déclaration est
**Quand gérer les cut-off** : quand l’entreprise fait son bilan comptable annuel, et plus précisément à la clôture des comptes comptables.
**Quelles situations sont concernées** :
**Retenue de garantie** : la retenue de garantie est visible sur l’écriture de vente, où une partie du débit du compte client a été reportée sur le compte de retenue de garantie client.
**Récupération des données**: cependant, lors de la perte de connexion, une récupération des données est possible. La récupération des données se passe en utilisant les données du storage si c’est le cas. Dans le cas contraire, aucun résultat ne sera affiché.
**Tout / Assignés à moi**: affichez les clients, tous les clients ou ceux qui sont seulement assignés à l’utilisateur.
**Tout / Assignés à moi**: affichez les contacts, tous les contacts ou ceux qui sont seulement assignés à l’utilisateur.
**Tout / Assignés à moi**: affichez les opportunités, toutes les opportunités ou celles qui sont seulement assignées à l’utilisateur.
**Tout / Assignés à moi**: affichez les pistes, toutes les pistes ou celles qui sont seulement assignées à l’utilisateur.
**Voir la répartition par emplacement de stock**: cliquez ici afin de consulter la répartition par emplacement de stock.
**Équivalent à l’amortissement fiscal** : vous avez la possibilité d’avoir un amortissement différent de l’amortissement fiscal. Le fait de décocher cette case vous offre la possibilité de paramétrer votre amortissement réel (c’est-à-dire, changer la méthode de calcul). Vous pouvez également changer la date de référence pour première dépréciation.
**Étapes de l'assistant**:
-Ajout du mode blocage de la génération des écritures comptables (de sortie ou toutes écritures).
-Un bouton permettant de créer une immobilisation “importée” (ou reprise) en saisie manuelle a été ajouté.
1.   **Sujet**: renseignez le sujet.
1.  **+**: cliquez sur **+** afin de créer un nouveau chronomètre.
1.  **+**: cliquez sur l’icône \*\*+\*\*sur la page de Correction de stock en haut à droite pour créer une nouvelle correction.
1.  **AOS v6.4+** : Stock / Production
1.  **Accès au dossier de production**: cliquez sur les trois points en haut à droite afin d’y accéder.
1.  **Accès** : Config applicative → Gestion des applications → Comptabilité, configurer → cliquez sur la société en bas de la page.
1.  **Activer la gestion de l’emplacement de stock par défaut** : l’option “Activer la gestion de l’emplacement de stock par défaut” vous permet de gérer l’emplacement de stock par défaut.
1.  **Activer le mode de sélection des frais**: cliquez sur l’icône de la carte bancaire en haut à droite afin d’activer le m
1.  **Activer le mode hors ligne**: cochez la case si vous souhaitez activer le mode hors ligne.
1.  **Activer les modules**: pensez à activer les modules nécessaires, comme les modules RH et Data Capture.
1.  **Activité DAS2** : il s’agit de l’activité du fournisseur à qui il faudra payer les honoraires. Cette valeur est une donnée indicative qui par la suite pourra être utilisée dans le formulaire de déclaration. Vous pouvez consulter ou éditer la liste de ces activités depuis le menu Activité DAS2.
1.  **Affichage des raccourcis**: sélectionnez l’affichage des raccourcis (Grille ou Ligne).
1.  **Associer une feuille de temps**: sélectionnez une feuille de temps dans un champ dédié.
1.  **Barre de recherche**: ici, vous pouvez chercher un ordre de fabrication en utilisant la référence.
1.  **Barre de recherche**: tout en haut, se situe la barre de recherche (Ref) qui vous permet de rechercher le mouvement grâce à sa référence.
1.  **Connexion**: il s’agit d’un paramètre obligatoire. La récupération des données hors-ligne a lieu grâce à la configuration.
1.  **Date**: renseignez la date.
1.  **Description** : renseignez la description.
1.  **Filtre sur la date de prélèvement**: utilisez ce filtre afin de trouver un relevé de contrôle en fonction de la date de prélèvement.
1.  **Génération des cut-off** : permet d’ouvrir le batch de génération des cut-off.
1.  **Gérer une période d’application cut-off** : cette option permet d’afficher un encart de saisie de période de cut-off au niveau des lignes de facture et des lignes d’écritures utilisant le compte comptable associé. Quand cette option est active, la saisie de la période de cut-off est alors obligatoire pour le compte associé.
1.  **Justificatif**: ajoutez une photo ou téléchargez un fichier afin d’ajouter un justificatif.
1.  **Les factures** dites “factorisées”, celles-ci sont identifiées afin de les céder à la société d’affacturage.
1.  **Libellé** : définissez le nom de la ligne de méthode de recouvrement. Par exemple, “Email”.
1.  **Mobile apps**: il s’agit de l’activation des applications. L’installation du module web associé est nécessaire pour activer une application. Par exemple, pour activer le module Stock sur l’application mobile il est nécessaire d’installer le module Stock en application web.
1.  **Modèle**: sélectionnez le modèle à récupérer.
1.  **Onglet Contenu - période d’application Cut off** : au niveau de la facture, un nouvel encart “Période d’application Cut off” est disponible dans l’onglet Contenu. Celui-ci permet de préciser la période de cut-off à appliquer sur les lignes de factures. La saisie à ce niveau est facultative.
1.  **P
1.  **Plan d’amortissement** : sélectionnez un plan d’amortissement.
1.  **Rôles autorisés**: il s’agit de la limitation de l’accès de l’app aux rôles sélectionnés. Par défaut, tous les utilisateurs ont accès à l’app si rien n’a été renseigné.
1.  **Validation manuelle** : si cette case est cochée, une validation manuelle de l'étape de relance est d'abord nécessaire. Vous pouvez toujours ajouter un modèle de mail.
1.  **Visualiser les sous-ordres de fabrication**: cliquez sur l’icône de branches afin de visualiser le sous-ordres de fabrication.
1.  **Voir les requêtes en attente**: le fait de cliquer sur ce bouton permet d’ouvrir le Journal de requê
1.  Accédez aux applications du téléphone pour lancer la map / un appel / un email
1.  Cliquez sur + pour créer une nouvelle immobilisation.
1.  Cliquez sur la ligne.
1.  Consultez le statut du ticket (Planifié / En cours / Résolu) et le niveau d’urgence (Faible / Normal / Élevé).
1.  Contact (contient : adresse principale / numéro de téléphone / téléphone mobile / email / site internet / réseaux sociaux).
1.  Dans l’onglet “Informations d’amortissement”, dans le tableau d’amortissement, cliquez sur une ligne d’immobilisation.
1.  Feuilles de temps (Timesheets).
1.  Le nom.
1.  Ouvrez / créez la fiche de la catégorie.
1.  Ouvrez la fiche d’un batch.
1.  Ouvrez une nouvelle fiche de la quittance subrogative.
1.  Premièrement, il faut activer la gestion des factores dans l’App Comptabilité.
1.  Support client.
1.  Sélectionnez un tiers.
1.1. Accès : Comptabilité → Ecritures → Ecritures. Depuis le menu Ecritures, vous allez accéder à la liste d'écritures. Depuis la liste, plusieurs informations sont immédiatement disponibles, comme par exemple la référence, l'état ou l'origine fonctionnelle.
1.1. Accès : Config applicative → Gestion des applications → Comptabilité, configurer. Sur l'image : les configurations globales de l'app Comptabilité.
1.1. Accès : Config applicative → Gestion des applications → Utilisateurs / Société → Sociétés → ouvrez la fiche de la société concernée cliquez sur le bouton Configurations des comptes comptables qui se trouve à droite sur la fiche de la société.
10.  **Calculer l’amortissement** : cliquez sur ce bouton afin de calculer l’amortissement. Après avoir cliqué sur le bouton “Calculer l’amortissement” le tableau d’amortissement se remplit suivant les paramètres définis.
10.  **Créer**: cliquez sur le bouton “Créer” afin de créer le ticket.
10.  **Imprimer/exporter** : cliquez sur le bouton imprimer / exporter. Ici, vous avez la possibilité d’imprimer / exporter le document pour le factor (disponible uniquement à partir du statut “Quittance transmise”).
10.  **Journaux de recherche** : vous pouvez également limiter la recherche en sélectionnant un journal sur lequel vous souhaitez limiter la recherche.
10.  **Valider** : sélectionnez les lignes qui vous intéressent et cliquez sur le bouton “Valider”.
10.  Achats internes.
11.  **Comptabiliser la quittance** : une fois que vous avez transmis la quittance, vous pouvez la comptabiliser. Cliquez sur le bouton “Comptabiliser la quittanc
11.  **Informations d’amortissement** : suite au lancement du calcul, ici, vous allez trouver le calcul établi dans le logiciel. Ce calcul se base sur les paramètres complétés dans la catégorie de l’immobilisation. Vous allez trouver les informations dans le tableau d’amortissement.
11.  **Statut écriture Cut off générée** : vous pouvez définir le statut de comptabilisation des écritures créées (Brouillard / Comptabilisée). Les statuts dépendent des statuts autorisés sur le journal. Par exemple, un autre journal peut autoriser des écritures simulées / en brouillard / comptabilisées.
11.  Une fenêtre pop up va s’afficher avec le nombre de pièces traitées et / ou le nombre d’anomalies rencontrées.
11.  Ventes.
12.  **Préfixe pour la pièce justificative** : ajoutez ici un préfixe pour la pièce justificative.
12.  **Valider** : une fois que vous avez effectué le calcul, vous pouvez valider l’immobilisation.
12.  Projet.
12.  Retournez sur la page du batch. Pensez à rafraîchir la page.
13.  **Informations** : vous pouvez consulter le détail dans l’onglet Informations, dans le tableau “Traitement de masse”. Cliquez sur une ligne afin de consulter plus de détails.
13.  **Prévisualiser les pièces à traiter**: avant de lancer le traitement, il est possible de visualiser d’abord les pièces concernées, en cochant l’option Prévisualiser les pièces à traiter.
13.  Interventions.
14.  **Lancer le cut-off comptable** : une fois toutes les informations renseignées, cliquez sur le bouton “Lancer le cut-off comptable”.
14.  **Traitement de masse** : sur la fenêtre “Traitement de masse”, vous pouvez consulter les écritures générées. Vous allez également remarquer que le montant de l’écriture correspond au montant de mouvement de stock. Vous allez également avoir le lien depuis l’écriture vers le mouvement de stock, et, au niveau du mouvement, vous allez retrouver une liste des écritures de cut-off associées.
14.  Qualité.
15.  **Lignes d’écritures concernées par le cut-off** : un nouvel onglet va s’ouvrir. Vous allez y trouver l’écriture comptable générée.
15.  Notes de frais / Feuilles de temps / Congés.
16.  Sélectionnez les écritures que vous souhaitez valider.
17.  **Générer le cut-off - Valider** : cliquez sur le bouton “Valider” afin de générer les cut-off.
18.  Si vous souhaitez consulter les informations qui ont été générées, retournez sur la fiche du batch.
19.  **Rafraîchir** : pensez à rafraîchir la fiche du batch (routine comptabl
2.   **Progression**: indiquez la progression de la tâche.
2.  **+**: si vous souhaitez créer un nouveau mouvement interne, cliquez sur l’icône **+**.
2.  **AOS v6.5+**: CRM
2.  **Accès** : Config applicative → Gestion des applications → Utilisateurs / Société → Sociétés → ouvrez la fiche de la société concernée cliquez sur le bouton Configurations des comptes comptables qui se trouve à droite sur la fiche de la société.
2.  **Action - Cut-off comptable** : à la création du batch, il faut ensuite choisir l’action Cut-off comptable.
2.  **Activer la validation** : activez cette option afin de réaliser la validation. Il existe deux possibilités :
2.  **Application automatique date comptable** : permet d’initialiser par défaut la période d'application cut-off avec la date de comptabilisation dans différents scénarios (à la création d’une facture, à la comptabilisation d’une écriture, à la génération d’une écriture depuis une saisie paiement ou une session de paiement).
2.  **Champs**: ici, définissez les champs du modèle à récupérer. Tous les champs référencés requis doivent également être renseignés. Il est nécessaire d’inclure à la fois les champs à afficher et ceux utilisés dans les filtres afin d’assurer une évaluation correcte des requêtes de l’application. Pour récupérer l’ensemble des champs de l’objet sans préciser les champs des objets liés, il suffit d’utiliser le caractère \*.
2.  **Comptabilité** : ouvrez l’onglet Comptabilité. Ici, vous allez pouvoir consulter le compte comptable associé, par exemple, le compte 622.
2.  **Condition de paiement** : vous y trouverez la condition de paiement qui est issue de la fiche tiers. Vous pouvez sélectionner une condition de paiement qui comporte plusieurs échéances (40%, 40% et 15%).
2.  **Configurations comptables - Société** : il faut ensuite définir les comptes au débit et crédit du factor dans la configuration comptable. Cliquez sur la fiche de la société afin d'accéder aux configurations comptables.
2.  **Date de début / fin**: renseignez les dates.
2.  **Dates de début / date de fin** : renseignez les dates de début / fin pour la période d’application Cut off.
2.  **Délai de déclenchement** : ce délai définit le nombre de jours après échéance d’une facture où le recouvrement doit se déclencher (attention : si la ligne n°2 est à 7J, le recouvrement ne se déclenche que 7 jours après le premier déclenchement).
2.  **Gestion des raccourcis**: dans ce tableau, ajoutez un raccourci, afin de définir des raccourcis à afficher sur la page d’accueil.
2.  **Le factor** : c’est une banque qui va acheter les factures de la société à un certain taux.
2.  **Lignes d’écriture** : ajoutez une ligne d’écriture. Renseignez le reste des informations concernant la ligne d’écriture (tiers, compte comptable, débit etc).
2.  **Minimal required version / current android build**: définition de la version minimum de l’application mobile pour la compatibilité avec l’ERP, ainsi que du dernier APK compatible pour permettre à l’utilisateur de la télécharger facilement depuis l’application mobile lors des mises à jour.
2.  **Modifier/supprimer**: sur un chronomètre déjà existant, cliquez sur l’icône du crayon pour modifier le chronomètre, ou soit, cliquez sur l’icône Supprimer afin de le supprimer.
2.  **Méthode de calcul** : sélectionnez la méthode de calcul (linéaire ou dégressive).
2.  **Nom** : donnez un nom.
2.  **Paramètres de capture des données des lignes de dépenses**: sélectionnez les paramètres à utiliser lors de la lecture OCR des notes de frais.
2.  **Personnaliser les menus**: activez la personnalisation des menus.
2.  **Pourcentage de réalisation de relevé**: le pourcentage de réalisation de relevé est directement affiché sur chaque relevé, dans une barre qui se remplit au fur et à mesure.
2.  **Projet**: sélectionnez un projet.
2.  **Réalisation des immobilisations** : permet de d’ouvrir le batch de réalisation des immobilisations. Le batch va passer sur l’ensemble des lignes d’amortissement des fiches immobilisations et procéder à la comptabilisation de toutes lignes d’amortissement économiques et dérogatoires. Les écritures générées sont par défaut au statut Nouveau. Il faut donc bien penser à les comptabiliser.
2.  **Réaliser** : cliquez sur le bouton “Réaliser” afin de pouvoir réaliser la ligne d’immobilisation.
2.  **Société** : le système indique automatiquement la société.
2.  **Statut actuel**: vous y trouverez également le statut actuel de l’ordre de fabrication. Par exemple, “En cours”.
2.  **Template**: un template est généré. Ajoutez des informations au niveau du template.
2.  **Temps de rechargement par défaut**: indiquez ici le temps de rechargement par défaut. Il s’agit du délai entre deux rechargements de données dans le storage. Par défaut, le délai est de 24 heures.
2.  **Tiers** : au niveau de la fiche du tiers (**Accès** : Config applicative → Référentiel → Tiers), ouvrez l’onglet Facturation/Paiement. Ici, associez une activité DAS2 au tiers dans le champ dédié.
2.  **Utilisation de l’application**: la récupération des données a lieu directement depuis l’ERP et les actions fonctionnelles sont directement envoyées à l’ERP.
2.  **Valider/Enregistrer**: la page de la correction de Stock va s’ouvrir. Cliquez sur “Valider” afin de la valider (configurable depuis les configurations de l’application web). Ensuite, cliquez sur “Enregistrer”.
2.  **Visualiser la disponibilité par emplacement**: cliquez sur l’icône afin de visualiser la disponibilité par emplacement.
2.  Adresses.
2.  CRM.
2.  Il est également possible de copier le contenu / de le modifier / ou d’ajouter une information.
2.  Le code.
2.  Notes de frais (Expenses).
2.  Par la suite, vous allez lancer un batch de recouvrement.
2.  Saisissez le nom de l’immobilisation.
2.  Sélectionnez un ordre de fabrication.
2.  Une barre de pourcentage vous informe de la progression de la tâche.
3.   **Projet**: sélectionnez un projet.
3.  **+**: à côté du produit contenu dans un ordre de fabrication, cliquez sur **+** afin d'incrémenter la quantité consommée.
3.  **AOS v7.1+**: Support client
3.  **Activer l’ajout des lignes**: activez cette option si vous souhaitez ajouter des lignes. Les lignes peuvent être ajoutées dans deux cas :
3.  **Appliquer les dates** : en saisissant une période d’application, cliquez sur le bouton “Appliquer les dates” pour mettre à jour l’ensemble des lignes de facture.
3.  **Configuration rapports/exports comptables** : si vous cliquez sur le compte comptable, vous allez pouvoir consulter “Configuration rapports/exports comptables” qui contient le champ “Type de service (DAS2)”.
3.  **Contrôle des données en base** : permet d’ouvrir le batch de contrôle de cohérence des écritures comptable (il s’agit de lancer les mêmes contrôles exécutés à la comptabilisation d’une écriture. Exemple : vérifier la période, période de cut-off, etc).
3.  **Dates** : la date d’écriture doit toujours correspondre au dernier jour du mois sélectionné. La date de l’extourne est quant à elle correspond au premier jour du mois suivant.
3.  **Enregistrer** : enregistrez les modifications apportées.
3.  **Factor** : le système indique automatiquement le factor.
3.  **Factor** : sur les configurations comptables, dans l’onglet Comptabilité, trouver la rubrique “Factor”. Ici, vous allez pouvoir paramétrer le compte “Compte débit factor” (par exemple, 467100) et le compte “Compte crédit factor” (par exemple, 467200). La quittance est comptabilisée et elle va être transmise, et ça va générer des écritures directement sur ces comptes.
3.  **Feuilles de temps**: accédez aux feuilles de temps.
3.  **Général**: il s’agit des configurations générales de l’application (générer le code-barre / voir les tracebacks /voir les vues web).
3.  **La quittance subrogative** : c’est le document contractuel entre la société et factor listant les factures cédées.
3.  **Ligne de mouvement interne**: lorsque vous ouvrez la page du mouvement interne, vous allez pouvoir rechercher la ligne de mouvement interne avec le numéro de série / le code / le nom du produit / la séquence / le numéro de série du numéro de suivi.
3.  **Modifier les informations de la piste**: en bas à droite se trouve l’icône du crayon. Cliquez sur l’icône du crayon qui se trouve en bas à droite afin de modifier les informations de la piste.
3.  **Modifier les informations du ticket**: cliquez sur l’icône du crayon en bas à droite afin de modifier le ticket.
3.  **Modèle hors ligne**: ajoutez des modèles hors-ligne. Il s’agit du paramétrage des données à synchroniser pour utiliser l’application en mode hors-ligne. Ce paramétrage est indispensable pour garantir le bon fonctionnement du mode hors-ligne sur l’application mobile.
3.  **Montant min** : solde débiteur minimal pour déclenchement (il ne s’agit pas des factures, mais du solde de client). Si le montant minimal n’est pas atteint, le recouvrement ne sera pas lancé.
3.  **Nombre d’amortissement** : dans la partie Périodicité, dans l’onglet Amortissement, sélectionnez le nombre d'amortissements.
3.  **Origine fonctionnelle** : définissez l’origine fonc
3.  **Pourcentage de réalisation du relevé sur cet échantillon**: sur chaque relevé, vous allez également pouvoir consulter le pourcentage de réalisation du relevé sur cet échantillon.
3.  **Rôles concentrés**: il s’agit de la limitation des données à un groupe de rôles. Par défaut, si rien n’a été renseigné, cette configuration s’applique pour tous les utilisateurs.
3.  **Synchronisation de la file d’attente**: il s’agit d’un envoi des requêtes en attente dans l’ordre à l’ERP pendant la récupération de la connexion. En cas de conflit, c’est l’ERP qui prend le dessus. En cas de nouvelle perte de connexion, la requête retourne en file d’attente et la synchronisation s’interrompt.
3.  **Sélectionner tous les menus**: ce bouton permet d’ajouter à la liste tous les menus de l’application mobile liés à l’application parente, stock sur l’exemple.
3.  **Tableau de bord**: dans ce tableau, ajoutez un tableau de bord, afin de définir des tableaux de bord à afficher sur la page d’accueil.
3.  **Type de service (DAS2)** : ouvrez la fiche “Type de service (DAS2)”. **Accès** : Comptabilité → Configuration → Financière → Type de service (DAS2). Cet objet est de nature technique, c’est-à-dire, il va vous permettre d’identifier les lignes d’écriture à déclarer en fonction du type. Ici, vous pouvez cocher la case “Montant à déclarer”.
3.  **Type d’immobilisation** : indiquez le type d’immobilisation.
3.  **Type** : sélectionnez le type (PCA / CCA / FNP / FAE).
3.  **Tâche**: renseignez la tâche.
3.  **Valider le modèle**: cliquez sur le bouton “Valider le modèle” afin de valider les données pour générer les frais.
3.  **Échéances** : ouvrez l’onglet Echéances. Dans cet onglet, vous allez trouver la liste de toutes les échéances qui vont être générées.
3.  Ajoutez des lignes dans le tableau “Les lignes de méthodes de recouvrement”.
3.  Dates réelles et estimées.
3.  Demandes de congés (Leaves).
3.  Indiquez la quantité.
3.  Informations générales.
3.  Par la suite, ouvrez une fiche de recouvrement afin de la valider.
3.  Production.
3.  Sur la fiche d’un ordre de fabrication existant, vous pouvez consulter les informations essentielles :
4.   **Client**: sélectionnez un client.
4.   **Récupérer les factures des clients factorisés** : cliquez sur le bouton “Récupérer les factures des clients factorisés” (au préalable, il faut avoir des factures).
4.  **AOS v7.2+**: Notes de frais
4.  **Activer la synchronisation automatique**: cochez cette case si vous souhaitez activer l’option. Cette option permet d’activer la synchronisation automatique des données dès que l’utilisateur retrouve une connexion. Si cette option est désactivée, la synchronisation devra être lancée manuellement par l’utilisateur.
4.  **Activer la vérification des lignes**: activez la vérification des lignes. Il existe quatre possibilités :
4.  **Activité**: par exemple, sélectionnez parmi Charge / Chef de projet / Commercial / Consultant.
4.  **Catégorie** : sélectionnez la catégorie d’immobilisation.
4.  **Contenu** : ajoutez du contenu dans la facture. Par exemple, un disque dur.
4.  **Dates** : la date d’écriture doit toujours correspondre au dernier jour du mois sélectionné. La date de l’extourne est quant à elle correspond au premier jour du mois suivant.
4.  **Démarrer le relevé**: cliquez sur un relevé. Sur la fiche du relevé, afin de le démarrer, cliquez sur l’icône qui se trouve à côté de la barre de pourcentage en haut de la page.
4.  **Editions réglementaires** : permet d’ouvrir la vue d’édition de rapports comptables (balance, bilan, compte de résultat, grand livre,etc) qui peuvent être utilisés lors de la clôture.
4.  **Envoyer les informations de navigation**: cliquez sur ce bouton afin d’envoyer des menus et écrans vers l’ERP. Cette étape est obligatoire pour personnaliser les menus. Le bouton se trouve dans les paramètres de l’application mobile (Profil utilisateur → cliquez sur le bouton de rouage afin d’ouvrir la page Paramètres).
4.  **Général / Stock / RH / Vente / Projet / GED**: il s’agit des configurations spécifiques, propres à chaque module.
4.  **L’icône du
4.  **Montant à déclarer** : quand l’option “Montant à déclarer” en DAS2 est cochée, cela implique que cette ligne sera déclarée.
4.  **Notification** : elle fait référence à un processus où la société d'affacturage informe le débiteur (le client de l'entreprise vendeuse) du changement de propriété de la facture. Cela intervient après que l'entreprise a cédé ses factures impayées à la société d'affacturage.
4.  **Recouvrement créances - Factor** : cliquez sur l’onglet “Recouvrement créances” et configurez le factor. Sur le champ “Factor”, sélectionnez un tiers factor.
4.  **Société** : sélectionnez une société sur laquelle cette immobilisation sera sélectionnable.
4.  **Statut**: sur un ordre de fabrication, il est également possible de visualiser son statut (planifié / en cours / en pause / réalisé).
4.  **Synchronisation des données**: il s’agit d’une mise à jour du storage suite à la synchronisation de la file d’attente.
4.  **Temps pour recharger**: définit l’intervalle de temps entre deux rechargements des données dans le stockage local. Par défaut, la valeur de ce champ est héritée de la configuration globale. Lors de la récupération, une date d’expiration est calculée sur la base de cet intervalle. Une fois cette date dépassée, une synchronisation est automatiquement déclenchée dès que l’application retrouve une connexion internet.
4.  **Type de période** : sélectionnez entre Année ou Mois.
4.  **Type** : sélectionnez le type (PCA / CCA / FNP / FAE). Ici, c’est FNP / FAE. Dans le cas des **FNP et FAE**, des options supplémentaires sont disponibles.
4.  **Valeur comptable** : vous allez remarquer que la valeur comptable a été mise à jour suite à la réalisation de la ligne d’immobilisation.
4.  **Validation manuelle** : si cette case est cochée, une validation manuelle de l'étape de relance est d'abord nécessaire. Vous pouvez toujours ajouter un modèle de mail.
4.  **Valider / Ventiler** : à la validation / ventilation de la facture, l’écriture d’achat est générée.
4.  **Valider le recouvrement** : cliquez sur le bouton “Valider le recouvrement” afin de le valider.
4.  **Valider** : à la fin de la saisie, cliquez sur le bouton “Valider”.
4.  Durée planifiée / Poste de chargé / Machines.
4.  Employés.
4.  Stock.
5.   **Contact client**: sélectionnez le contact client.
5.   **Description de l'écriture** : donnez une description de l’écriture.
5.   **Détails de la quittance** : suite à la récupération des factures des clients factorisés, les factures vont apparaître dans le tableau “Détails de la quittance”.
5.  **AOS v8.0+**: Feuilles de temps / Qualité / DataCapture
5.  **Calcul du résultat de l’exercice** : ouvre dans une nouvelle fenêtre le calcul du résultat de l’année, en calculant de solde net
5.  **Commencer**: cliquez sur le bouton “Commencer” afin de lancer l’ordre de fabrication.
5.  **Compte comptable** : afin de faire le lien entre le type de service et les lignes d’écriture, vous allez associer un type de service à chaque compte comptable. **Accès** : Comptabilité → Configuration → Financière → Comptes comptables. Un compte comptable peut avoir comme type de service “Collectif DAS2”.
5.  **Compte fournisseur (FNP) / Compte client (FAE)** : vous pouvez choisir le compte fournisseur pour FNP ou le compte client pour FAE si vous souhaitez utiliser un compte différent de la configuration dans la société.
5.  **Configuration de l’application**: gestion des autorisations et des menus
5.  **Durée**: indiquez la durée.
5.  **Délai d’attente par défaut**: renseignez ici le délai d’attente en secondes avant l’échec de la requête de synchronisation.
5.  **Enregistrer un paiement** : enregistrez le paiement, par exemple, d’un montant de 1000. Vous avez la possibilité de consulter les montants proratisés pour chaque ligne au niveau de la réconciliation de la ligne de paiement et la ligne d’achat.
5.  **Factorisé** : définissez un client comme “Factorisé” (il est également possible de le faire depuis la fiche client). **Accès** : Ventes → Client → Onglet client → cochez la case “Client factorisé”.
5.  **Fournisseur** : renseignez le fournisseur.
5.  **Icône de trombone** : cliquez sur l’icône de la trombone en haut. Ici, vous allez trouver le PDF avec l’email qui a été généré.
5.  **Menus config / menus actifs**: configuration des menus (ordre, accès et autorisations). Par défaut, tous les utilisateurs ayant accès à l’application parente, ont l’accès aux menus sur lesquels aucun rôle n’est renseigné. Pour retirer un menu de l’application, il suffit de le supprimer de la liste.
5.  **Modèle de message** : ajoutez ici un modèle de mail / courrier. Sachez que vous pouvez attacher un modèle BIRT à votre modèle de message.
5.  **Méthode de remplissage**: une fois vous avez démarré le remplissage, sélectionnez une méthode de remplissage (par échantillon / par caractéristique).
5.  **Prorata temporis** : cochez cette case si vous souhaitez utiliser le prorata temporis. Lorsque cette case est cochée, vous pouvez choisir entre Prorata temporis utilisée en Europe, ou soit vous pouvez cocher la case supplémentaire “Utiliser US prorata temporis”.
5.  **Règle**: la règle JPQL pour filtrer les données à récupérer.
5.  **Validation automatique des immobilisations générées depuis les factures** : cochez cette case si vous souhaitez activer la validation automatique des immobilisations générées depuis les factures.
5.  Créer votre propre module.
5.  Dans la partie dédiée au temps, réalisez la saisie des lignes de temps.
5.  Si vous avez sélectionné une condition de paiement avec plusieurs échéances, les échéances vont être séparées en plusieurs lignes (40%, 40% et 15%).
5.  Évènements.
6.   **Extourne automatique** : en cochant l’option “Extourne automatique”, le traitement génère également l’extourne de l’écriture de cut-off sur l’exercice suivant.
6.   **Type**: sélectionnez le type.
6.   Enregistrez les modifications apportées.
6.  **AOS v8.1+**: Interventions
6.  **Commentaires**: laissez un commentaire.
6.  **Compte comptable à l’achat** : renseignez le compte comptable à l’achat.
6.  **Message sur l’impression** : renseignez le message qui va apparaître sur Courrier.
6.  **Paramètres**: trouvez ici les paramètres de la règle JPQL avec des éléments Groovy.
6.  **T.T.C** : si l’option T.T.C est cochée, vous allez générer une écriture en utilisant le montant TTC. Par contre, les lignes d’écriture de taxe ne seront pas générées.
6.  **Valider / Ventiler** : cliquez sur le bouton “Valider” afin de valider la facture. Ensuite, vous pouvez ventiler la facture.
6.  **État de réalisation du relevé**: dès que le relevé a été réalisé, et la méthode de remplissage a été sélectionnée, vous allez pouvoir consulter l’état de réalisation du relevé qui sera affiché.
6.  Fonctionnalités générales. Inclue :
6.  Opportunités.
6.  Si vo
7.   **Lettrer automatiquement**: en cochant l’option “Lettrer automatiquement”, l’extourne est automatiquement réconciliée à l’écriture de cut-off. Cette case apparaît seulement si vous avez coché la case “Extourne automatique”.
7.   **Priorité**: indiquez la priorité.
7.   **Transmettre quittance** : cliquez sur le bouton “Transmettre quittance” afin de pouvoir transmettre la quittance.
7.   Sentinel.
7.  **AOS v8.2+**: Projets / Ventes
7.  **Boutons en bas de page**: sur la fiche d’un relevé, vous allez trouver des boutons. Ces boutons permettent la navigation entre les lignes de relevé en fonction du mode de remplissage choisi. L’icône donne un indicateur sur le type du prochain relevé : nouvelle caractéristique ou nouvel échantillon.
7.  **Ecriture comptable** : à la ventilation de la facture, l’écriture comptable de vente / d’achat va être générée. Retrouvez cette écriture dans l’onglet Comptabilité. Il suffit de cliquer sur le numéro de l’écriture. En comparaison avec une ligne d’écriture classique, vous avez une ligne supplémentaire : 411700 (Retenue de garantie).
7.  **Mention spécifique** : renseignez une mention spécifique sur Courrier.
7.  **Plan d’amortissement** : le plan d’amortissement est chargé automatiquement depuis la catégorie. Vous pouvez le modifier sur la fiche de l’immobilisation.
7.  **Sélectionner des chronomètres**: cliquez sur un chronomètre. Ensuite, cliquez sur le bouton “Déclarer”. Une nouvelle fenêtre **Sélectionner des chronomètres** va s’ouvrir. Ici, sélectionnez une feuille de temps à lier.
7.  **Taxes récupérées** : si l’option “Taxes récupérées” est cochée, vous allez générer une écriture en utilisant le montant TTC, tout en incluant le ligne d’écriture de taxe (par exemple, vous avez d’un côté le montant TTC de 1200 et en contrepartie le montant HT 1000 € + ligne de taxe à 200 €).
8.   **Date de début / de fin / date limite**: renseignez les dates.
8.   **Description de l'écriture d’extourne** : donnez une description de l’écriture d’extourne.
8.   **Numéro de la séquence** : suite à la transmission, le système va attribuer un numéro de la séquence à la quittance.
8.   DataCapture.
8.  **AOS v8.3+**: Congés / Achats internes / GED
8.  **Enregistrer un paiement** : la dernière étape est de procéder au paiement. La fenêtre pop-up de Paiement va s’ouvrir. Le système par défaut va vous proposer de payer la première échéance. Vous y trouverez deux tableaux, “Échéances de factures impayées” et “Paiements des échéances”. Dans le tableau “Paiements des échéances”, vous allez trouver les détails sur ce que vous allez payer avec le montant indiqué (le champ Montant payé). Cliquez sur OK. A la validation, le paiement va s’imputer comme lorsque vous faites un paiement unitaire classique.
8.  **Fiches immobilisations associées** : dans cet onglet, vous pouvez associer l’immobilisation à une autre fiche de l’immobilisation existante.
8.  **Inclure les produits non gérés en stock** : l’option “Inclure les produits non gérés en stock” va prendre en compte dans la recherche les lignes de mouvements de stock associées à un produit non géré en stock.
8.  **Valider**: cliquez sur le bouton “Valider” (sous forme de coche), afin de valider la conformité.
8.  Afin d’appliquer ces méthodes, passez par les Config applicatives.
9.   **Date de transmission** : par la suite, une date de transmission apparaît sur la fiche de la quittance subrogative. La quittance subrogative doit être envoyée à cette date (en PDF / en CSV). Utilisez le bouton “Imprimer / exporter” pour le faire.
9.   **Durée**: renseignez la durée.
9.   **Journal de comptabilisation (O.D.)** : vous pouvez également choisir le journal dans lequel seront comptabilisées les écritures. Par exemple, O.D. manuelles.
9.   GED.
9.  **Commentaires** : dans cet onglet, ajoutez des commentaires sur l’immobilisation.
9.  **Lancer le cut-off comptable**: en lançant le traitement, vous allez chercher les lignes de mouvement de stock liés à des bons de livraison ou réception qui ont des quantités non-facturées et une date de mouvement intérieure à la date de l’écriture saisie dans le batch.
9.  **Échéances** : suite au paiement, lorsque vous retournez sur la page de la facture, dans l’onglet Echéances, vous allez voir quelle ligne a été payée (elle sera marquée comme payée). Vous pourrez également voir la colonne avec le Montant restant à payer.
===== https://docs.axelor.com/aos/8.0/ | Introduction | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/crm/crm_intro | CRM | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/general_presentation/advanced/OCR | OCR | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/general_presentation/advanced/offline | Mode hors-ligne | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/general_presentation/basic/basic_features_config | Fonctionnalités de base & Configuration | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/general_presentation/basic/introduction | Présentation générale | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/helpdesk/helpdesk_intro | Support Client | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/hr/hr_intro | RH | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/manufacturing/manufacturing_intro | Production | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/quality/quality_intro | Qualité | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aom/stock/stock_intro | Stock | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/acc_entry | Ecritures comptables | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/analytic | Comptabilité analytique | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/close_account | Clôture comptable | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/config_accounting | Configurations comptables | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/cut_off/batch_FNP | Batch des cut-off FNP / FAE | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/cut_off/batch_PCA | Batch des cut-off PCA / CCA | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/cut_off/config_cut_off | Configurations du cut-off | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/cut_off/cut_off_entry | Saisie d’une période de cut-off depuis une facture / écriture | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/cut_off/intro | Cut-off | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/das2 | Déclaration d’honoraires | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/debt_recovery | Recouvrement | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/duedate&discount | Échéances & escomptes | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/factoring | Affacturage | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/fixed_assets/config_immo | Configurations générales et comptables d'immobilisations | Axelor Open Suite =====
===== https://docs.axelor.com/aos/8.0/aos/accounting/fixed_assets/create_asset | Créer une immobilisation | Axelor Open Suite =====
A la création d’une nouvelle ligne de facture et en sélectionnant un compte comptable prenant en charge la période de cut-off, cette période est pré-remplie automatiquement avec les valeurs de l’en-tête (période de la facture). Vous avez évidemment la possibilité de changer les dates.
A la ventilation de la facture, les périodes de cut-off sont reportées sur les lignes d’écritures associées.
Afin de créer une nouvelle correction de stock:
Afin de pouvoir gérer les taxes, deux options sont disponibles : Taxes récupérées et T.T.C
Afin de pouvoir identifier dans l’outil les prestations qui relèveraient d’activités à déclarer en tant qu’honoraires, il faut réaliser quelques configurations.
Aller au contenu principal
Assurez-vous que vos écritures sont bien au stat
Attention, le factor doit être configuré en amont pour pouvoir le sélectionner en tant qu’un tiers factor.
Au 31 décembre N, il faudra comptabiliser en charge/produit constaté d’avance le montant de la location correspondant à la période allant du 1er janvier N+1 au 30 juin N+1. Soit un montant de 10 000€ ( 20 000€ x 180\* jours / 360 jours ). Puis extourner l’écriture à l’ouverture de l’exercice suivant. \*Dans un souci de simplification, le nombre de jours a été arrondi à 180. Le nombre exact de jours dépendra également de l’année.
Bienvenue dans la documentation de Axelor Open Suite. Ici vous trouverez des informations et des ressources pour vous aider à mieux connaître Axelor Open Suite.
Ce batch permet de générer les écritures de cut-off ainsi que l’extourne si cette option est cochée.
Cependant, il est possible de filtrer les écritures selon leur état. Sélectionnez **annulé** afin d'afficher les écritures annulées.
Cependant, un certain nombre de flux (hors système) nécessite une comptabilisation “manuelle”. Il s’agit par exemple des factures de frais généraux qui ne font pas l’objet de commande ni de contrat ou bien encore les salaires et les charges sociales etc …
Ces motifs seront utilisés sur les immobilisations déj
Cliquez sur une piste afin de l’ouvrir. Sur la fiche d’une piste :
Compatibilité avec les douchettes Zebra Android (MC9300, MC3300, …).
Comptabilisation du cut-off. Dans l’exercice à clôturer :
Dans Axelor, il y a quatre notions importantes :
Dans ce menu vous allez trouver la liste avec tous les motifs de sortie des immobilisations par défaut. Vous pouvez les modifier et créer de nouveaux motifs.
Dans cet exemple, il faut créer une ligne d’écriture.
Dans cet onglet, renseignez le Journal, ainsi que les comptes utilisés dans l’amortissement dérogatoire / l’amortissement IFRS / l’amortissement / la Cession d’actifs.
Dans cet onglet, sélectionnez un modèle de répartition analytique.
Dans la partie “Configuration de l’application”, cliquez sur une application que vous souhaitez configurer. Une fenêtre pop-up va s’ouvrir :
Dans le Suivi des frais, il est possible de :
Dans le cadre de l’harmonisation des technologies chez Axelor, notre application mobile a été entièrement repensée avec le framework React Native. Conçue pour être hautement modulable, cette nouvelle version ne contient aucun code métier. Elle échange uniquement avec le back-end via des appels API, ce qui permet de centraliser le code métier sur la version web. Elle s’intègre parfaitement à notre ERP, en apportant une gestion simplifiée des processus et en faisant gagner du temps aux opérateurs.
Dans le cas des FNP et FAE, le processus va chercher les lignes de mouvement de stock (livraison/réception) ayant des quantités non facturés et dont la date est antérieure à la date de l’écriture.
Dans le cas des PCA et CCA, le processus va chercher les lignes d’écritures comptables dont la période d’application de cut-off comprend la date de l’écriture.
Dans le menu Catégories d’immobilisations, vous allez trouver de nombreuses catégories d’immobilisations (par exemple, Matériel de transport / matériel informatique / mobilier etc).
Dans le menu Client, vous allez pouvoir consulter les clients existants, ainsi que de visualiser leurs informations de contact etc.
Dans le menu Contacts, vous allez pouvoir consulter les contacts existants.
Dans le menu Opportunités, vous allez pouvoir consulter les opportunités existantes, ainsi que de voir leur score / les informations de contact etc.
Dans le menu Pistes, vous allez pouvoir consulter les pistes existantes, ainsi que de voir leur score / les informations de contact etc.
Dans le menu Tickets, il est possible de faire la recherche d’un ticket en utilisant :
Dans le menu Échéanciers, vous allez pouvoir consulter l’intégralité des échéances de toutes les factures confondues, à des fins de monitoring ou de reporting par exemple.
Dans le menu “Immobilisations”, vous allez trouver la liste avec toutes les immobilisations créées. Ici, vous allez trouver l’état de votre immobilisation, ainsi que la société sur laquelle vous avez créé les immobilisations (en cas de multi-société).
Dans le menu “Opération de fabrication” il est possible de faire la recherche dans les barres dédiées :
Dans le module RH, les menus sont séparés en trois catégories :
Dans le module RH, plusieurs fonctionnalités et actions sont disponibles :
Dans le module Stock, il est toujours possible de recourir à la correction de stock. Ouvrez le menu “Correction de stock”.
Dans le panel à votre droite vous allez trouver des informations concernant l’immobilisation, comme la date l’acquisition, la date de premier service ou encore la valeur brute (coût d’acquisition de l’immobilisation).
Dans le tableau “Modèle hors ligne”, sélectionnez un modèle ou ajoutez un nouveau. Une nouvelle fenêtre avec les paramètres à renseigner va être ouverte.
Dans les configurations de l’app Comptabilité, vous allez trouver plusieurs fonctionnalités globales qui vont s’appliquer.
Dans les configurations, vous allez trouver trois types de configuration :
Dans les réglages du module Stock, activez une ou plusieurs options.
Dans les types d’immobilisations, vous allez trouver quatre types d’immobilisations. Vous avez la possibilité de personnaliser les noms des immobilisations. Par défaut, vous trouverez les immobilisations suivantes :
Dans les écritures comptables vous allez pouvoir retrouver l’écriture comptable associée à votre immobilisation.
Dans l’application mobile, accédez aux catalogues. En ouvrant le menu “Catalogues”, il est possible de rechercher un catalogue dans la bar
Dans l’exemple, la facture possède deux lignes de facture : une de Maintenance annuelle et une autre de Commissions sur achats.
Depuis la version 8.3, les fichiers joints sont gérés via le module GED. Il est donc nécessaire d’avoir ce module intégré à l’application pour accéder aux fichiers associés aux différents objets.
Depuis le menu Support client, consultez les menus :
Depuis une facture ventilée, lorsque le multi-échéances est activé, l’écran d’enregistrement du paiement est modifié. Vous y retrouvez :
Documentation fonctionnelle
D’abord, il faut installer le module Comptabilité.
En cliquant sur “Générer la contrepartie”, le compte de TVA et le compte fournisseur ainsi que les montants calculés sur la base du hors taxe saisie s'alimentent automatiquement.
En créant une méthode de recouvrement vous allez renseigner :
En créant une écriture par cette interface (menu Ecritures), il y a des automatismes qui vont permettre d’assister l’utilisateur.
En outre, il est possible de réaliser et suivre les mouvements internes de stock. Ouvrez la page “Movements internes”.
En version 8.1., des nouveautés ont été introduites.
Envoi des traductions nécessite une intervention de l’administrateur.
Grâce au module Qualité, réalisez le suivi et la réalisation des relevés de contrôle.
Grâce au module Stock, vous avez la possibilité de :
Grâce au module Support Client, il est possible de :
Grâce à la fonctionnalité de Notes de frais du Module RH, plusieurs actions sont disponibles sur l’application mobile :
Gérez les feuilles de temps et les chronomètres au niveau depuis le menu Feuilles de temps :
Il est d’abord nécessaire d’activer les cut-off au niveau du module Comptabilité.
Il est primordial de configurer le recouvrement afin de pouvoir par la suite lancer le traitement de masse qui va permettre de relancer les clients sur les factures impayées.
Il s’agit de mêmes indicateurs que sur AOS avec vue détaillée au clic.
Il y a trois outils qui vont permettre de comptabiliser ces flux :
L'objectif est de maximiser la récupération des dettes tout en maintenant une relation positive avec le client.
La case “Utiliser US prorata temporis” apparaît seulement à l’activation du prorata temporis.
La clôture comptable correspond à la clôture de l’exercice comptable. Il s’agit d’une formalité obligatoire pour toute entreprise à réaliser une fois par an.
La comptabilité analytique est un véritable outil de gestion et de pilotage de l’entreprise puisqu’il permet par le traitement des données d’expliquer les résultats financiers et de fournir les informations nécessaires à la prise de décision. Elle prend source dans la comptabilité financière générale mais pas uniquement.
La comptabilité analytique n’est pas obligatoire même si elle est conseillée et volontaire.
La création de la fiche immo depuis la saisie des écritures n’exonère pas de générer les amortissements et de valider la fiche immobilisation.
La liste d’écritures contient toutes les informations générales que vous pouvez trouver sur une fiche de l’écriture :
La plupart des écritures courantes sont générées automatiquement par le système. Les factures d’achats (générées via la facturation), les factures de ventes, les paiements, les notes de frais (gérées par l’applications NDF), les amortissements, les factures non parvenues sur les Bons de livraisons non facturés ou encore les charges constatés d’avances issues de la gestion des dates du cut off permettent de générer des écritures automatiquement.
La saisie d’une période de cut-off est nécessaire pour la génération des écritures de PCA et CCA.
Le cut-off comptable (coupure comptable) correspond aux procédures utilisées par les entreprises lors de la clôture des comptes comptables permettant de rattacher les produits et charges rencontrées par l’entreprise, à l’exercice comptable concerné. Il répond au principe comptable de séparation des exercices.
Le factor est unique par société.
Le journal analytique est un document extra-comptable **non obligatoire** qui enregistre toutes les écritures analytiques générées. Dans Axelor, même si il est possible de générer plusieurs journaux analytiques, il est nécessaire à minima de créer un journal Analytique qui permettra d’enregistrer toutes les écritures créées.
Le recouvrement est un processus par lequel une entreprise prend des mesures pour récupérer les fonds dus par les débiteurs en retard de paiement. Les principes de base du recouvrement incluent la communication claire et respectueuse avec le débiteur, le suivi régulier des paiements en retard, l'utilisation de rappels et d'avertissements, la mise en place d'accords de paiement flexibles si nécessaire, et, en dernier recours, le recours à des agences de recouvrement ou à des actions en justice.
Le type de service va vous permettre d’identifier les lignes d’écriture en TTC. ::
Le type technique est utile pour définir le type d’immobilisation. Il suffit de cliquer sur la fiche du type d’immobilisation. Les quatre types sont : Immobilisations corporelles / Immobilisations en cours / Immobilisations financières / Immobilisations incorporelles.
Les actions suivantes sont disponibles dans le module Production :
Les axes analytiques sont des valeurs qui permettent de catégoriser les écritures analytiques afin de pouvoir les suivre et les analyser sur les différents modèles, tels que les Commandes de ventes, Achats, Factures, écritures comptables. Un exemple d’Axe analytique peut être un projet ou département duquel provient l’écriture comptable.
Les axes analytiques sont rattachés à une société ou peuvent être partagés entre les sociétés sur le système (en cas de multi-société). Pour être partagé, le champ Société ne doit pas être renseigné sur l’axe analytique.
Les comptes an
Les comptes analytiques ou postes analytiques ou sections analytiques sont les éléments de détails qui sont rattachés à un axe analytique et qui permettent l’affectation des transactions financières via une ou des clés de répartition.
Les comptes analytiques sont rattachés à une société ou peuvent être partagés entre les sociétés sur le système en cas de multi-société. Si le champ société est vide c’est que le compte est partagé.
Les comptes comptables à exclure auront comme type de service “Non soumis à la DAS2”.
Les dates sont remplies automatiquement par le système. Vous pouvez modifier la date.
Les journaux peuvent être configurés via le menu Comptabilité.
Les lignes qui sont au rouge, correspondent aux mouvements pour lesquels un cut off a déjà été généré. Toutefois, vous pouvez générer un nouveau cut off.
Les lignes sont triées par séquence.
Les méthodes de recouvrement se trouvent dans le menu Méthodes de recouvrement. Si besoin, il est possible de créer plusieurs méthodes de recouvrement.
Les objectifs de la comptabilité analytique sont multiples :
Les opérations de fabrication peuvent être consultées dans le menu correspondant. Les opérations de fabrication peuvent également être visualisées dans une vue calendrier.
Les écritures analytiques sont :
Les écritures comptables doivent :
Lors de la création d’un ticket :
Lors de la création d’un timer, vous pouvez renseigner les informations suivantes :
Lors de la sélection d’un chronomètre, vous pouvez :
Lors d’un enregistrement de paiement, la ligne de la retenue de garantie n’est pas présente parmi les lignes d’échéance de facture impayées. Elle doit être traitée séparément.
Lorsque la gestion des escomptes est activée, un onglet “Escompte” apparaît sur la facture. Si le client sélectionné a un escompte renseigné sur sa fic
Lorsque vous ajoutez une ligne, vous allez devoir la paramétrer. Le paramétrage des lignes de recouvrement comporte 7 configurations :
Lorsque vous configurez les paramètres de comptabilité en utilisant la deuxième méthode, vous allez avoir des fonctionnalités additionnelles qui ne seront pas disponibles si vous accédez à la fiche de la société via Config applicative.
Lorsque vous ouvrez la fiche d’une opération de fabrication, vous allez trouver les informations et les actions suivantes :
Lorsque vous ouvrez un ordre de fabrication, il est possible d’effectuer plusieurs actions sur les produits ajoutés :
L’affacturage permet de bénéficier rapidement de trésorerie pour financer votre croissance, vos investissements ou vos besoins en fonds de roulement. Cela permet d'optimiser votre trésorerie sans attendre le paiement de vos créances commerciales par vos clients.
L’assistant accompagne l’utilisateur dans sa procédure de clôture en ayant une vision globale sur la progression de celle-ci :
L’axe analytique dispose en complément de 2 options :
L’encart “Configuration cut-off” est affiché dans l’onglet “Paramètres du compte comptable” dès lors que vous avez activé la période de cut-off dans la configuration comptable de l’application. Cet encart contient deux options à activer :
L’installation et la configuration des options depuis Axelor mobile app settings est nécessaire afin de faire fonctionner les modules présents dans l’application mobile.
Onglet Comptabilité : dans cet onglet vous allez pouvoir définir les différents comptes comptables par défaut. Vous allez avoir la possibilité de gérer les comptes clients pour vos comptes clients (comptes clients douteux / irrécouvrables / etc).
Ouvrez Axelor Mobile Offline. Complétez les informations suivantes :
Ouvrez Axelor Mobile app settings.
Ouvrez le menu Ligne de frais dans le module Ressources humaines. Créez une nouvelle ligne.
Ouvrez le menu “Ordre de fabrication”.
Ouvrez les configurations comptables par société. Il existe deux façons de le faire :
Par exemple : facture de loyers s’étalant sur plusieurs exercices comptables ; facture de location de matériels comptabilisée en fin d’année mais qui concerne totalement ou partiellement l’exercice suivant.
Par exemple, dans le tableau "Répartition du montant imputé sur les lignes d’écritures”, vous allez voir que 200 euros (sur 1000) ont été attribués au paiement de la ligne de commission. Dans la déclaration, il est nécessaire de fournir l’activité du tiers ayant réalisé la prestation. Il faut associer une activité DAS2 à un tiers fournisseur.
Par exemple, si vous sélectionnez le fournisseur APOLLO et le journal d’achat, vous allez récupérer automatiquement le mode de paiement, les conditions de paiement de la fiche tiers et le compte de charge définis par défaut.
Pensez à activer les réglages Timesheets au niveau des paramètres de Axelor Mobile settings, onglet RH, afin de pouvoir utiliser les fonctionnalités liées aux Feuilles de temps sur l’application mobile (**accès**: ouvrez l’application web → Config applicative → Gestion des applications → ouvrez Axelor Mobile settings → onglet RH → Feuilles de temps / Timesheets).
Pensez à activer les réglages au niveau des paramètres de Axelor Mobile settings, onglet RH, afin de pouvoir utiliser les fonctionnalités RH sur l’application mobile (**accès**: ouvrez l’application web → Config applicative → Gestion des applications → ouvrez Axelor Mobile settings → onglet RH).
Pensez à enregistrer les modifications apportées.
Personnalisez les traductions au niveau de l’application web.
Plateformes :
Plus concrètement, la clôture correspond à la clôture des comptes comptables :
Plusieurs fonctionnalités générales sont disponibles à l’utilisateur. Par exemple :
Plusieurs informations sont alors affichées dans le détail des lignes de mouvements de stock :
Plusieurs informations sont alors affichées dans le détail des lignes d’écriture :
Pour configurer les recouvrements, plusieurs points sont importants :
Pour obtenir une facture multi-échéances, il suffit de sélectionner une Condition de paiement comportant plusieurs échéances. Les échéances générées pourront être trouvées dans l’onglet Échéances de la facture.
Réalisez dans le module RH le suivi des frais.
Si aucune de ces options n’est cochée, vous allez générer une écriture en ne prenant en compte que le montant HT (par exemple, au montant HT de 1000 €).
Si vous relancez le calcul, vous allez par conséquent obtenir des résultats différents, c’est-à-dire, le calcul d’amortissement ne sera pas identique au calcul fiscal.
Si, par exemple, l’Axe analytique est un axe Département, alors les comptes analytiques seront les départements eux-mêmes pour affecter les écritures analytiques sur ces postes.
Suite à l’activation de cette fonctionnalité, un nouvel encart “Configuration cut-off” va apparaître sur tous les comptes comptables de **la classe 6 et 7**. Par exemple, au niveau du compte 607000.
Sur la fenêtre d’une ligne d'écriture, dans l’onglet Echéances, vous allez retrouver la liste d'échéances de facture associée à cette ligne d’écriture.
Sur la fiche d’un client, vous allez trouver les informations suivantes :
Sur la fiche d’un motif de sortie des immobilisations, vous allez trouver un nom qui indique l’origine du motif, le type de sortie (mise au rebut / cession / sortie d’immobilisation en cours), ainsi qu’un code.
Sur la fiche d’un ticket :
Sur les relevés de contrôle, vous trouverez :
Sur l’application mobile, module CRM propose plusieurs actions et possibilités :
Sur l’application mobile, ouvrez le menu Chronomètres (Timers) :
Sur l’application mobile, ouvrez les paramètres (Profil d’utilisateur → l’icône de rouage). Ouvrez le journal de requêtes.
Sur l’application web, ouvrez Axelor Mobile Settings. Cliquez sur l’onglet Stock afin de configurer le module Stock.
Un axe est caractérisé par un Code et un Nom, sachant que le Code doit être unique par société. La ventilation sur chaque Axe analytique doit toujours être égale à 100% pour s’assurer d’une parfaite cohérence des données.
Un bouton permet d’accéder à la liste des échéances dans un nouvel onglet. Par exemple, vous pouvez avoir 3 échéances de 40%, 40% et 15% ainsi qu’une retenue de garantie de 5%.
Un message d’alerte est affiché s'il existe des anomalies au niveau du template.
Une **Charge Constatée d’Avance (CCA)**, dans le cas d’un Achat, un **Produit Constaté d’Avance (PCA)**, dans le cas d’une Vente, désigne un bien ou une prestation de service qui a été facturé par une entreprise avant la clôture de l’exercice comptable sans que le bien ou la prestation de service n’ait été fourni ou réalisé totalement. Le produit étant neutralisé, la marge réalisée doit ainsi être différée vers l’exercice comptable suivant.
Une **Facture Non Parvenue (FNP)**, dans le cas d’un Achat, et une **Facture À établir (FAE)**, dans le cas d’une Vente, désigne un bien ou une prestation de service qui a été fourni ou réalisé par une entreprise avant la clôture de l’exercice comptable sans que la facture n’ait été émise ou reçue. Il est donc nécessaire de constater la marge dans l’exercice concerné afin de régulariser le décalage entre la réception du bien ou l’exécution de la prestation et la transmission/réception de la facture.
Une déclaration d'honoraires est obligatoire pour toute entreprise (entreprise individuelle ou société) qui paye des honoraires ou des commissions dans les conditions suivantes :
Une fois la fiche validée, les autres informations ne sont plus modifiables.
Une fois le module installé, passez à sa configuration.
Une fois toutes les échéances sont réglées, le système va proposer de payer la retenue de garantie. La retenue de garantie sera imputée sur un autre compte.
Une écriture analytique dans AOS est une opération consistant à enregistrer une transaction commerciale (Commande d’Achat/Vente, Facture Achats/Vente, Contrats …) ou financière (Facture Achats, Vente) à travers une ventilation sur des axes analytiques et sur chacun de ses axes par une répartition en comptes analytiques.
Une écriture comptable est une opération consistant à enregistrer une transaction commerciale, économique financière à travers l’usage d’une codification précise et formelle, c'est-à-dire les comptes comptables.
Version: 8.0
Versions :
Voici les éléments à retenir lorsque la connexion internet est en marche :
Voici un exemple de fonctionnement de recouvrement avec l’option “Validation manuelle” activée.
Vous allez accéder au menu Ecritures en vue liste, qui contient toutes les écritures enregistrées.
Vous allez pouvoir prévisualiser les pièces concernées. Comme information, vous allez avoir des quantités déjà facturées et les montants non-facturés.
Vous allez pouvoir sélectionner les factures de vos clients “factorisés” dans le menu “Quittance subrogative” et ainsi pouvoir les transmettre à votre factor, jusqu’à la génération des écritures comptables, en attendant la notification de paiement.
Vous allez retrouver dans ce menu la liste de toutes les écritures qui ont été créées, sauf les écritures annulées.
Vous allez également trouver la liste des tickets existants.
Vous pouvez créer une nouvelle catégorie d’immobilisation, ou modifier une catégorie existante.
Vous pouvez différencier les méthodes de recouvrement par catégorie de client.
Vous pouvez sélectionner plusieurs plans d’amortissement, par exemple, il peut s’agir d’un plan d’amortissement Fiscal / Economique / Dérogatoire.
Vous trouverez la documentation de l’ensemble des applications métiers.
Vous y trouverez également les comptes cut-off, les fact
astuce
attention
info
remarque
