package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.feign.VuelosFeign;
import com.jorgerubira.hiberusmsejercicio01.interfaces.IVuelosService;
import com.jorgerubira.hiberusmsejercicio01.repository.AirlineRepository;
import com.jorgerubira.hiberusmsejercicio01.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ejercicio1b")
public class VuelosController {

    @Autowired
    VuelosFeign feign;

    @Autowired
    IVuelosService servicio;

    @Autowired
    AirportRepository airportRepository;

    @Autowired
    AirlineRepository airlineRepository;

    @GetMapping("/inicio")
    public String inicio(Model model){
        model.addAttribute("aeropuertos", airportRepository.findAll());
        model.addAttribute("aerolineas", airlineRepository.findAll());
        return "ej1b/inicio";
    }

    @GetMapping("/importarDatos")
    public String importarDatos(Model model){
        servicio.importarMaestros();
        return "redirect:inicio";
    }

    @GetMapping("/verInicio")
    public String verVuelos(Model model){
        model.addAttribute("vuelos", servicio.verVuelosEspaña());
//        model.addAttribute("aeropuertos", servicio.verVuelosEspaña());
        return "/ej1b/inicio";
    }
}
