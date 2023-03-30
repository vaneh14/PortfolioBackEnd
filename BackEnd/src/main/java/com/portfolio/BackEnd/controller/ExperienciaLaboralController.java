/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.ExperienciaLaboral;
import com.portfolio.BackEnd.service.IExperienciaLaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/api/experiencia-laboral")

public class ExperienciaLaboralController {
    
    @Autowired
    
    private IExperienciaLaboralService workServ;
    
    /**
     *
     * @return
     */
    @GetMapping
    public List<ExperienciaLaboral> verTrabajos(){
        return workServ.verTrabajos();
    }
   
    /**
     *
     * @param work
     */
    @PostMapping("/new")
    public void crearTrabajo(@RequestBody ExperienciaLaboral work){
        workServ.crearTrabajo(work);
    }
    
    /**
     *
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void borrarTrabajo(@PathVariable long id){
        workServ.borrarTrabajo(id);
    }
    
}
