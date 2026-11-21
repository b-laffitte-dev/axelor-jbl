-- Nettoyage de la base dev : on ne garde que l'essentiel pour l'administration
-- Axelor (menu Administration) + le module Atelier JBL.
-- - supprime l'utilisateur de démo (garde admin)
-- - cache tous les menus top-level hors Administration / Atelier JBL
--   (studio, messagerie, teamwork, calendrier, documents...)
-- Les modules axelor-studio / axelor-message restent dans le classpath car
-- axelor-base 9.x référence leurs classes au démarrage ; seuls leurs menus
-- sont masqués.
BEGIN;
DELETE FROM auth_user WHERE code = 'demo';

UPDATE meta_menu
SET hidden = true
WHERE parent IS NULL
  AND left_menu = true
  AND name NOT IN ('admin-root', 'menu-admin', 'menu-jbl-root');

UPDATE meta_menu SET hidden = true WHERE module IN ('axelor-studio', 'axelor-message');
COMMIT;
