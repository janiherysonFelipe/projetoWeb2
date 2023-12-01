package imd.ufrn.universidade_ufrn.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Table(name = "aluno")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAluno;
    //private Curso curso;
    @NotNull
    private String nomeAluno;
    @CPF
    private String cpf;
    private String telefone;
    private Date nascimento;

    public Aluno(String nomeAluno, String cpf, String telefone, Date nascimento) {
        //this.curso = curso;
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public void atualizarAluno(Aluno dados) {
        if(dados.getNomeAluno() != null){
            this.nomeAluno = dados.getNomeAluno();
        }if(dados.getCpf() != null){
            this.cpf = dados.getCpf();
        }if(dados.getNascimento() != null){
            this.nascimento = dados.getNascimento();
        }if(dados.getTelefone() != null){
            this.telefone = dados.getTelefone();
        }
    }
}
