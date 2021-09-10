/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.domain.FlightData;
import com.jorgerubira.hiberusmsejercicio01.entities.AirportData;
import com.jorgerubira.hiberusmsejercicio01.entities.Reserva;
import com.jorgerubira.hiberusmsejercicio01.feign.AirportFeign;
import com.jorgerubira.hiberusmsejercicio01.repository.AirportDataRepository;
import com.jorgerubira.hiberusmsejercicio01.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @Autowired
    private AirportDataRepository repoService;
    
    @Autowired
    private ReservaRepository reservaRepo;
    
    @GetMapping
    public String inicio(){
        
        return "/ej01b/inicio";
    }
    
    @GetMapping("/importar")
    public String importacion (){
        List<AirportData> ad=service.aeropuertos("8e7e1ac5b34b2ac69236e5456103a8a0",9999).getData();
        System.out.println(ad.size());
        ad.forEach(x->repoService.save(x));
        
        return "redirect:/ej01b/aeropuertos";
    }
    
    @GetMapping("/aeropuertos")
    public String aeropuertos(Model m){
        List<AirportData> ad=repoService.findByCountryName("Spain");
        m.addAttribute("aeropuerto", ad);
        return "/ej01b/aeropuerto";
    }
    @PostMapping("/vuelos")
    public String vuelos(Model m, Integer id){
        System.out.println(id+"eyyyyyyyyyyyyyyyy");
        AirportData ad=repoService.findById(id).get();
        List<FlightData> fd=service.vuelos("8e7e1ac5b34b2ac69236e5456103a8a0", ad.getIataCode()).getData();
        m.addAttribute("aeropuerto", ad.getAirportName());
        m.addAttribute("vuelosDatos",fd);
        return "/ej01b/vuelos";
    }
    @PostMapping("/comprar")
    public String compra(Model m, Reserva r){
        reservaRepo.save(r);
        
        return "redirect:/ej01b/reserva";
    }
    @GetMapping("/reserva")
    public String reserva(Model m){
        m.addAttribute("reserva", reservaRepo.findAll());
        return "/ej01b/reserva";
    }
    
    
}
