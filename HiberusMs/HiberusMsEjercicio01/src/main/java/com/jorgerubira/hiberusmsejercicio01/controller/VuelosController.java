package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.Airport;
import com.jorgerubira.hiberusmsejercicio01.feign.VuelosFeign;
import com.jorgerubira.hiberusmsejercicio01.interfaces.IVuelosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ejercicio1b")
public class VuelosController {

    @Autowired
    VuelosFeign feign;

    @Autowired
    IVuelosService servicio;

    @GetMapping("/inicio")
    public String inicio(){
        return "ej1b/inicio";
    }

    @GetMapping("/verAeropuertos")
    @ResponseBody
    public List<Airport> verAeropuertos(){
        return servicio.filtrarAeropuertos(feign.verAeropuertos("8e7e1ac5b34b2ac69236e5456103a8a0", 99999).getData());
    }

}
