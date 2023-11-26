package br.ufrn.imd.universidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "professor")
@Entity(name = "Professor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
}
