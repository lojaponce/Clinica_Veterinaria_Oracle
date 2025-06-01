package com.todocodeacademy.clinica_veterinaria.controller;

import com.todocodeacademy.clinica_veterinaria.model.Curso;
import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import com.todocodeacademy.clinica_veterinaria.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoServ;

    @GetMapping ("/curso/traer")
    public List<Curso> getCursos() {
        return cursoServ.getCursos();
    }
    @PostMapping("/curso/crear")
    public String saveCurso (@RequestBody Curso curso) {
        cursoServ.saveCurso(curso);
        return "El curso fue creado correctamente";
    }
    @DeleteMapping("/curso/borrar/{id}")
    public String deleteCurso(@PathVariable Long id) {
        cursoServ.deleteCurso(id);
        return "El curso fue eliminado correctamente";
    }
}
