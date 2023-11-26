package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Faculdade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaculdadeRepository extends JpaRepository<Faculdade, Long> {
}
