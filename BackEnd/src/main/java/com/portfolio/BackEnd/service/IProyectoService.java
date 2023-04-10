/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Proyecto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Vanesa
 */
public interface IProyectoService {
    
    public List<Proyecto> verProyectos();
    
    /**
     *
     * @param proy
     */
    public void crearProyecto(Proyecto proy);
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<Proyecto> verProyectoId(long id);
   
    /**
     *
     * @param proy
     * @return
     */
    public Proyecto editarProyecto(Proyecto proy);
    
    /**
     *
     * @param id
     */
    public void borrarProyecto(long id);
    
}
