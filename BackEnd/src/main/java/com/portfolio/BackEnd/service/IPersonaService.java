/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Vanesa
 */
public interface IPersonaService {
    
    /**
     *
     * @return
     */
    public List<Persona> verPersonas();
    
    /**
     *
     * @param pers
     */
    public void crearPersona(Persona pers);
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<Persona> verPersonaId(long id);
    
    /**
     *
     * @param pers
     * @return
     */
    public Persona editarPersona(Persona pers);
    
    /**
     *
     * @param id
     */
    public void borrarPersona(long id);
    
}
