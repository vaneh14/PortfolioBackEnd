/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Educacion;
import com.portfolio.BackEnd.service.IEducacionService;
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
@RequestMapping("/api/educacion")

public class EducacionController {
    
    @Autowired
    
    private IEducacionService cursoServ;
    
    /**
     *
     * @return
     */
    /* MOSTRAR CURSOS */
    @GetMapping
    public List<Educacion> verCursos(){
        return cursoServ.verCursos();
    }
    
    /**
     *
     * @param curs
     */
    /* AGREGAR CURSO */
    @PostMapping("/new")
    public void crearCurso(@RequestBody Educacion curs){
        cursoServ.crearCurso(curs);
    }
    
    /**
     *
     * @param id
     * @return
     */
    /* EDITAR CURSO */
    @GetMapping("/edit/{id}")
    public Optional<Educacion> verCursoId(@PathVariable long id){
        return cursoServ.verCursoId(id);
    }
    
    /**
     *
     * @param curs
     * @param id
     * @return
     */
    @PutMapping("/edit/{id}")
    public Educacion editarCurso(@RequestBody Educacion curs, @PathVariable long id) {
        return cursoServ.editarCurso(curs);
    }
        
    /**
     *
     * @param id
     */
    
    /* ELIMINAR CURSO */
    @DeleteMapping("/delete/{id}")
    public void borrarCurso(@PathVariable long id){
        cursoServ.borrarCurso(id);
    }
    
}
