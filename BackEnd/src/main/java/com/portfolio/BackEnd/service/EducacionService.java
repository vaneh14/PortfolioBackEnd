/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Educacion;
import com.portfolio.BackEnd.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class EducacionService implements IEducacionService{
    
    @Autowired
    
    public EducacionRepository cursoRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Educacion> verCursos() {
        return cursoRepo.findAll();
    }

    /**
     *
     * @param curs
     */
    @Override
    public void crearCurso(Educacion curs) {
        cursoRepo.save(curs);
    }

    /**
     *
     * @param id
     */
    @Override
    public void borrarCurso(long id) {
        cursoRepo.deleteById(id);
    }    
    
}
