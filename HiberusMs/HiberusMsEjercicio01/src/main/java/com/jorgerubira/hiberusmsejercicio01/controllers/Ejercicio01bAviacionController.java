/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controllers;

import com.jorgerubira.hiberusmsejercicio01.feign.AviacionFeign;
import com.jorgerubira.hiberusmsejercicio01.service.AviacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author janus
 */
@Controller
@RequestMapping("/ejercicio01b")
public class Ejercicio01bAviacionController {
    
    @Autowired
    private AviacionService serviceReserva;
    
    @GetMapping("/reservas")
    public String reservaciones(Model m, String fechaSalida, String nombreAerolinea,String codigoAeropuerto){
        
       
        m.addAttribute("listaAerolineas", serviceReserva.consultaAerolineas());
        m.addAttribute("listaAeropuertos",serviceReserva.consultaAeropuertos() );
        m.addAttribute("listaVuelos", serviceReserva.consultaVuelos(fechaSalida, nombreAerolinea, codigoAeropuerto));
        System.out.println("consutla de reservas:  "+ serviceReserva.consultaVuelos(fechaSalida, nombreAerolinea, codigoAeropuerto) );
        m.addAttribute("listaReservas", serviceReserva.consultaReservas());
        return "ej01b/reservas";
    }
    
    @PostMapping("/traerAeropuetoAerolinea")
    private String importarAeropuertoAerolinea(){
        serviceReserva.cargarDatosAero();
        return "redirect:/ejercicio01b/reservas";
    }
}
