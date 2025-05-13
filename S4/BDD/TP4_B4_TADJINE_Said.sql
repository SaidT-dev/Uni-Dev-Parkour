0-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 13, 2025 at 11:58 PM
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
-- Database: `TP4_B4_TADJINE_Said`
--

-- --------------------------------------------------------

--
-- Table structure for table `modules`
--

DROP TABLE IF EXISTS `modules`;
CREATE TABLE IF NOT EXISTS `modules` (
  `codeModule` varchar(10) NOT NULL,
  `intetule` varchar(30) NOT NULL,
  `coef` int NOT NULL,
  `idEnseignant` int NOT NULL,
  PRIMARY KEY (`codeModule`),
  KEY `ck1_enseignant` (`idEnseignant`)
) ;

--
-- Dumping data for table `modules`
--

INSERT INTO `modules` (`codeModule`, `intetule`, `coef`, `idEnseignant`) VALUES
('BDL2', 'Base de donnees', 3, 10),
('SEL3', 'System d\'exploitation', 2, 11),
('SIL2', 'System d\'information', 4, 11),
('1AM1', 'Intelegence Artificielle', 4, 15);

-- --------------------------------------------------------

--
-- Table structure for table `personnes`
--

DROP TABLE IF EXISTS `personnes`;
CREATE TABLE IF NOT EXISTS `personnes` (
  `idPersonne` varchar(10) NOT NULL,
  `numSec` int NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) NOT NULL,
  `dateNai` date NOT NULL,
  `adresse` varchar(32) DEFAULT 'Algerie',
  PRIMARY KEY (`idPersonne`),
  UNIQUE KEY `ck1_numSec` (`numSec`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `personnes`
--

INSERT INTO `personnes` (`idPersonne`, `numSec`, `nom`, `prenom`, `dateNai`, `adresse`) VALUES
('', 51989, 'KASRI', 'Amine', '1989-05-01', 'Bejaia'),
('10', 31980, 'KARA', 'Lyes', '1980-05-18', 'Alger'),
('11', 41981, 'SALMI', 'Riad', '1981-01-09', ''),
('13', 41985, '', 'Ryma', '1985-02-26', 'Bejaia'),
('1MI', 11992, 'KABLI', 'Cilia', '1992-01-20', 'Bejaia'),
('2MI', 21991, 'ADI', 'Mounir', '1991-03-25', 'Bouira');

-- --------------------------------------------------------

--
-- Table structure for table `suivre`
--

DROP TABLE IF EXISTS `suivre`;
CREATE TABLE IF NOT EXISTS `suivre` (
  `idEtudiant` varchar(10) DEFAULT NULL,
  `idModule` varchar(10) NOT NULL,
  `note` int DEFAULT NULL,
  KEY `idEtudiant` (`idEtudiant`),
  KEY `idModule` (`idModule`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `suivre`
--

INSERT INTO `suivre` (`idEtudiant`, `idModule`, `note`) VALUES
('1MI', 'BDL2', 15),
(NULL, 'SEL3', 11),
('1MI', 'SEL3', 17),
('2MI', 'SEL3', 12),
('2MI', 'LML2', 13),
('3MI', 'SEL3', 11),
('2MI', 'SIL2', 14);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
