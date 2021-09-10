package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.RespuestaAerolineaDto;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.RespuestaAeropuertoDto;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.CountryResponse;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.RespuestaVueloDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "vuelos", url = "http://api.aviationstack.com/v1/")
public interface VuelosFeign {

    @GetMapping("/flights")
    public RespuestaVueloDto verVuelos(@RequestParam String access_key);

    @GetMapping("/airports") // ?access_key=8e7e1ac5b34b2ac69236e5456103a8a0&limit=99999"
    public RespuestaAeropuertoDto verAeropuertos(@RequestParam String access_key, @RequestParam Integer limit);

    @GetMapping("/airlines")
    public RespuestaAerolineaDto verAerolineas(@RequestParam String access_key, @RequestParam Integer limit);

    @GetMapping("/countries")
    public CountryResponse verPaises(@RequestParam String access_key, @RequestParam Integer limit);
}
