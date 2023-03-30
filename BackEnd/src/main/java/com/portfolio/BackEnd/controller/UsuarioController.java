/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.model.Usuario;
import com.portfolio.BackEnd.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vanesa
 */

@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {
    
    @Autowired
    
    private IUsuarioService userServ;
    
    /**
     *
     * @return
     */
    @GetMapping
    public List<Usuario> verUsuarios(){
        return userServ.verUsuarios();
    }
    
}
