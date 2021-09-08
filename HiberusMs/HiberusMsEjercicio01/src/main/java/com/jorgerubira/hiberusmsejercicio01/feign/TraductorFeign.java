package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Idioma;
import com.jorgerubira.hiberusmsejercicio01.domain.Traduccion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name="traductor", url = "https://libretranslate.de")
public interface TraductorFeign {

    @GetMapping("/languages")
    public List<Idioma> leerIdiomas();

    @PostMapping("/translate")
    public Traduccion obtenerTraduccion(String q, String source, String target);
}
