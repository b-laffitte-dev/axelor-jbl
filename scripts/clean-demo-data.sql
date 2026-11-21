-- Nettoyage de la base dev : on ne garde que l'essentiel pour l'administration
-- Axelor (menu Administration) + le module Atelier JBL.
-- - supprime l'utilisateur de démo (garde admin)
-- - cache tous les menus top-level hors Administration / Atelier JBL
--   (studio, messagerie, crm, vente, comptabilité, stock...)
-- Les modules AOS embarqués (base, sale, account, stock + crm transitif) restent dans le
-- classpath car le module JBL s'appuie dessus ; seuls leurs menus top-level sont masqués,
-- le menu "Atelier JBL" pointe vers leurs vues via les action-view du module.
BEGIN;
DELETE FROM auth_user WHERE code = 'demo';

UPDATE meta_menu
SET hidden = true
WHERE parent IS NULL
  AND left_menu = true
  AND name NOT IN ('admin-root', 'menu-admin', 'menu-jbl-root');

UPDATE meta_menu SET hidden = true WHERE module IN ('axelor-studio', 'axelor-message');
COMMIT;
