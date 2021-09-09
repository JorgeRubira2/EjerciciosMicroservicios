/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.dto.AerolineaDto;
import com.jorgerubira.hiberusmsejercicio01.dto.AeropuertoDto;
import com.jorgerubira.hiberusmsejercicio01.dto.VueloDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author janus
 */
@FeignClient(name="aviacion" , url="https://aviationstack.com/v1")
public interface AviacionFeign {
    String token="2573fdb7973e63abcf701430bdd7f1a9";
    // http://api.aviationstack.com/v1/airports?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=99999

    @GetMapping("/airports?access_key="+token)
    public List<AerolineaDto> leerAerolineas(@RequestParam Integer limit);
    
    @GetMapping("/airports?access_key="+token)
    public List<AeropuertoDto> leerAeropuertos(@RequestParam Integer limit);
    
    
    
    // dep_icao --> codigo de aeropuerto
    @GetMapping("/flights?access_key="+token)
    public List<VueloDto> leerVuelos(@RequestParam Integer limit, 
                                  @RequestParam String flight_date, 
                                  @RequestParam String airline_name,
                                  @RequestParam String dep_icao);
    
}
