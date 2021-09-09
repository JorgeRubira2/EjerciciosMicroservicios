package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.AirportResponse;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.FlightResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "vuelos", url = "http://api.aviationstack.com/v1/")
public interface VuelosFeign {

    @GetMapping("/flights")
    public FlightResponse verVuelos(@RequestParam String accessKey);

    @GetMapping("/airports") // ?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=99999"
    public AirportResponse verAeropuertos(@RequestParam String access_key, @RequestParam Integer limit);
}
