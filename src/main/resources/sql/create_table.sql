CREATE TABLE IF NOT EXISTS `t_user` (
  `user_name` varchar(256) NOT NULL,
  `phone_number` char(11) NOT NULL,
  `id_number` char(18) NOT NULL,
  `encrypted_user_name` varchar(576) NOT NULL DEFAULT '',
  `encrypted_phone_number` varchar(352) NOT NULL DEFAULT '',
  `encrypted_id_number` varchar(576) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_number`),
  INDEX user_name (`user_name`),
  INDEX phone_number (`phone_number`),
  INDEX encrypted_user_name (`encrypted_user_name`),
  INDEX encrypted_phone_number (`encrypted_phone_number`),
  INDEX encrypted_id_number (`encrypted_id_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT '加密用户表';