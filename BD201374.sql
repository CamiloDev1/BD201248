-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema veterinaria
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `veterinaria` ;

-- -----------------------------------------------------
-- Schema veterinaria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `veterinaria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `veterinaria` ;

-- -----------------------------------------------------
-- Table `veterinaria`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `veterinaria`.`cliente` (
  `EDAD` INT(11) NOT NULL AUTO_INCREMENT,
  `Nom_CLIENTE` VARCHAR(50) NULL DEFAULT NULL,
  `NUM_CLIENTE` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`EDAD`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `veterinaria`.`mascota`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `veterinaria`.`mascota` (
  `Nom_Mascota` VARCHAR(50) NOT NULL,
  `Mot_Visita` VARCHAR(50) NOT NULL,
  `FECHA_INGRESO` VARCHAR(50) NOT NULL,
  `Especie` VARCHAR(50) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `veterinaria`.`medicamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `veterinaria`.`medicamentos` (
  `CODIGO` INT(11) NOT NULL AUTO_INCREMENT,
  `Nom_Medicamento` VARCHAR(50) NOT NULL,
  `SustanciaActiva` VARCHAR(50) NOT NULL,
  `FechaCaducidad` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`CODIGO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
