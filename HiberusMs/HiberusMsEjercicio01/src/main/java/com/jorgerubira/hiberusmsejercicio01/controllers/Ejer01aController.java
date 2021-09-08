
package com.jorgerubira.hiberusmsejercicio01.controllers;

import com.jorgerubira.hiberusmsejercicio01.domain.Traducido;
import com.jorgerubira.hiberusmsejercicio01.feign.TraductorFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ejercicio01")
public class Ejer01aController {
    
    @Autowired
    private TraductorFeign traductor;     
    
    @GetMapping
    public String inicio(Model m){
        m.addAttribute("idiomas", traductor.leerLenguajes());
        m.addAttribute("traducido",null);
        return "/ej01a/idiomas";
    }
    
    @PostMapping("/traduce")
    public String traduce (Model m, String source, String target, String original){
        Traducido aux = traductor.traducirIdiomas(original, source, target);
        if (aux.getError()==null){
            m.addAttribute("traducido",aux.getTranslatedText());
        }else{
            m.addAttribute("error",aux.getError());
        }
        m.addAttribute("idiomas", traductor.leerLenguajes());
        return "/ej01a/idiomas";
    }
    
    @GetMapping("/traducir")
    @ResponseBody
    public String traducir(String texto,String origen){
       Traducido aux = traductor.traducirIdiomas(texto, origen, "es"); 
       if (aux.getError()!=null){
           return "Error de traduccion";
       } else{
           return aux.getTranslatedText();
       }
    }
    
}
