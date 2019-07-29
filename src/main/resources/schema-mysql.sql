DROP TABLE IF EXISTS `Items`;
​
CREATE TABLE `Items` (
  `items_id` INTEGER AUTO_INCREMENT,
  `items_name` varchar(36) NOT NULL,
  `items_price` double NOT NULL,
  PRIMARY KEY (`items_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;