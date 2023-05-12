/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Habilidad;
import com.portfolio.BackEnd.service.IHabilidadService;
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

@CrossOrigin(origins = "https://portfolio-vhuarte.web.app")
@RestController
@RequestMapping("/api/habilidad")

public class HabilidadController {
    
    @Autowired
    
    private IHabilidadService skillServ;
    
    /**
     *
     * @return
     */
    /* MOSTRAR HABILIDADES */
    @GetMapping
    public List<Habilidad> verHabilidades(){
        return skillServ.verHabilidades();
    }
    
    /**
     *
     * @param skill
     */
    /* CREAR HABILIDAAD */
    @PostMapping("/new")
    public void crearHabilidad(@RequestBody Habilidad skill){
        skillServ.crearHabilidad(skill);
    }
    
    /**
     *
     * @param id
     * @return
     */
    /* EDITAR HABILIDAD */
    @GetMapping("/edit/{id}")
    public Optional<Habilidad> verHabilidadId(@PathVariable long id){
        return skillServ.verHabilidadId(id);
    }
    
    /**
     *
     * @param skill
     * @param id
     * @return
     */
    @PutMapping("/edit/{id}")
    public Habilidad editarHabilidad(@RequestBody Habilidad skill, @PathVariable long id) {
        return skillServ.editarHabilidad(skill);
    }
    
    /**
     *
     * @param id
     */
    /* ELIMINAR HABILIDAD */
    @DeleteMapping("/delete/{id}")
    public void borrarHabilidad(@PathVariable long id){
        skillServ.borrarHabilidad(id);
    }
    
}
