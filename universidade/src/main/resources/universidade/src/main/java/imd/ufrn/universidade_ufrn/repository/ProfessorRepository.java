package imd.ufrn.universidade_ufrn.repository;


import imd.ufrn.universidade_ufrn.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
