package imd.ufrn.universidade_ufrn.model.DTO;

import imd.ufrn.universidade_ufrn.model.entity.Aluno;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record AtualizarCursoDTO(
        @NotNull
        Long idFaculdade,
        String nomeCurso,
        int cargaHoraria){
}
