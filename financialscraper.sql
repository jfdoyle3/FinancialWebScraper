CREATE TABLE `financialscraper`.`stocktable` (
  `id` INT UNSIGNED NOT NULL,
  `datestamp` DATE NULL,
  `symbol` VARCHAR(45) NULL,
  `lastprice` VARCHAR(45) NULL,
  `pricechange` VARCHAR(45) NULL,
  `changepercentage` VARCHAR(45) NULL,
  `currency` VARCHAR(45) NULL,
  `markettime` VARCHAR(45) NULL,
  `volume` VARCHAR(45) NULL,
  `stocktablecol` VARCHAR(45) NULL,
  `avgvol` VARCHAR(45) NULL,
  `marketcap` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));