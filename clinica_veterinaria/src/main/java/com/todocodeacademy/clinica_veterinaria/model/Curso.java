package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "CURSO") // <-- recomendable
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String titulo;
    private String nivel;
    private String sesiones;
    private String img_curso;
    private String dni_docente;
    private String img_docente;
    private String img_idioma;

    public Curso() {
    }

    public Curso(Long id_curso, String titulo, String nivel, String sesiones, String img_curso, String dni_docente, String img_docente, String img_idioma) {
        this.id_curso = id_curso;
        this.titulo = titulo;
        this.nivel = nivel;
        this.sesiones = sesiones;
        this.img_curso = img_curso;
        this.dni_docente = dni_docente;
        this.img_docente = img_docente;
        this.img_idioma = img_idioma;
    }
    @PostConstruct
    public void init() {
        System.out.println(">>>>> ENTIDAD CURSO CARGADA");
    }
}


