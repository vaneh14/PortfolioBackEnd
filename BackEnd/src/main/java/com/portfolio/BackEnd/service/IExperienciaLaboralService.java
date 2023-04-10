/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.ExperienciaLaboral;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Vanesa
 */
public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> verTrabajos();
    
    /**
     *
     * @param work
     */
    public void crearTrabajo(ExperienciaLaboral work);
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<ExperienciaLaboral> verTrabajoId(long id);
    
    /**
     *
     * @param work
     * @return
     */
    public ExperienciaLaboral editarTrabajo(ExperienciaLaboral work);
    
    /**
     *
     * @param id
     */
    public void borrarTrabajo(long id);
    
}
