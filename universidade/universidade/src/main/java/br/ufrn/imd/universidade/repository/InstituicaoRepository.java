package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {


    List<Instituicao> findByNomeLike(String nomeInstituicao);
    List<Instituicao> findByNomeOrId(String nomeInstituicao, Integer idaInstituicao);
    boolean existsByNome(String nomeInstituicao);


    @Query(value = " select i from Instituicao i where i.nomeInstituicao like %:nome% ")
    List<Instituicao> encontrarPorNome(@Param("nomeInstituicao") String nomeInstituicao);

    @Query(value = " select i from Instituicao i where i.cnpj like %:cnpj% ")
    List<Instituicao> encontrarPorCnpj(@Param("cnpj") String cnpj);

    @Query(value = " delete from Instituicao i where i.nomeInstituicao =:nomeInstituicao")
    @Modifying
    void deletarPorNome(String nomeInstituicao);



}
