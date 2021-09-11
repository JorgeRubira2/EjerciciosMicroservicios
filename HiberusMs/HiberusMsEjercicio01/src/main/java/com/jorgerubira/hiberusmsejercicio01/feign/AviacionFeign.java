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
@FeignClient(name="aviacion" , url="http://api.aviationstack.com/v1")
public interface AviacionFeign {
    
    // http://api.aviationstack.com/v1/airports?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=99999

    @GetMapping("/airlines")
    public AerolineaDto leerAerolineas(@RequestParam String access_key, @RequestParam Integer limit);
    
    @GetMapping("/airports")
    public AeropuertoDto leerAeropuertos(@RequestParam String access_key, @RequestParam Integer limit);
    
    
    
    // dep_icao --> codigo de aeropuerto
    @GetMapping("/flights")
    public VueloDto leerVuelos( @RequestParam String access_key,
                                  @RequestParam Integer limit, 
                                  @RequestParam String flight_date, 
                                  @RequestParam String airline_name,
                                  @RequestParam String dep_icao);
    
}
