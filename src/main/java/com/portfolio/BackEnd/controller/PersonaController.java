/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Persona;
import com.portfolio.BackEnd.service.IPersonaService;
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
@RequestMapping("/api/persona")

public class PersonaController {
    
    @Autowired
    
    private IPersonaService persoServ;
    
    /**
     *
     * @return
     */
    /* MOSTRAR PERSONAS */
    @GetMapping
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    /**
     *
     * @param pers
     */
    /* AGREGAR PERSONA */
    @PostMapping("/new")
    public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    /**
     *
     * @param id
     * @return
     */
    /* EDITAR PERSONA */
    @GetMapping("/edit/{id}")
    public Optional<Persona> verPersonaId(@PathVariable long id){
        return persoServ.verPersonaId(id);
    }
    
    /**
     *
     * @param pers
     * @param id
     * @return
     */
    @PutMapping("/edit/{id}")
    public Persona editarPersona(@RequestBody Persona pers, @PathVariable long id) {
        return persoServ.editarPersona(pers);
    }
    
    /**
     *
     * @param id
     */
    /* ELIMINAR PERSONA */
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable long id){
        persoServ.borrarPersona(id);
    }
    
}
