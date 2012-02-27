-- phpMyAdmin SQL Dump
-- version 3.4.8deb1.maverick~ppa.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 27, 2012 at 01:51 PM
-- Server version: 5.1.49
-- PHP Version: 5.3.3-1ubuntu9.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tree`
--

-- --------------------------------------------------------

--
-- Table structure for table `buah`
--

CREATE TABLE IF NOT EXISTS `buah` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) NOT NULL,
  `path` varchar(200) NOT NULL,
  `id_kat` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `buahkat` (`id_kat`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `buah`
--

INSERT INTO `buah` (`id`, `nama`, `path`, `id_kat`) VALUES
(1, 'Apel', '/sample/jtree/images/apple.jpg', 1),
(2, 'Pisang', '/sample/jtree/images/banana.jpg', 1),
(3, 'Strawberry', '/sample/jtree/images/strawberry.jpg', 1),
(4, 'Semangka', '/sample/jtree/images/watermelon.jpg', 1),
(5, 'Bakso', '/sample/jtree/images/bakso.jpg', 2),
(6, 'Mie Ayam', '/sample/jtree/images/mieayam.jpg', 2),
(7, 'Lotek', '/sample/jtree/images/lotek.jpg', 2),
(8, 'Nasi Goreng', '/sample/jtree/images/nasigoreng.jpg', 2);

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE IF NOT EXISTS `kategori` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id`, `nama`) VALUES
(1, 'Buah'),
(2, 'Makanan');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buah`
--
ALTER TABLE `buah`
  ADD CONSTRAINT `buah_ibfk_1` FOREIGN KEY (`id_kat`) REFERENCES `kategori` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;