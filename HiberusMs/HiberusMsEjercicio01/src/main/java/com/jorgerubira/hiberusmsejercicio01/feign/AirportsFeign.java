package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.dtos.AirlineDto;
import com.jorgerubira.hiberusmsejercicio01.dtos.AirportsDto;
import com.jorgerubira.hiberusmsejercicio01.dtos.VuelosDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "airports", url="http://api.aviationstack.com/")
@RequestMapping("/v1")
public interface AirportsFeign { 

    
    @GetMapping("/airports") //
    public AirportsDto leerAeropuertos(@RequestParam String access_key, @RequestParam int limit);
    
    @GetMapping("/airlines") //
    public AirlineDto leerAerolineas(@RequestParam String access_key, @RequestParam int limit);
    
    @GetMapping("/flights")
    public VuelosDto leerVuelos(@RequestParam String access_key, @RequestParam int limit, @RequestParam String dep_iata, @RequestParam String airline_name);
    
    /*@PostMapping("/translate") 
    public String traducirIdiomas(@RequestParam String q,@RequestParam String source,@RequestParam String target);
    */
}
