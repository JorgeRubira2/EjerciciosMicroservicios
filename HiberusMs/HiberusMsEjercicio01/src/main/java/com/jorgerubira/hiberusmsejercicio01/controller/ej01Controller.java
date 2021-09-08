/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.domain.Detectar;
import com.jorgerubira.hiberusmsejercicio01.domain.Traduccion;
import com.jorgerubira.hiberusmsejercicio01.feign.IdiomasFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jesus
 */
@Controller
@RequestMapping("/ej01")
public class ej01Controller {

    @Autowired
    private IdiomasFeign idiomaService;

    @GetMapping
    public String inicio(Model m, String traduccion) {
        m.addAttribute("idiomas", idiomaService.listaIdiomas());
        m.addAttribute("traduccion", traduccion);
        return "/ej01/inicio";
    }

    @PostMapping("/traducir")
    public String traducir(Traduccion t) {
        if (t.getSource().equals("detectar")) {
            Detectar[] d=idiomaService.detectar(t);
            Traduccion tAux=new Traduccion(t.getQ(),d[0].getLanguage(),"es");
            return "redirect:/ej01?traduccion=" + idiomaService.traducir(tAux).getTranslatedText();
        } else {
            return "redirect:/ej01?traduccion=" + idiomaService.traducir(t).getTranslatedText();
        }
        
    }

}
