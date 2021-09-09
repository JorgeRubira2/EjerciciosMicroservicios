package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.domain.translate.Traduccion;
import com.jorgerubira.hiberusmsejercicio01.feign.TranslateFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ejercicio1")
public class TraductorController {

    @Autowired
    private TranslateFeign traductor;

    @GetMapping("/traductor")
    public String verTraductor(Model model){
        model.addAttribute("idiomas", traductor.leerIdiomas());
        model.addAttribute("traduccion", new Traduccion());
        return "traductor";
    }

    @PostMapping("/traducir2")
    public String traducir(Model model, String q, String source, String target){
        if(q.equals("")){
            return "redirect:traductor";
        }
        model.addAttribute("idiomas", traductor.leerIdiomas());
        model.addAttribute("traduccion", traductor.obtenerTraduccion(q, source, target));
        return "traductor";
    }

    @PostMapping("/traducir")
    @ResponseBody
    public Traduccion traducir(String q, String source){
        return traductor.obtenerTraduccion(q, source, "es");
    }
}
