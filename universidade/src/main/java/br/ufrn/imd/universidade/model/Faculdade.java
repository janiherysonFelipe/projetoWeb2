package br.ufrn.imd.universidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
}
