package imd.ufrn.universidade_ufrn.repository;


import imd.ufrn.universidade_ufrn.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
