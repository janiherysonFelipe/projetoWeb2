CREATE TABLE IF NOT EXISTS `universidade_bd`.`faculdade` (
  `idFaculdade` INT NOT NULL,
  `idInstituicao` INT NOT NULL,
  `Faculdadecol` VARCHAR(45) NULL,
  `nomeFaculdade` VARCHAR(300) NULL,
  `descricao` VARCHAR(500) NULL,
  `area` VARCHAR(100) NULL,
  PRIMARY KEY (`idFaculdade`),
  INDEX `fk_Faculdade_Instituicao1_idx` (`idInstituicao` ASC) VISIBLE,
  CONSTRAINT `fk_Faculdade_Instituicao1`
    FOREIGN KEY (`idInstituicao`)
    REFERENCES `universidade_bd`.`instituicao` (`idInstituicao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)