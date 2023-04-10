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

public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String nombre_puesto;
    private String nombre_empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private int persona_id;
    
    /**
     *
     */
    public ExperienciaLaboral(){        
    }
    
    /**
     *
     * @param id
     * @param nombre_puesto
     * @param nombre_empresa
     * @param fecha_inicio
     * @param fecha_fin
     * @param descripcion
     * @param persona_id
     */
    public ExperienciaLaboral(long id, String nombre_puesto, String nombre_empresa, String fecha_inicio, String fecha_fin, String descripcion, int persona_id){
        this.id = id;
        this.nombre_puesto = nombre_puesto;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
    
}
