DROP DATABASE IF EXISTS sdjpa_order_service;

DROP USER IF EXISTS `order_admin`@`%`;
DROP USER IF EXISTS `order_user`@`%`;

CREATE DATABASE IF NOT EXISTS sdjpa_order_service CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE USER IF NOT EXISTS `order_admin`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `sdjpa_order_service`.* TO `order_admin`@`%`;

CREATE USER IF NOT EXISTS `order_user`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON `sdjpa_order_service`.* TO `order_user`@`%`;

FLUSH PRIVILEGES;