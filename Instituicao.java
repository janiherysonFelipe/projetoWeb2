package br.ufrn.imd.universidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "instituicao")
@Entity(name = "Instituicao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instituicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInstituicao") //nao obrigatório - vai ser igual o nome do atributo
    private Integer idInstituicao;

    @Column
    private String nomeInstituicao;

    @Column
    private String cnpj;

    @Column
    private String endereco;


    public Integer getIdInstituicao() {
        return idInstituicao;
    }
    public void setId(Integer idInstituicao) {
        this.id = idInstituicao;
    }
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj; 
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
