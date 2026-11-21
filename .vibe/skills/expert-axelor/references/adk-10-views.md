# ADK 10.0 — Vues objets XML (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/views/*`). **Projet = XSD object-views 8.2**, fichiers dans `src/main/resources/views/*.xml`, racine `<object-views>`.

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<object-views xmlns="http://axelor.com/xml/ns/object-views" ...
  xsi:schemaLocation="http://axelor.com/xml/ns/object-views
  https://axelor.com/xml/ns/object-views/object-views_10.0.xsd">
```

## Types de vues

| Vue | Élément | Usage |
|---|---|---|
| Grid | `<grid name model title orderBy>` + `<field>` | liste tabulaire ; n'afficher que les colonnes utiles (perf) ; `editable`, `selectable`, `onNew`... |
| Form | `<form name model title>` + panels/fields | fiche détaillée ; modes readonly/editable ; `onLoad/onSave/onNew`, `menubar`/`toolbar` avec boutons `<button action=...>` |
| Details | via `action-view` + `view-param details-view` (+ `details-view-mode="inline"`, `grid-width`) | grid + form côte à côte |
| Cards | `<cards model>` + `<field>` + `<template>` | fiches visuelles ; helpers `$image(f,img)`, `$fmt(f)` |
| Kanban | `<kanban model columnBy sequenceBy onNew limit x-collapse-columns>` | pipeline par statut (ex. OR JBL), drag & drop change le `columnBy` |
| Calendar | `<calendar model colorBy eventStart eventStop eventLength>` + `<hilite if styles>` | agenda avec drag & drop |
| Chart | `<chart>` + `<search-fields>` + `<dataset type="jpql\|sql">` + `<actions>` | graphiques ECharts |
| Dashboard | `<dashboard>` + `<dashlet action="chart:..."/>` | vue d'ensemble (dashlets = charts ou action-view) |
| Tree | `<tree>` + `<column>` + `<node model parent draggable onClick onMove>` | arborescence hiérarchique |
| Gantt | `<gantt model taskStart taskDuration taskParent taskSequence taskProgress>` | planning (modes year/month/week/day) |
| Search | `<search>` + `<search-fields>` + `<result-fields>` | recherche multi-objets |
| Custom | `<custom>` + `<dataset>` + `<template>` (React) | rapports readonly, dashboards data (widgets `DataDashboard`/`DataDashlet`/`DataWidget`/`DataChart`/`DataTable` sur data-queries) |
| Headless | `com.axelor.meta.headless` | exécute les actions d'un formulaire côté serveur sans navigateur (API, procédures IA) |

## Form — éléments structurants

`<panel title>`, `<panel-tabs>` (onglets), `<panel-related>`, `<panel-dashlet action>`,
`<panel-include view>`, `<panel-mail>`, champs avec attributs de vue : `widget`,
`colSpan`, `title`, `placeholder`, `help`, `showIf/hideIf`, `readonlyIf`, `requiredIf`,
`onChange`, `domain`, `selection-in`, `css`, `collapseIf`...

## Extension views

Pour modifier une vue existante sans la copier : même `name`, `id` unique,
`extension="true"`, puis `<extend target="xpath"><insert position="before|after|inside|replace">...`.
Préférer l'extension à la duplication (KISS).

## Menus & action-view (voir aussi `adk-10-actions.md`)

```xml
<menuitem name="menu-jbl-root" title="Atelier JBL" top="true" icon="..."/>
<menuitem name="menu-jbl-or" parent="menu-jbl-root" title="Ordres de réparation" action="jbl.repair.order.all"/>
<action-view name="jbl.repair.order.all" model="com.axelor.apps.jbl.db.JblRepairOrder" title="Ordres de réparation">
  <view name="jbl-repair-order-grid" type="grid"/>
  <view name="jbl-repair-order-form" type="form"/>
  <view-param name="limit" value="40"/>
  <domain>...</domain>
</action-view>
```
`tag`/`tag-style` (`default|important|success|warning|inverse|info|danger`) pour les
badges de menu.
