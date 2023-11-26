package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
