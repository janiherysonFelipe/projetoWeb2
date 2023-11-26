CREATE TABLE IF NOT EXISTS `universidade_bd`.`aluno` (
  `idAluno` INT NOT NULL,
  `idCurso` INT NOT NULL,
  `nomeAluno` VARCHAR(500) NULL,
  `cpf` VARCHAR(11) NULL,
  `telefone` VARCHAR(45) NULL,
  `nascimento` DATETIME NULL,
  PRIMARY KEY (`idAluno`),
  INDEX `fk_Aluno_Curso_idx` (`idCurso` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_Curso`
    FOREIGN KEY (`idCurso`)
    REFERENCES `universidade_bd`.`curso` (`idCurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)