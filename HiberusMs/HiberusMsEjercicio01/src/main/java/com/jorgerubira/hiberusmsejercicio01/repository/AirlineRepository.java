package com.jorgerubira.hiberusmsejercicio01.repository;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.AerolineaDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<AerolineaDto, Long> {
}
