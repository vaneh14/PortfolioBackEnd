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

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String url_imagen;
    private String url_linkedin;
    private String url_github;
    
    /**
     *
     */
    public Persona(){        
    }
    
    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param sobre_mi
     * @param url_imagen
     * @param url_linkedin
     * @param url_github
     */
    public Persona(long id, String nombre, String apellido, String sobre_mi, String url_imagen, String url_linkedin, String url_github){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.url_imagen = url_imagen;
        this.url_linkedin = url_linkedin;
        this.url_github = url_github;
    }
}
