/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Vanesa
 */

@Repository

public interface HabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}
