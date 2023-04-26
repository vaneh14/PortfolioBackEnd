/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.security.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.awt.RenderingHints.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.SecretKey;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vanesa
 */

@Service

public class JwtService {
    
    //private static final String SECRET_KEY = "26452948404D635166546A576E5A7234753778214125442A472D4A614E645267";
    
    private static final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    
    /**
     *
     * @param token
     * @return
     */
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     *
     * @param <T>
     * @param token
     * @param claimsResolver
     * @return
     */
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     *
     * @param userDetails
     * @return
     */
    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }

    /**
     *
     * @param extraClaims
     * @param userDetails
     * @return
     */
    public String generateToken(Map<String, Object> extraClaims,
                                UserDetails userDetails) {
        
        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 *24))
                .signWith(key,SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     *
     * @param token
     * @param userDetails
     * @return
     */
    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    //private Key getSignInKey() {
    //    byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
    //    return (Key) Keys.hmacShaKeyFor(keyBytes);
    //}
  
}
