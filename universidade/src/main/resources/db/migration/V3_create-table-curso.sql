CREATE TABLE IF NOT EXISTS `universidade_bd`.`curso` (
  `idCurso` INT NOT NULL,
  `idFaculdade` INT NOT NULL,
  `nomeCurso` VARCHAR(300) NULL,
  `cargaHoraria` INT NULL,
  PRIMARY KEY (`idCurso`),
  INDEX `fk_Curso_Faculdade1_idx` (`idFaculdade` ASC) VISIBLE,
  CONSTRAINT `fk_Curso_Faculdade1`
    FOREIGN KEY (`idFaculdade`)
    REFERENCES `universidade_bd`.`faculdade` (`idFaculdade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)