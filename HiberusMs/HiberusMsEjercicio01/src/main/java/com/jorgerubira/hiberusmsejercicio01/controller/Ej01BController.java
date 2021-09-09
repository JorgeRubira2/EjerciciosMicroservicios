/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.entities.AirportData;
import com.jorgerubira.hiberusmsejercicio01.feign.AirportFeign;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jesus
 */
@Controller
@RequestMapping("/ej01b")
public class Ej01BController {
    @Autowired
    private AirportFeign service;
    
    @GetMapping
    public String inicio(Model m, String pais){
        System.out.println("hola "+pais);
        if(pais!=null){
            List<AirportData> ad=service.aeropuertos("8e7e1ac5b34b2ac69236e5456103a8a0",9999).getData();
            //System.out.println(ad.get(0).getCountry_name());
            //ad=ad.stream().filter(x->x.getCountry_name().equals("Spain")).collect(Collectors.toList());
            m.addAttribute("aeropuerto", ad); 
        }
        return "/ej01b/inicio";
    }
    
}
