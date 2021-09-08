package com.jorgerubira.hiberusmsmicroservicio1.repositories;

import com.jorgerubira.hiberusmsmicroservicio1.entities.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface TelefonoRepository extends JpaRepository<Telefono, Integer>{
    
}
