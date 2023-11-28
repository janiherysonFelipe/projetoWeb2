package br.ufrn.imd.universidade.service;

import br.ufrn.imd.universidade.model.Aluno;
import br.ufrn.imd.universidade.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno aluno) {
        aluno.setIdAluno(id);
        return alunoRepository.save(aluno);
    }

    public void excluir(Long id) {
        alunoRepository.deleteById(id);
    }
}
