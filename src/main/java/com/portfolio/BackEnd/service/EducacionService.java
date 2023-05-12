/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Educacion;
import com.portfolio.BackEnd.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
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

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<Educacion> verCursoId(long id) {
        return cursoRepo.findById(id);
    }

    /**
     *
     * @param curs
     * @return
     */
    @Override
    public Educacion editarCurso(Educacion curs) {
        return cursoRepo.save(curs);
    }
    
}
