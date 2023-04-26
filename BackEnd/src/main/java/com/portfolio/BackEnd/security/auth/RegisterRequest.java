/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Vanesa
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    
    private String email;
    private String password;
    
}
