/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Habilidad;
import com.portfolio.BackEnd.repository.HabilidadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service 

public class HabilidadService implements IHabilidadService {
    
    @Autowired
    
    public HabilidadRepository skillRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Habilidad> verHabilidades() {
        return skillRepo.findAll();
    }

    /**
     *
     * @param skill
     */
    @Override
    public void crearHabilidad(Habilidad skill) {
        skillRepo.save(skill);
    }

    /**
     *
     * @param id
     */
    @Override
    public void borrarHabilidad(long id) {
        skillRepo.deleteById(id);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<Habilidad> verHabilidadId(long id) {
        return skillRepo.findById(id);
    }

    /**
     *
     * @param skill
     * @return
     */
    @Override
    public Habilidad editarHabilidad(Habilidad skill) {
        return skillRepo.save(skill);
    }

}
