package imd.ufrn.universidade_ufrn.model.entity;


import imd.ufrn.universidade_ufrn.model.DTO.AtualizarAlunoDTO;
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

    @ManyToOne //Muitos alunos podem estar associados a um curso
    @JoinColumn(name="id_curso")
    private Curso curso;
    @CPF
    private String cpf;
    private String telefone;
    private Date nascimento;

    public Aluno(Aluno aluno) {
        this.curso = aluno.getCurso();
        this.nomeAluno =  aluno.getNomeAluno();
        this.cpf = aluno.getCpf();
        this.telefone = aluno.getTelefone();
        this.nascimento = aluno.getNascimento();
    }

    public void atualizarAluno(AtualizarAlunoDTO dados) {
        if(dados.nomeAluno() != null){
            this.nomeAluno = dados.nomeAluno();
        }if(dados.cpf() != null){
            this.cpf = dados.cpf();
        }if(dados.nascimento() != null){
            this.nascimento = dados.nascimento();
        }if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
    }
}
