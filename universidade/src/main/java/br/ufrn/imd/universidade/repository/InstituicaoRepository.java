package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
}
