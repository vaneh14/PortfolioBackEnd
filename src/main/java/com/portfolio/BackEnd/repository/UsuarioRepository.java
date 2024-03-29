/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Vanesa
 */

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
    /**
     *
     * @param email
     * @return
     */
    Optional<Usuario> findOneByEmail(String email);

    /**
     *
     * @param usuario
     */
    public void save(UserDetails usuario);
    
}
