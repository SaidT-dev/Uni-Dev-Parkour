-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 03, 2025 at 11:03 AM
-- Server version: 9.1.0
-- PHP Version: 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bd_approvisionnement`
--

-- --------------------------------------------------------

--
-- Table structure for table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE IF NOT EXISTS `fournisseur` (
  `NF` int NOT NULL AUTO_INCREMENT,
  `NomF` varchar(255) NOT NULL,
  `Statut` char(10) DEFAULT NULL,
  `VilleF` varchar(255) DEFAULT 'Bejaia',
  PRIMARY KEY (`NF`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `NP` int NOT NULL AUTO_INCREMENT,
  `NomP` varchar(255) NOT NULL,
  `Couleur` varchar(50) NOT NULL,
  `Taille` varchar(50) NOT NULL,
  `Poids` float NOT NULL,
  PRIMARY KEY (`NP`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `puf`
--

DROP TABLE IF EXISTS `puf`;
CREATE TABLE IF NOT EXISTS `puf` (
  `NU` int NOT NULL,
  `NP` int NOT NULL,
  `NF` int NOT NULL,
  `Quantite` int NOT NULL,
  KEY `NU` (`NU`),
  KEY `NP` (`NP`),
  KEY `NF` (`NF`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usine`
--

DROP TABLE IF EXISTS `usine`;
CREATE TABLE IF NOT EXISTS `usine` (
  `NU` int NOT NULL AUTO_INCREMENT,
  `NomU` varchar(255) NOT NULL,
  `VilleU` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`NU`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
