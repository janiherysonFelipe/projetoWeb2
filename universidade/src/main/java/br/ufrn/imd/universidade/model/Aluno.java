package br.ufrn.imd.universidade.model;

import jakarta.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
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
}
