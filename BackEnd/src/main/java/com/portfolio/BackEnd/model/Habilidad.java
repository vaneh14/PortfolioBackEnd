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

public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String nombre_habilidad;
    private String porcentaje;
    private int persona_id;
    
    
    /**
     *
     */
    public Habilidad(){        
    }
    
    /**
     *
     * @param id
     * @param nombre_habilidad
     * @param porcentaje
     * @param persona_id
     */
    public Habilidad(long id, String nombre_habilidad, String porcentaje, int persona_id){
        this.id = id;
        this.nombre_habilidad = nombre_habilidad;
        this.porcentaje = porcentaje;
        this.persona_id = persona_id;
    }
    
}
