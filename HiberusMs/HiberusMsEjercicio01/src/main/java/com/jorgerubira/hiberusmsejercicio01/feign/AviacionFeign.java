/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.entity.Aerolinea;
import com.jorgerubira.hiberusmsejercicio01.entity.Aeropuerto;
import com.jorgerubira.hiberusmsejercicio01.entity.Vuelo;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author janus
 */
@FeignClient(name="aviacion" , url="https://aviationstack.com/v1")
public interface AviacionFeign {
    String token="2573fdb7973e63abcf701430bdd7f1a9";
    // http://api.aviationstack.com/v1/airports?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=99999

    @GetMapping("/airports?access_key="+token)
    public List<Aerolinea> leerAerolineas();
    
    @GetMapping("/airports?access_key="+token)
    public List<Aeropuerto> leerAeropuertos();
    
    @GetMapping("/flights?access_key="+token)
    public List<Vuelo> leerVuelos();
    
}
