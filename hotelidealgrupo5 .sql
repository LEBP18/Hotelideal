-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-03-2019 a las 17:09:54
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelidealgrupo5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id_habitacion` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `piso` int(1) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `id_tipo_de_habitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`id_habitacion`, `numero`, `piso`, `estado`, `id_tipo_de_habitacion`) VALUES
(1, 1, 3, 1, 2),
(8, 2, 3, 0, 1),
(9, 45, 3, 0, 1),
(10, 55, 5, 1, 2),
(11, 56, 5, 1, 2),
(12, 56, 5, 1, 2),
(13, 56, 5, 1, 2),
(14, 12, 12, 0, 1),
(15, 12, 12, 0, 1),
(16, 1, 1, 0, 1),
(17, 1, 1, 1, 1),
(18, 1, 1, 1, 1),
(19, 12, 1, 1, 2),
(20, 13, 5, 1, 1),
(21, 13, 5, 0, 1),
(22, 23, 1, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `id_huesped` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `celular` bigint(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`id_huesped`, `nombre`, `dni`, `domicilio`, `correo`, `celular`) VALUES
(6, 'Pablo Diaz', 23564888, 'Mitre 655', 'pablito@gmail.com', 2147483647),
(16, 'Sosa Laura', 23210555, 'LasHeras 890', 'laurita@hotmail.com', 2147483647),
(17, 'Pablo Alvarez', 36777888, 'San Martin 550', 'pabloa@ulp.edu.ar', 266498766),
(18, 'Maqui', 38750019, 'ejercito de los andes 1456', 'maqui@ulp.edu.ar', 266474838);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `ingreso` date DEFAULT NULL,
  `egreso` date DEFAULT NULL,
  `importe_total` double DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `id_huesped` int(11) DEFAULT NULL,
  `id_habitacion` int(11) DEFAULT NULL,
  `cantidad_personas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`id_reserva`, `ingreso`, `egreso`, `importe_total`, `estado`, `id_huesped`, `id_habitacion`, `cantidad_personas`) VALUES
(1, '2019-03-01', '2019-03-03', 800, 1, 17, 1, 2),
(2, '2019-03-06', '2019-03-08', 1000, 1, 18, 9, 1),
(3, '2019-03-09', '2019-03-11', 1000, 0, 18, 14, 1),
(4, '2019-03-06', '2019-03-08', 1400, 1, 16, 10, 1),
(5, '2019-03-15', '2019-03-17', 1000, 1, 18, 18, 1),
(6, '2019-11-11', '2019-11-12', 500, 0, 18, 18, 1),
(7, '2019-11-11', '2019-11-12', 500, 1, 18, 14, 1),
(8, '2019-12-12', '2019-12-14', 1000, 1, 18, 14, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_habitacion`
--

CREATE TABLE `tipo_de_habitacion` (
  `id_tipo_de_habitacion` int(11) NOT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `max_personas` int(11) DEFAULT NULL,
  `cant_camas` int(11) DEFAULT NULL,
  `tipo_camas` varchar(50) DEFAULT NULL,
  `precio_noche` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_de_habitacion`
--

INSERT INTO `tipo_de_habitacion` (`id_tipo_de_habitacion`, `tipo`, `max_personas`, `cant_camas`, `tipo_camas`, `precio_noche`) VALUES
(1, 'Estándar simple', 1, 1, 'Simples', 500),
(2, 'Doble', 2, 1, 'Queen', 700),
(3, 'Triple', 3, 3, 'Simples', 1100),
(4, 'Suite Lujo', 4, 2, 'King Size', 2000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id_habitacion`),
  ADD KEY `id_tipo_de_habitacion` (`id_tipo_de_habitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`id_huesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_huesped` (`id_huesped`),
  ADD KEY `id_habitacion` (`id_habitacion`);

--
-- Indices de la tabla `tipo_de_habitacion`
--
ALTER TABLE `tipo_de_habitacion`
  ADD PRIMARY KEY (`id_tipo_de_habitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id_habitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `id_huesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tipo_de_habitacion`
--
ALTER TABLE `tipo_de_habitacion`
  MODIFY `id_tipo_de_habitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`id_tipo_de_habitacion`) REFERENCES `tipo_de_habitacion` (`id_tipo_de_habitacion`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_huesped`) REFERENCES `huesped` (`id_huesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitacion` (`id_habitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
