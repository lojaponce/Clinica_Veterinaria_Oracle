package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories("com.todocodeacademy.clinica_veterinaria.repository")
@Repository
public interface IDuenioRepository extends JpaRepository <Duenio, Long>{
    
}
