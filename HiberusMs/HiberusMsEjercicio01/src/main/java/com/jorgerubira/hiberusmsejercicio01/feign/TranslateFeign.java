package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Idioma;
import com.jorgerubira.hiberusmsejercicio01.domain.Traduccion;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="traductor", url = "https://libretranslate.de")
public interface TranslateFeign {

    @GetMapping("/languages")
    public List<Idioma> leerIdiomas();

    @PostMapping("/translate")
    public Traduccion obtenerTraduccion(@RequestParam String q, @RequestParam String source, @RequestParam String target);
}
