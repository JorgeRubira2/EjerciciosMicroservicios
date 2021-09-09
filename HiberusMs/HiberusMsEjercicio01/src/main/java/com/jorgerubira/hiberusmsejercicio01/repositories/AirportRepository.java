/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.repositories;

import com.jorgerubira.hiberusmsejercicio01.entities.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author josit
 */
public interface AirportRepository extends JpaRepository<Aeropuerto, Integer> {
    
}
