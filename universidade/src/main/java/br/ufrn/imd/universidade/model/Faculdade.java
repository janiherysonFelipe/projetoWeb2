package br.ufrn.imd.universidade.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "faculdade")
@Entity(name = "Faculdade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faculdade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFaculdade;
    private long idInstituicao;
    private String FaculdadeCol;
    private String nomeFaculdade;
    private String descricao;
    private String area;

}
