/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Proyecto;
import com.portfolio.BackEnd.service.IProyectoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vanesa
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/proyecto")

public class ProyectoController {
    
    @Autowired
    
    private IProyectoService proyServ;
    
    /**
     *
     * @return
     */
    /* MOSTRAR PROYECTOS */
    @GetMapping
    public List<Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
   
    /**
     *
     * @param proy
     */
    /* AGREGAR PROYECTO */
    @PostMapping("/new")
    public void crearProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    /**
     *
     * @param id
     * @return
     */
    /* EDITAR PROYECTO */ 
    @GetMapping("/edit/{id}")
    public Optional<Proyecto> verProyectoId(@PathVariable long id){
        return proyServ.verProyectoId(id);
    }
    
    /**
     *
     * @param proy
     * @param id
     * @return
     */
    @PutMapping("/edit/{id}")
    public Proyecto editarProyecto(@RequestBody Proyecto proy, @PathVariable long id) {
        return proyServ.editarProyecto(proy);
    }
    
    /**
     *
     * @param id
     */
    /* ELIMINAR PROYECTO */
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable long id){
        proyServ.borrarProyecto(id);
    }
    
}
