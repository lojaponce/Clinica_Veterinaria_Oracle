package com.todocodeacademy.clinica_veterinaria.service;
import com.todocodeacademy.clinica_veterinaria.model.Curso;
import java.util.List;

public interface ICursoService {
    //lectura
    public List<Curso> getCursos();
    //escritura
    public void saveCurso(Curso curso);
    //eliminar
    public void deleteCurso(Long id);
    //lectura por id
    public Curso findCurso(Long id);
    //editar/modificar
    public void editCurso(Curso curso);
}
