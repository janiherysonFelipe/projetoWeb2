package br.ufrn.imd.universidade.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Table(name = "turma")
@Entity(name = "Turma")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurma;

    @ManyToOne
    @JoinColumn(name = "idDisciplina")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "idProfessor")
    private Professor professor;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE})
    @JoinTable(name="aluno_turma",
            joinColumns=@JoinColumn(name="idAluno"),
            inverseJoinColumns=@JoinColumn(name="idTurma"))
    private List<Aluno> alunos;

    @Column
    private String nomeTurma;

    @Column
    private String descricao;

    @Column
    private int qtdAlunos;


    public int getIdTurma() {
        return idTurma;
    }
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNometurma() {
        return nomeTurma;
    }
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }


}
