/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.controllers;

import com.jorgerubira.hiberusmsmicroservicio2.dtos.AirportsDataDto;
import com.jorgerubira.hiberusmsmicroservicio2.dtos.AirportsDataDto2;
import com.jorgerubira.hiberusmsmicroservicio2.dtos.AirportsDto;
import com.jorgerubira.hiberusmsmicroservicio2.dtos.TraduccionDto;
import com.jorgerubira.hiberusmsmicroservicio2.feign.TraductorFeign;
import com.jorgerubira.hiberusmsmicroservicio2.feign.VuelosFeign;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ejercicio01")
public class IdiomasControler {
    
    @Autowired
    private TraductorFeign traductor;    
    
    @Autowired
    private VuelosFeign vuelos;

    @Autowired
    private ModelMapper mapper;
    
    @GetMapping("/traductor")
    public String traductor(Model m){
        m.addAttribute("idiomas", traductor.leerLenguajes());
        return "ejercicio01/traductor";
    }
    
    @GetMapping("/prueba")
    @ResponseBody
    public TraduccionDto prueba(Model m){ 
        return traductor.traducirLenguajes("Hello", "en", "es", "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
    }      
    
}
