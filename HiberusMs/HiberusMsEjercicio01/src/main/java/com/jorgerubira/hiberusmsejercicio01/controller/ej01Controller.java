/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.controller;

import com.jorgerubira.hiberusmsejercicio01.feign.IdiomasFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String inicio(Model m){

        m.addAttribute("idiomas", idiomaService.listaIdiomas());
        return "/ej01/inicio";
    }
}
