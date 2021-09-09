/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolDto implements GrantedAuthority{
    
    private String nombre;

    @Override
    public String getAuthority() {
        return nombre;
    }
}
