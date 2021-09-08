/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controllers;

import com.jorgerubira.hiberusmsejercicio01.feign.TraductorFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author janus
 */
@Controller
@RequestMapping("/ejercicioTraduccion")
public class Ejercicio01TraduccionAPIController {
    @Autowired
    private TraductorFeign feignTraduc;
    
    @GetMapping("/traductor")
    public String traducirCodigo(Model m){
        m.addAttribute("lenguajes", feignTraduc.leerLenguajes());
        m.addAttribute("lenguajeEntrada", "es");
        m.addAttribute("lenguajeSalida", "es");
        return "traductor";
    }
    
    @PostMapping("/traducir")
    public String traducir(Model m, String lenguajeEntrada, String lenguajeSalida ,String textoEntrada){
        m.addAttribute("lenguajes", feignTraduc.leerLenguajes());
        m.addAttribute("lenguajeEntrada", lenguajeEntrada);
        m.addAttribute("lenguajeSalida", lenguajeSalida);
        m.addAttribute("textoEntrada", textoEntrada);
        System.out.println("Texto Traducido" + feignTraduc.traducir(textoEntrada,lenguajeEntrada,lenguajeSalida).getTranslatedText());
        m.addAttribute("textoSalida", feignTraduc.traducir(textoEntrada,lenguajeEntrada,lenguajeSalida));
        return "traductor";
    }
}
