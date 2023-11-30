package br.ufrn.imd.universidade.repository;

import br.ufrn.imd.universidade.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    List<Aluno> findByNomeLike(String nomeAluno);
    List<Aluno> findByNomeOrId(String nomeAluno, Integer idaluno);
    boolean existsByNome(String nomeAluno);


    @Query(value = " select a from Aluno a where a.nomeAluno like %:nome% ")
    List<Aluno> encontrarPorNome(@Param("nomeAluno") String nomeAluno);

    //sql nativo
    @Query(value = " select * from aluno a where a.nomeAluno like %:nome% ", nativeQuery = true)
    List<Aluno> encontrarPorNomeMod(@Param("nomeAluno") String nomeAluno);

    @Query(value = " delete from Aluno a where a.nomealuno =:nomeAluno")

    @Modifying
    void deletarPorNome(String nomeAluno);

    @Query(value = " select a.* from aluno a where a.idCurso = ?1",nativeQuery = true)
    List<Aluno> findAllByIdCurso(Integer id);

    @Query(value="SELECT DISTINCT a FROM Aluno a JOIN FETCH d.disciplinas")
    List<Aluno> findAllFetchDisciplinas();

    @Query(value="SELECT a FROM Aluno a JOIN a.disciplinas d where d.idDisciplina =:id")
    List<Aluno> findAllByDisciplinaId(@Param("idDisciplina") Integer idDisciplina);

}
