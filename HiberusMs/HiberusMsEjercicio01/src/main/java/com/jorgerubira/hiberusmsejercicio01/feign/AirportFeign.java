/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Airport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jesus
 */
@FeignClient(name = "airport", url="http://api.aviationstack.com/v1")
public interface AirportFeign {
    //http://api.aviationstack.com/v1/airports?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=9999
    @GetMapping("/airports")
    public Airport aeropuertos(@RequestParam String access_key, @RequestParam int limit);
}
