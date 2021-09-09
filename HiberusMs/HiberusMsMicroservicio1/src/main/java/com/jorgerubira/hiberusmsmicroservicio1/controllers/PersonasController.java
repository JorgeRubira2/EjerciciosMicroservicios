/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.controllers;

import com.jorgerubira.hiberusmsmicroservicio1.entities.Persona;
import java.util.List;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/persona")
public class PersonasController {

    //4 tipos operaciones:
    //Leer (GET), Insertar (POST), Modificar (PUT), Borrar (DELETE). - PATH
    // localhost:8090/ms/v1/persona  GET
    
    @GetMapping
    public List<Persona> leerPersona(){
        return null;
    }
    
    
    // localhost:8090/ms/v1/persona/nombre/Ana/apellidos/Lopez  GET
    @GetMapping("/nombre/{nombre}/apellidos/{apellidos}")
    public List<Persona> leerPersona(@PathVariable String nombre, @PathVariable String apellidos){
        return null;
    }    
    
    // localhost:8090/ms/v1/nombreYApellidos?nombre=Ana&apellidos=Lopez  GET         No es estandar.
    @GetMapping("/nombreYApellidos")
    public List<Persona> leerPersona2(String nombre, String apellidos){
        return null;
    }     
    
    // localhost:8090/ms/v1/persona/3  GET
    @GetMapping("/{id}")
    public Persona leerPersona(@PathVariable Integer id){
        return null;
    }   
    
    // localhost:8090/ms/v1/persona  POST  Body{id=4,nombre=4}
    /*@PostMapping
    public void guardarPersona(Persona persona){ //Insertar y modificar.
    } */     
    
    // localhost:8090/ms/v1/persona  POST  Body{id=4,nombre=4}
    @PostMapping
    public void insertarPersona(Persona persona){
    }   
    
    // localhost:8090/ms/v1/persona  PUT  Body{id=4,nombre=4}
    @PutMapping
    public void modificarPersona(Persona persona){
    }   

    // localhost:8090/ms/v1/persona/5  DELETE
    @DeleteMapping("/{id}")
    public void borrarPersona(@PathVariable Integer id){
    }  

/*
    <a th:href="@{/delete/(id=item.id)}">Antes</a>
    
    <form method="delete">
        <button type="submit" th:formaction="@{/delete/{id}(id=item.id)}" >borrar </button>
    </form>
*/
                
}
