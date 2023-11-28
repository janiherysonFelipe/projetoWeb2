package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findByArea(String area);
}
// foi adicionado o método 'findByArea'(String area), que retorna uma lista de disciplinas com base na área especificada.