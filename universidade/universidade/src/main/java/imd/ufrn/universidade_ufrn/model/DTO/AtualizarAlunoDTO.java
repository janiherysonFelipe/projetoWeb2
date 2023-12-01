package imd.ufrn.universidade_ufrn.model.DTO;


import imd.ufrn.universidade_ufrn.model.entity.Curso;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
public record AtualizarAlunoDTO(
        @NotNull
        Long id,
        Curso curso,
        String nomeAluno,
        String cpf,
        String telefone,
        Date nascimento) {

}
