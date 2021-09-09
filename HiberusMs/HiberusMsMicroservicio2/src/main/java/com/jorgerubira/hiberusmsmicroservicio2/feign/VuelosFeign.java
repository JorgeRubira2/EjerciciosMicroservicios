/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.feign;

import com.jorgerubira.hiberusmsmicroservicio2.dtos.AirportsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "vuelos", url="http://api.aviationstack.com")
@RequestMapping("/v1")
public interface VuelosFeign {
    
    @GetMapping("/airports")
    public AirportsDto leer(@RequestParam String access_key, @RequestParam int limit);
    
}
