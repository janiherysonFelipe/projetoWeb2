package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
