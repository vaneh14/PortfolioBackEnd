/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Persona;
import com.portfolio.BackEnd.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class PersonaService implements IPersonaService{

    @Autowired
    
    public PersonaRepository persoRepo;
    
    /**
     *
     * @return
     */
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    /**
     *
     * @param pers
     */
    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    /**
     *
     * @param id
     */
    @Override
    public void borrarPersona(long id) {
        persoRepo.deleteById(id);
    }

}
