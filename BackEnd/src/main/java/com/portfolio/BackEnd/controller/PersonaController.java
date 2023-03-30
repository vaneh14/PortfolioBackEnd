/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Persona;
import com.portfolio.BackEnd.service.IPersonaService;
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
@RequestMapping("/api/persona")

public class PersonaController {
    
    @Autowired
    
    private IPersonaService persoServ;
    
    /**
     *
     * @return
     */
    @GetMapping
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    /**
     *
     * @param pers
     */
    @PostMapping("/new")
    public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    /**
     *
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable long id){
        persoServ.borrarPersona(id);
    }
    
}
