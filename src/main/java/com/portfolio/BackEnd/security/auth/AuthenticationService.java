/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.security.auth;

import com.portfolio.BackEnd.model.Usuario;
import com.portfolio.BackEnd.repository.UsuarioRepository;
import com.portfolio.BackEnd.security.config.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service
@RequiredArgsConstructor

public class AuthenticationService {
    
    private final UsuarioRepository usuarioRepo;
    
    private final PasswordEncoder passwordEncoder;
    
    private final JwtService jwtService;
    
    private final AuthenticationManager authenticationManager;
    
    /**
     *
     * @param request
     * @return
     */
    public AuthenticationResponse register(RegisterRequest request) {
        Usuario usuario = new Usuario();
            usuario.setEmail(request.getEmail());
            usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        
        usuarioRepo.save(usuario);
        var jwtToken = jwtService.generateToken(usuario);
        
        return AuthenticationResponse.builder()
                                     .token(jwtToken)
                                     .build();
    }

    /**
     *
     * @param request
     * @return
     */
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),
                                                                                   request.getPassword()));
        var usuario = usuarioRepo.findOneByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(usuario);
        
        return AuthenticationResponse.builder()
                                     .token(jwtToken)
                                     .build();
    }

        
}
