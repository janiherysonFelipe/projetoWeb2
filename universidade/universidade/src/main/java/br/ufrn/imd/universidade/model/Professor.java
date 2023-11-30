package br.ufrn.imd.universidade.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Table(name = "professor")
@Entity(name = "Professor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfessor;

    @ManyToOne
    @JoinColumn(name = "idInstituicao")
    private Instituicao instituicao;

    @Column
    private String nomeProfessor;

    @Column
    private String matricula;

    @Column
    private String titulacao;

    public Integer getIdProfessor() {
        return idProfessor;
    }
    public void setId(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }
    public void setIstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulaca(String titulacao) {
        this.titulacao = titulacao;
    }

}
