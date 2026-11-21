# Archive brute crawlée — index des sources

Contenu intégral des pages de la documentation officielle, crawlé le 2026-11-21 :

| Fichier | Contenu | Pages |
|---|---|---|
| `adk-10.0.md` | ADK/AOP 10.0 : dev-guide (application, modules, models, views, actions, web-services, data-import, data-exchange, workflows, web-client, studio, ai), getting-started, tutorial, releases, migrations, changelogs 8.x/10.0, index | 135 |
| `aos-7.2.md` | AOS 7.2 : doc fonctionnelle complète (aom mobile + aos : admin, base, budget, case_manage, contracts, crm, fleet, forecast, invoicing, marketing, production, purchases, quality, rgpd, RH, sales, stock, supplychain, treasury) | 132 |
| `aos-8.0.md` | AOS 8.0 : doc fonctionnelle partielle (aom + accounting) | 26 |

Format : `===== <url> | <titre> =====` suivi du contenu markdown de la page.

## Sources

- ADK 10.0 : <https://docs.axelor.com/adk/10.0/> (sitemap : <https://docs.axelor.com/sitemap-adk.xml>, 156 URL /adk/10.0/ dont javadoc)
  - dev-guide : <https://docs.axelor.com/adk/10.0/dev-guide/>
  - getting-started : <https://docs.axelor.com/adk/10.0/getting-started/>
  - tutorial : <https://docs.axelor.com/adk/10.0/tutorial/step1.html> … step7
  - migrations : <https://docs.axelor.com/adk/10.0/migrations/migration-10.0.html> (8.2→10.0), migration-8.2, 8.1, 8.0
  - changelogs : <https://docs.axelor.com/adk/10.0/changelogs/changelog-10.0.html> et 5.0→8.2
  - javadoc : <https://docs.axelor.com/adk/10.0/javadoc/>
- AOS : <https://docs.axelor.com/aos/> (sitemap : <https://docs.axelor.com/aos/sitemap.xml>, 245 URL)
  - racine = AOS 9.1 (FR) ; versions crawlees : 7.2 (complète) et 8.0
  - ex. ventes : <https://docs.axelor.com/aos/7.2/aos/sales/devis-client>, stock : <https://docs.axelor.com/aos/7.2/aos/stock/moves>, compta : <https://docs.axelor.com/aos/7.2/aos/accounting/acc_entry>

## Non crawlé (volontairement)

- Javadoc ADK 10.0 (API Java, volumineuse) : <https://docs.axelor.com/adk/10.0/javadoc/>
- Changelogs ADK 5.0→7.4 (hérités dans l'archive 10.0 pour 8.x/10.0 ; les 5.x-7.x restent accessibles en ligne)
- Pages AOS des versions 5.4 / 6.5 (remplacées par 7.2) et catégories (`/aos/7.2/category/*`, pages d'index)
- AOS 9.x FR (servie à la racine `/aos/` mais hors sitemap)
