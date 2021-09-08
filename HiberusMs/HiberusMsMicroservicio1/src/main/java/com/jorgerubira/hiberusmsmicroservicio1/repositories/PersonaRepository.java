package com.jorgerubira.hiberusmsmicroservicio1.repositories;

import com.jorgerubira.hiberusmsmicroservicio1.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    
    //@Query(value = "call proc(:nombre)", nativeQuery = true)
    //public void procedimiento(String nombre);
}
