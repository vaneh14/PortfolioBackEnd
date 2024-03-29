/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Habilidad;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Vanesa
 */
public interface IHabilidadService {
    
    /**
     *
     * @return
     */
    public List<Habilidad> verHabilidades();
    
    /**
     *
     * @param skill
     */
    public void crearHabilidad(Habilidad skill);
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<Habilidad> verHabilidadId(long id);
    
    /**
     *
     * @param skill
     * @return
     */
    public Habilidad editarHabilidad(Habilidad skill);
    
    /**
     *
     * @param id
     */
    public void borrarHabilidad(long id);
   
}
