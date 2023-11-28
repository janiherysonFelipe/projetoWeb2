CREATE TABLE IF NOT EXISTS `universidade_bd`.`disciplina` (
  `idDisciplina` INT NOT NULL,
  `nomeDisciplina` VARCHAR(300) NULL,
  `descricao` VARCHAR(500) NULL,
  `area` VARCHAR(100) NULL,
  PRIMARY KEY (`idDisciplina`))