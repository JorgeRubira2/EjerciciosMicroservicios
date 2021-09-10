package com.jorgerubira.hiberusmsejercicio01.repository;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
