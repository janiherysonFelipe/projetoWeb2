package imd.ufrn.universidade_ufrn.model.entity;

import imd.ufrn.universidade_ufrn.model.DTO.AtualizarCursoDTO;
import imd.ufrn.universidade_ufrn.service.AlunoService;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @OneToMany(mappedBy = "curso") //Um curso tem muitos alunos

    private List<Aluno> alunos;


    public Curso(Curso curso){
        this.nomeCurso = curso.getNomeCurso();
        this.cargaHoraria = curso.getCargaHoraria();
        this.alunos = curso.getAlunos();
    }

    public void atualizarCurso(AtualizarCursoDTO dados) {
        if(dados.nomeCurso() != null){
            this.nomeCurso = dados.nomeCurso();
        }if(dados.cargaHoraria() != this.cargaHoraria){
            this.cargaHoraria = dados.cargaHoraria();
        }
    }



}


