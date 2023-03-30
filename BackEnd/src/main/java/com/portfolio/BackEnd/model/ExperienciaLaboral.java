/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
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
    private String nombre_empresa;
    private Date fechaInicio;
    private Date fechaFin;
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
     * @param nombre_empresa
     * @param fechaInicio
     * @param fechaFin
     * @param descripcion
     * @param persona_id
     */
    public ExperienciaLaboral(long id, String nombre_empresa, Date fechaInicio, Date fechaFin, String descripcion, int persona_id){
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
}
