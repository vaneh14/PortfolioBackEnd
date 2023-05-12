/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.ExperienciaLaboral;
import com.portfolio.BackEnd.repository.ExperienciaLaboralRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    
    public ExperienciaLaboralRepository workRepo;

    /**
     *
     * @return
     */
    @Override
    public List<ExperienciaLaboral> verTrabajos() {
        return workRepo.findAll();
    }

    /**
     *
     * @param work
     */
    @Override
    public void crearTrabajo(ExperienciaLaboral work) {
        workRepo.save(work);
    }

    /**
     *
     * @param id
     */
    @Override
    public void borrarTrabajo(long id) {
        workRepo.deleteById(id);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<ExperienciaLaboral> verTrabajoId(long id) {
        return workRepo.findById(id);
    }

    /**
     *
     * @param work
     * @return
     */
    @Override
    public ExperienciaLaboral editarTrabajo(ExperienciaLaboral work) {
        return workRepo.save(work);
    }
    
}
