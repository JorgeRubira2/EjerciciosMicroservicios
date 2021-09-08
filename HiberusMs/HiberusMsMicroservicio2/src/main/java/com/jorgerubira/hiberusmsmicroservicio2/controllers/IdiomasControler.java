/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.controllers;

import com.jorgerubira.hiberusmsmicroservicio2.feign.TraductorFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdiomasControler {
    
    @Autowired
    private TraductorFeign traductor;     
    
    @GetMapping("/obtenerIdiomas")
    public String listaIdiomas(Model m){
        m.addAttribute("idiomas", traductor.leerLenguajes());
        return "verIdiomas";
    }
    
}
