-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 02, 2021 at 04:44 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agenda`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `appointment_id` int(11) NOT NULL,
  `appointment_date` varchar(50) DEFAULT NULL,
  `appointment_description` varchar(100) DEFAULT NULL,
  `contact_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`appointment_id`, `appointment_date`, `appointment_description`, `contact_id`) VALUES
(null, '2021-11-30 10:30:00', 'Date with my wife the november 30', 5),
(null, '2021-11-20 12:00:00', 'Visit to Doctor Cristian', 4),
(null, '2021-12-01 07:00:00', 'Birthday of my dad', 1),
(null, '2021-11-04 08:00:00', 'appointment with manuel in your house', 2);

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `contact_id` int(11) NOT NULL,
  `contact_name` varchar(50) DEFAULT NULL,
  `contact_lastname` varchar(50) DEFAULT NULL,
  `contact_number` varchar(10) DEFAULT NULL,
  `conctact_email` text DEFAULT NULL,
  `contact_adress` varchar(100) DEFAULT NULL,
  `type_id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`contact_id`, `contact_name`, `contact_lastname`, `contact_number`, `conctact_email`, `contact_adress`, `type_id`, `id_user`) VALUES
(0, 'Jose Alberto', 'Perez', '2278-9076', 'joalb@gmail.com', 'Alta Vista SS', 2, 1),
(0, 'Manuel Enrique', 'Gonzales Martinez', '2669-2312', 'gonzales23@hotmail.com', 'Mira Montes', 1, 1),
(0, 'Manuel', 'Villatoro', '2661-9890', 'manvill@gmail.com', 'San Vicente', 3, 1),
(0, 'Cristian josue', 'Campos', '2678-9067', 'camp@outlook.com', 'San Miguel', 4, 1),
(0, 'Marta Aurora', 'Garcia', '2390-8956', 'martgar@gmail.com', 'San Salvador, Flor Blanca', 5, 1);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id_rol` int(11) NOT NULL,
  `rol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id_rol`, `rol`) VALUES
(0, 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `type_contacts`
--

CREATE TABLE `type_contacts` (
  `type_id` int(11) NOT NULL,
  `type_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type_contacts`
--

INSERT INTO `type_contacts` (`type_id`, `type_name`) VALUES
(0, 'Family'),
(0, 'Friend'),
(0, 'Job'),
(0, 'Doctors'),
(0, 'Wife'),
(0, 'Husband');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(300) DEFAULT NULL,
  `direccion` text DEFAULT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`appointment_id`),
  ADD KEY `FK_CONT_ID` (`contact_id`);

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`contact_id`),
  ADD KEY `FK_TYP_ID` (`type_id`),
  ADD KEY `FK_ID_USER` (`id_user`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indexes for table `type_contacts`
--
ALTER TABLE `type_contacts`
  ADD PRIMARY KEY (`type_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `FK_ID_ROL` (`id_rol`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `appointment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `contact_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `type_contacts`
--
ALTER TABLE `type_contacts`
  MODIFY `type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `FK_CONT_ID` FOREIGN KEY (`contact_id`) REFERENCES `contacts` (`contact_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `contacts`
--
ALTER TABLE `contacts`
  ADD CONSTRAINT `FK_ID_USER` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_TYP_ID` FOREIGN KEY (`type_id`) REFERENCES `type_contacts` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_ID_ROL` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
