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
@Setter
@Getter

public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String nombre_proyecto;
    private String descripcion;
    private String url_imagen;
    private String url_repositorio;
    private String url_proyecto;
    private int persona_id;
    
    public Proyecto(){        
    }
    
    /**
     *
     * @param id
     * @param nombre_proyecto
     * @param descripcion
     * @param url_imagen
     * @param url_repositorio
     * @param url_proyecto
     * @param persona_id
     */
    public Proyecto(long id, String nombre_proyecto, String descripcion, String url_imagen, String url_repositorio, String url_proyecto, int persona_id){
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
        this.url_repositorio = url_repositorio;
        this.url_proyecto = url_proyecto;
        this.persona_id = persona_id;
    }
    
}
