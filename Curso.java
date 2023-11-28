package br.ufrn.imd.universidade.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "curso")
@Entity(name = "Curso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCurso;
    @NotNull
    private long idFaculdade;
    @NotNull
    private String nomeCurso;
    @NotNull
    private int cargaHoraria;

    public Curso(Long idFaculdade, String nomeCurso, int cargaHoraria){
        this.idFaculdade = idFaculdade;
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }

    public void atualizarCurso(AtualizarCursoDTO dados) {
        if(dados.nomeCurso() != null){
            this.nomeCurso = dados.nomeCurso();
        }if(dados.idFaculdade() != this.idFaculdade){
            this.idFaculdade = dados.idFaculdade();
        }if(dados.cargaHoraria() != this.cargaHoraria){
            this.cargaHoraria = dados.cargaHoraria();
        }
    }

}
