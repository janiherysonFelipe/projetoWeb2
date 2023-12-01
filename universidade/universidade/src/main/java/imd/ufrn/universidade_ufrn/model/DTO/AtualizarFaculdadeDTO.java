package imd.ufrn.universidade_ufrn.model.DTO;

import jakarta.validation.constraints.NotNull;

public record AtualizarFaculdadeDTO(
        @NotNull
        Long id,
        String nomeFaculdade,
        String descricao,
        String area) {
}
