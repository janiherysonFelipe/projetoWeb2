package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
