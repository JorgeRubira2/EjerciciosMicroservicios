/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.controllers;

import com.jorgerubira.hiberusmsmicroservicio1.dto.PersonaDto;
import com.jorgerubira.hiberusmsmicroservicio1.entities.Persona;
import com.jorgerubira.hiberusmsmicroservicio1.repositories.PersonaRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class APIPersonasController {
    
    @Autowired
    private PersonaRepository repoPer;

    @Autowired
    private ModelMapper obj;
    
    @GetMapping
    public List<PersonaDto> findAll(){
        return repoPer.findAll()
                      .stream()
                      .map(x-> obj.map(x, PersonaDto.class))
                      .collect(Collectors.toList()); 
    }

    @GetMapping("/{id}")  
    public PersonaDto findById(@PathVariable Integer id){
        return obj.map(repoPer.findById(id), PersonaDto.class);
    }

}
