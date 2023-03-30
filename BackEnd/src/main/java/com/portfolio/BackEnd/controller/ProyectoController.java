/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Proyecto;
import com.portfolio.BackEnd.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vanesa
 */

@CrossOrigin
@RestController
@RequestMapping("/api/proyecto")

public class ProyectoController {
    
    @Autowired
    
    private IProyectoService proyServ;
    
    /**
     *
     * @return
     */
    @GetMapping
    public List<Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
   
    /**
     *
     * @param proy
     */
    @PostMapping("/new")
    public void crearProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    /**
     *
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable long id){
        proyServ.borrarProyecto(id);
    }
    
}
