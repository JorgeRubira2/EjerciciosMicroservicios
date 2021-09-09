/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.repositoy;

import com.jorgerubira.hiberusmsejercicio01.entity.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author janus
 */
public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer>{
    
}
