/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Idioma;
import com.jorgerubira.hiberusmsejercicio01.dtos.TraduccionDto;
import feign.Headers;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "translate", url="https://libretranslate.de")
public interface TraductorFeign {
    
    @GetMapping("/languages") //https://libretranslate.de/languages
    public List<Idioma> leerLenguajes();
    
    @PostMapping("/translate") //https://libretranslate.de/translate
    public TraduccionDto traducirLenguajes(@RequestParam String q, 
                                  @RequestParam String source, 
                                  @RequestParam String target, 
                                  @RequestParam String api_key);

    
}
