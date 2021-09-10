package com.jorgerubira.hiberusmsejercicio01.repository;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.AeropuertoDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<AeropuertoDto, Long> {
}
