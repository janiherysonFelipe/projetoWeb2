package imd.ufrn.universidade_ufrn.model.entity;

import imd.ufrn.universidade_ufrn.model.DTO.AtualizarFaculdadeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "faculdade")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faculdade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFaculdade;
    private String FaculdadeCol;
    private String nomeFaculdade;
    private String descricao;
    private String area;


    public Faculdade(String FaculdadeCol, String nomeFaculdade, String descricao, String area){
        this.FaculdadeCol = FaculdadeCol;
        this.nomeFaculdade = nomeFaculdade;
        this.descricao = descricao;
        this.area = area;
    }

    public void atualizarFaculdade(AtualizarFaculdadeDTO dados) {
        if(dados.FaculdadeCol() != null){
            this.FaculdadeCol = dados.FaculdadeCol();
        }if(dados.nomeFaculdade() != null){
            this.nomeFaculdade = dados.nomeFaculdade();
        }if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }if(dados.area() != null){
            this.area = dados.area();
        }
    }
}