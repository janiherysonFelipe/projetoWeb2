package imd.ufrn.universidade_ufrn.service;

import imd.ufrn.universidade_ufrn.model.DTO.AtualizarAlunoDTO;
import imd.ufrn.universidade_ufrn.model.entity.Aluno;
import imd.ufrn.universidade_ufrn.model.entity.Curso;
import imd.ufrn.universidade_ufrn.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository repository;

}
