package imd.ufrn.universidade_ufrn.model.entity;

import imd.ufrn.universidade_ufrn.model.DTO.AtualizarCursoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "curso")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @NotNull
    private String nomeCurso;
    @NotNull
    private int cargaHoraria;


    public Curso(String nomeCurso, int cargaHoraria){
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }

    public void atualizarCurso(AtualizarCursoDTO dados) {
        if(dados.nomeCurso() != null){
            this.nomeCurso = dados.nomeCurso();
        }if(dados.cargaHoraria() != this.cargaHoraria){
            this.cargaHoraria = dados.cargaHoraria();
        }
    }




}


