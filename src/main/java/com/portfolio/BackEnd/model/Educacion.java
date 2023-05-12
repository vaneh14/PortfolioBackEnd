/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Vanesa
 */

@Entity 
@Getter
@Setter

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        
    private long id;
    private String nombre_curso;
    private String fecha_inicio;
    private String fecha_fin;
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
     * @param fecha_inicio
     * @param fecha_fin
     * @param descripcion
     * @param lenguaje
     * @param url_curso
     * @param persona_id
     */
    public Educacion(long id, String nombre_curso, String fecha_inicio, String fecha_fin, String descripcion, String lenguaje, String url_curso, int persona_id){
        this.id = id;
        this.nombre_curso = nombre_curso;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.lenguaje = lenguaje;
        this.url_curso = url_curso;        
        this.persona_id = persona_id;
    }
}
