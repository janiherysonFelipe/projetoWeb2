package imd.ufrn.universidade_ufrn.repository;


import imd.ufrn.universidade_ufrn.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
