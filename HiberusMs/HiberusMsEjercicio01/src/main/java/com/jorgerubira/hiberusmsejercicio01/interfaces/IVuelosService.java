package com.jorgerubira.hiberusmsejercicio01.interfaces;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.Airport;

import java.util.List;

public interface IVuelosService {
    public List<Airport> filtrarAeropuertos(List<Airport> lista);
}
