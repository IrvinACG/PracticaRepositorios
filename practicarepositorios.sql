-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2020 a las 03:52:17
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `practicarepositorios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_curso` bigint(20) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `horas` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id_curso`, `descripcion`, `horas`, `nombre`, `precio`) VALUES
(1, 'Descrpcion del Curso 1', 20, 'Curso 1', 1000),
(2, 'Descrpcion del Curso 2', 12, 'Curso 2', 123),
(3, 'Descrpcion del Curso 3', 10, 'Curso 3', 1234),
(4, 'Descrpcion del Curso 4', 6, 'Curso 4', 233),
(5, 'Descrpcion del Curso 4', 16, 'Curso 5', 645),
(6, 'Descrpcion del Curso 6', 7, 'Curso 6', 741),
(7, 'Descrpcion del Curso 7', 8, 'Curso 7', 573),
(8, 'Descrpcion del Curso 8', 13, 'Curso 8', 420),
(9, 'Descripcion del Curso 9', 18, 'Curso 9', 1201),
(10, 'Descripcion del Curso 10', 10, 'Curso 10', 500),
(11, 'Descripcion del Curso 11', 12, 'Curso 11', 900);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_curso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `id_curso` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
