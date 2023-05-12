/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.ExperienciaLaboral;
import com.portfolio.BackEnd.service.IExperienciaLaboralService;
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
@RequestMapping("/api/experiencia-laboral")

public class ExperienciaLaboralController {
    
    @Autowired
    
    private IExperienciaLaboralService workServ;
    
    /**
     *
     * @return
     */
    /* MOSTRAR TRABAJOS*/
    @GetMapping
    public List<ExperienciaLaboral> verTrabajos(){
        return workServ.verTrabajos();
    }
    
    /**
     *
     * @param work
     */
    /* AGREGAR TRABAJO */
    @PostMapping("/new")
    public void crearTrabajo(@RequestBody ExperienciaLaboral work){
        workServ.crearTrabajo(work);
    }
    
    /**
     *
     * @param id
     * @return
     */
    /* EDITAR TRABAJO */
    @GetMapping("/edit/{id}")
    public Optional<ExperienciaLaboral> verTrabajoId(@PathVariable long id){
        return workServ.verTrabajoId(id);
    }
    
    /**
     *
     * @param work
     * @param id
     * @return
     */
    @PutMapping("/edit/{id}")
    public ExperienciaLaboral editarTrabajo(@RequestBody ExperienciaLaboral work, @PathVariable long id) {
        return workServ.editarTrabajo(work);
    }
    
    /**
     *
     * @param id
     */
    /* ELIMINAR TTRABAJO */
    @DeleteMapping("/delete/{id}")
    public void borrarTrabajo(@PathVariable long id){
        workServ.borrarTrabajo(id);
    }
    
}
