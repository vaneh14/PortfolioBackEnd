/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Usuario;
import com.portfolio.BackEnd.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class UsuarioService implements IUsuarioService {
    
    /**
     *
     */
    @Autowired
    
    public UsuarioRepository userRepo;

    @Override
    public List<Usuario> verUsuarios() {
        return userRepo.findAll();
    }
    

    
}
