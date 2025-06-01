package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository <Curso, Long> {

}
