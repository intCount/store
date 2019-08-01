DROP TABLE IF EXISTS `Items`;
CREATE TABLE `items` (
  `id` INTEGER AUTO_INCREMENT,
  `name` varchar(36) NOT NULL,
  `Price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
  `id` INTEGER AUTO_INCREMENT,
  `email` varchar(36) NOT NULL,
  `phone` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `commands`;
CREATE TABLE `commands` (
  `id` INTEGER AUTO_INCREMENT,
  `name` varchar(36) NOT NULL,
  `customersByIdCustomer` integer NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `commandlines`;
CREATE TABLE `commandlines` (
  `idItems` INTEGER,
  `idCommands` INTEGER,
  `quantity` INTEGER,
  PRIMARY KEY (`items_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;