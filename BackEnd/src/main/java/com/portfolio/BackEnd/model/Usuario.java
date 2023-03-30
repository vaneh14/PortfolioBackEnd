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

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    private String email;
    private String password;
    private int persona_id;
    
    public Usuario(){        
    }
    
    /**
     *
     * @param id
     * @param email
     * @param password
     * @param persona_id
     */
    public Usuario(long id, String email, String password, int persona_id){
        this.id = id;
        this.email = email;
        this.password = password;
        this.persona_id = persona_id;
    }
    
}
