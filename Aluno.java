package br.ufrn.imd.universidade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Table(name = "aluno")
@Entity(name = "Aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;
    @ManyToMany
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @NotNull
    private String nomeAluno;
    @CPF
    private String cpf;
    private String telefone;

    private Date nascimento;

    public Aluno(Curso curso, String nomeAluno, String cpf, String telefone, Date nascimento) {
        this.curso = curso;
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public void atualizarAluno(AtualizarAlunoDTO dados) {
        if(dados.nomeAluno() != null){
            this.nomeAluno = dados.nomeAluno();
        }if(dados.cpf() != null){
            this.cpf = dados.cpf();
        }if(dados.curso() != null){
            this.curso = dados.curso();
        }if(dados.nascimento() != null){
            this.nascimento = dados.nascimento();
        }if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
    }

}
