package imd.ufrn.universidade_ufrn.model.entity;

import imd.ufrn.universidade_ufrn.model.DTO.AtualizarFaculdadeDTO;
import imd.ufrn.universidade_ufrn.repository.FaculdadeRepository;
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
    private String nomeFaculdade;
    private String descricao;
    private String area;

    public Faculdade(Faculdade faculdade){

        this.nomeFaculdade = faculdade.getNomeFaculdade();
        this.descricao = faculdade.getDescricao();
        this.area = faculdade.getArea();
    }

    public void atualizarFaculdade(AtualizarFaculdadeDTO dados) {
        if(dados.nomeFaculdade() != null){
            this.nomeFaculdade = dados.nomeFaculdade();
        }if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }if(dados.area() != null){
            this.area = dados.area();
        }
    }
}