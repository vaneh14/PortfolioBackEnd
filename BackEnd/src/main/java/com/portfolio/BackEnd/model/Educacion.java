/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Vanesa
 */

@Entity
@Getter
@Setter

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        
    private long id;
    private String nombre_curso;
    @DateTimeFormat(pattern = "ddMMyyyy")
    private Date fechaInicio;
    @JsonFormat(pattern = "ddMMyyyy")
    private Date fechaFin;
    private String descripcion;
    private String lenguaje;
    private String url_curso;
    private int persona_id;
    
    /**
     *
     */
    public Educacion(){        
    }
    
    /**
     *
     * @param id
     * @param nombre_curso
     * @param fechaInicio
     * @param fechaFin
     * @param descripcion
     * @param lenguaje
     * @param url_curso
     * @param persona_id
     */
    public Educacion(long id, String nombre_curso, Date fechaInicio, Date fechaFin, String descripcion, String lenguaje, String url_curso, int persona_id){
        this.id = id;
        this.nombre_curso = nombre_curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.lenguaje = lenguaje;
        this.url_curso = url_curso;        
        this.persona_id = persona_id;
    }
}
