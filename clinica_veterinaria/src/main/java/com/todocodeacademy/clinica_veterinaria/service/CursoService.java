package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Curso;
import com.todocodeacademy.clinica_veterinaria.repository.ICursoRepository;
import com.todocodeacademy.clinica_veterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository repoCurso;

    @Override
    public List<Curso> getCursos(){
        List<Curso> listaCursos = repoCurso.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso curso){repoCurso.save(curso);}

    @Override
    public void deleteCurso(Long id){repoCurso.deleteById(id);}

    @Override
    public Curso findCurso(Long id){
        return repoCurso.findById(id).orElse(null);
    }

    @Override
    public void editCurso(Curso curso){
        this.saveCurso(curso);
    }


}
