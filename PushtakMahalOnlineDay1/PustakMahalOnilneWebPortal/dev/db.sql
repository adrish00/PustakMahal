-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.12-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for pushtak_mahal_online_portal
CREATE DATABASE IF NOT EXISTS `pushtak_mahal_online_portal` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pushtak_mahal_online_portal`;


-- Dumping structure for table pushtak_mahal_online_portal.user_info
CREATE TABLE IF NOT EXISTS `user_info` (
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `middle_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `email_id` varchar(50) NOT NULL,
  `mobile_no` varchar(20) NOT NULL,
  `mobile_no_alternate` varchar(20) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
