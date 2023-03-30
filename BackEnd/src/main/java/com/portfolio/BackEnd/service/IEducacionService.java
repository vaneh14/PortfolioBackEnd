/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Educacion;
import java.util.List;

/**
 *
 * @author Vanesa
 */
public interface IEducacionService {
    
    /**
     *
     * @return
     */
    public List<Educacion> verCursos();
    
    /**
     *
     * @param curs
     */
    public void crearCurso(Educacion curs);
    
    /**
     *
     * @param id
     */
    public void borrarCurso(long id);    
       
}
