/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Habilidad;
import com.portfolio.BackEnd.service.IHabilidadService;
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
@RequestMapping("/api/habilidad")

public class HabilidadController {
    
    @Autowired
    
    private IHabilidadService skillServ;
    
    /**
     *
     * @return
     */
    @GetMapping
    public List<Habilidad> verHabilidades(){
        return skillServ.verHabilidades();
    }
    
    /**
     *
     * @param skill
     */
    @PostMapping("/new")
    public void crearHabilidad(@RequestBody Habilidad skill){
        skillServ.crearHabilidad(skill);
    }
    
    /**
     *
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void borrarHabilidad(@PathVariable long id){
        skillServ.borrarHabilidad(id);
    }
    
}
