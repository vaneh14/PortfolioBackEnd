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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String sobre_mi;
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
     * @param titulo
     * @param sobre_mi
     * @param url_linkedin
     * @param url_github
     */
    public Persona(long id, String nombre, String apellido, String titulo, String sobre_mi, String url_linkedin, String url_github){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobre_mi = sobre_mi;
        this.url_linkedin = url_linkedin;
        this.url_github = url_github;
    }
}
