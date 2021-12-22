CREATE TABLE `auth_user`
(
    `id`         BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `name`       VARCHAR(100)    NOT NULL,
    `username`   VARCHAR(100)    NOT NULL,
    `password`   VARCHAR(500),
    `type`       VARCHAR(100)    NOT NULL,
    `status`     VARCHAR(100)    NOT NULL,
    `created_by` BIGINT(20) UNSIGNED,
    `created_at` TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by` BIGINT(20) UNSIGNED,
    `updated_at` TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;