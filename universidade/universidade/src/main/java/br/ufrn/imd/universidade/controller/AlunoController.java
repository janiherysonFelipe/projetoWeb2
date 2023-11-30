package br.ufrn.imd.universidade.controller;

import br.ufrn.imd.universidade.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")

public class AlunoController{
    @Autowired
    @Qualifier("alunoServiceImpl")
    AlunoService alunoService;


    @RequestMapping("/showForm")
    public String showFormAluno(Model model){

        model.addAttribute("estudante", new Aluno());
        return "aluno/formAluno";
    }

    @RequestMapping("/addAluno")
    public String showFormAluno(@ModelAttribute("aluno") Aluno aluno, Model model){

        Aluno novoAluno = alunoService.salvarEstudante(aluno);


        model.addAttribute("aluno", novoAluno);
        return "aluno/paginaAluno";
    }

    @RequestMapping("/getListaAluno")
    public String showListaAluno(Model model){

        List<Aluno> estudantes = alunoService.getListaAluno();
        model.addAttribute("aluno",aluno);
        return "aluno/listaAluno";

    }

    @GetMapping("/getAlunoById/{id}")
    public String getAlunoById(@PathVariable Integer id, Model model){

        Aluno aluno = alunoService.getAlunoById(id);
        model.addAttribute("aluno",aluno);
        return "aluno/paginaAluno";
    }
}

