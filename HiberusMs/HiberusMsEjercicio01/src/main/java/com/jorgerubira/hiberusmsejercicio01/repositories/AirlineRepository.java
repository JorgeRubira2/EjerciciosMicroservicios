
package com.jorgerubira.hiberusmsejercicio01.repositories;

import com.jorgerubira.hiberusmsejercicio01.entities.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Aerolinea, Integer> {
    
}
