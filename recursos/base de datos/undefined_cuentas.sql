/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100413
 Source Host           : localhost:3306
 Source Schema         : undefined_cuentas

 Target Server Type    : MySQL
 Target Server Version : 100413
 File Encoding         : 65001

 Date: 10/09/2020 21:01:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banip
-- ----------------------------
DROP TABLE IF EXISTS `banip`;
CREATE TABLE `banip`  (
  `ip` varchar(15) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cuentas
-- ----------------------------
DROP TABLE IF EXISTS `cuentas`;
CREATE TABLE `cuentas`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cuenta` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `contraseña` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `rango` tinyint(2) NOT NULL DEFAULT 0,
  `nombre` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `apellido` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `pais` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `idioma` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ipRegistro` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `cumpleaños` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `email` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ultimaIP` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `pregunta` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT 'ES DOFUS',
  `respuesta` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT 'DOFUS',
  `apodo` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `baneado` bigint(30) NOT NULL DEFAULT 0,
  `logeado` tinyint(1) NOT NULL DEFAULT 0,
  `creditos` int(11) NOT NULL DEFAULT 0,
  `ogrinas` int(11) NOT NULL DEFAULT 0,
  `votos` int(11) NOT NULL DEFAULT 0,
  `actualizar` tinyint(1) NOT NULL DEFAULT 1,
  `ultimoVoto` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT 'en segundos',
  `abono` bigint(30) NOT NULL DEFAULT 0 COMMENT 'en milisegundos',
  `fechaCreacion` bigint(30) NOT NULL,
  `ticket` text CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `cuenta`(`cuenta`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cuentas
-- ----------------------------
INSERT INTO `cuentas` VALUES (21, 'admin', '123', 5, 'Rodrigo', 'Calabrese', 'Argentina', 'Español', '', '05/11/93', 'privatedofus.net@gmail.com', '', 'pepo', 'pepa', 'Player-xD', 0, 0, 0, 0, 0, 1, '', 0, 0, '');

SET FOREIGN_KEY_CHECKS = 1;
