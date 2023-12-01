package imd.ufrn.universidade_ufrn.controller;

import imd.ufrn.universidade_ufrn.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/cursos" , "/curso"})
public class CursoController {

    @Autowired
    CursoService curso;


}
