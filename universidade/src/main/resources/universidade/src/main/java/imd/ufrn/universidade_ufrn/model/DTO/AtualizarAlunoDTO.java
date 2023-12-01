package imd.ufrn.universidade_ufrn.model.DTO;


import imd.ufrn.universidade_ufrn.model.entity.Curso;

import java.util.Date;
public record AtualizarAlunoDTO(Curso curso, String nomeAluno, String cpf, String telefone, Date nascimento) {

}
