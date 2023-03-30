/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Proyecto;
import com.portfolio.BackEnd.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class ProyectoService implements IProyectoService{
    
    @Autowired
    
    public ProyectoRepository proyRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    /**
     *
     * @param proy
     */
    @Override
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    /**
     *
     * @param id
     */
    @Override
    public void borrarProyecto(long id) {
        proyRepo.deleteById(id);
    }
    
}
