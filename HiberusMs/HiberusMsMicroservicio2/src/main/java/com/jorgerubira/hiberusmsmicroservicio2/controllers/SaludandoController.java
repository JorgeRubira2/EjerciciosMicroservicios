/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.controllers;

import com.jorgerubira.hiberusmsmicroservicio2.feign.PersonaFeign;
import com.jorgerubira.hiberusmsmicroservicio2.feign.TraductorFeign;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludandoController {
    
    @Autowired
    private PersonaFeign servicioMs1;
    

    
    @GetMapping("/saludaAPersona")
    public String sa(){
        return servicioMs1.obtenerSaludo() + " Pepe";
    }
    
}
