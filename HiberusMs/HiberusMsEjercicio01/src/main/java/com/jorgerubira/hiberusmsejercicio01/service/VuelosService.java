package com.jorgerubira.hiberusmsejercicio01.service;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.Airport;
import com.jorgerubira.hiberusmsejercicio01.interfaces.IVuelosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VuelosService implements IVuelosService {
    @Override
    public List<Airport> filtrarAeropuertos(List<Airport> lista) {
        return lista.stream()
                .filter(x->("ES").equals(x.getCountry_iso2()))
                .collect(Collectors.toList());
    }
}
