/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.controllers;

import com.jorgerubira.hiberusmsmicroservicio1.entities.Usuario;
import com.jorgerubira.hiberusmsmicroservicio1.repositories.UsuarioRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SeguridadControlador {

    @Autowired
    private UsuarioRepository repoUsu;
    
    @Autowired
    private PasswordEncoder passEncoder;
    
    @GetMapping("/url1")    //Todo el mundo
    @ResponseBody
    public String saludar1(){
        return "saluda 1";
    }

    @GetMapping("/url2")    //Todo el validados
    @ResponseBody
    public String saludar2(){
        return "saluda 2";
    }

    @GetMapping("/url3")    //Todo el adminstradores Admin.
    @ResponseBody
    public String saludar3(){
        return "saluda 3";
    }
    
    @GetMapping("/login2")
    public String login(){
        return "milogin";
    }
    
    @GetMapping("/altaUsuario")
    public String altaUsuario(){
        return "altaUsuario";
    }
    
    @PostMapping("/altaUsuario")
    public String altaUsuarioPost(String usuario, String password){
        Usuario u=new Usuario();
        u.setNombre(usuario);
        u.setPassword(passEncoder.encode(password));
        repoUsu.save(u);
        return "redirect:/altaUsuario";
    }    

    @GetMapping("/info")
    @ResponseBody
    public String info(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        final StringBuffer res=new StringBuffer();
        authentication.getAuthorities().forEach(x->{
           res.append("," + x.getAuthority());
        });
        return authentication.getName() + res.toString();
    }
    

}
