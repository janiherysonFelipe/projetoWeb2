CREATE TABLE IF NOT EXISTS `universidade_bd`.`professor` (
  `idProfessor` INT NOT NULL,
  `idInstituicao` INT NOT NULL,
  `nomeProfessor` VARCHAR(500) NULL,
  `matricula` VARCHAR(45) NULL,
  `titulacao` VARCHAR(45) NULL,
  PRIMARY KEY (`idProfessor`),
  INDEX `fk_Professor_Instituicao1_idx` (`idInstituicao` ASC) VISIBLE,
  CONSTRAINT `fk_Professor_Instituicao1`
    FOREIGN KEY (`idInstituicao`)
    REFERENCES `universidade_bd`.`instituicao` (`idInstituicao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)