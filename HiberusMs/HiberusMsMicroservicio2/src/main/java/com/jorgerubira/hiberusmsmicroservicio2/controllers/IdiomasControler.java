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
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IdiomasControler {
    
    @Autowired
    private TraductorFeign traductor;    
    
    @Autowired
    private VuelosFeign vuelos;

    @Autowired
    private ModelMapper mapper;
    
    @GetMapping("/obtenerIdiomas")
    public String listaIdiomas(Model m){
        m.addAttribute("idiomas", traductor.leerLenguajes());
        return "verIdiomas";
    }
    
    @GetMapping("/prueba")
    @ResponseBody
    public TraduccionDto prueba(Model m){ 
        return traductor.traducirLenguajes("Hello", "en", "es", "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
    }    
    
    @GetMapping("/prueba2")
    @ResponseBody
    public AirportsDto prueba2(){ 
        return vuelos.leer("8e7e1ac5b34b2ac69236e5456103a8a0", 10);
    }    

    @GetMapping("/prueba3")
    @ResponseBody
    public AirportsDto prueba3(){ 
        return vuelos.leer("8e7e1ac5b34b2ac69236e5456103a8a0", 10); 
    }    
    
}
