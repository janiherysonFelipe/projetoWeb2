package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
