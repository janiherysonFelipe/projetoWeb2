package br.ufrn.imd.universidade.service;

import br.ufrn.imd.universidade.model.Disciplina;
import br.ufrn.imd.universidade.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    public Disciplina salvar(Disciplina disciplina) {
        // Adicione validações aqui, se necessário
        return disciplinaRepository.save(disciplina);
    }

    public Disciplina atualizar(Long id, Disciplina disciplina) {
        // Adicione validações aqui, se necessário
        disciplina.setId(id);
        return disciplinaRepository.save(disciplina);
    }

    public void excluir(Long id) {
        disciplinaRepository.deleteById(id);
    }
}
