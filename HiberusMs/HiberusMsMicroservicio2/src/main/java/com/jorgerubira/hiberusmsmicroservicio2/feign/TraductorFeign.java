/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.feign;

import com.jorgerubira.hiberusmsmicroservicio2.domain.Idioma;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "translate", url="https://libretranslate.de")
public interface TraductorFeign {
    
    @GetMapping("/languages") //https://libretranslate.de/languages
    public List<Idioma> leerLenguajes();
    
}
