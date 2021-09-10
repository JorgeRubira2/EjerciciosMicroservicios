package com.jorgerubira.hiberusmsejercicio01.service;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.AerolineaDto;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.AeropuertoDto;
import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.VueloDto;
import com.jorgerubira.hiberusmsejercicio01.feign.VuelosFeign;
import com.jorgerubira.hiberusmsejercicio01.interfaces.IVuelosService;
import com.jorgerubira.hiberusmsejercicio01.repository.AirlineRepository;
import com.jorgerubira.hiberusmsejercicio01.repository.AirportRepository;
import com.jorgerubira.hiberusmsejercicio01.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.jorgerubira.hiberusmsejercicio01.utils.Constants.*;

@Service
public class VuelosService implements IVuelosService {

    @Autowired
    VuelosFeign feign;

    @Autowired
    AirlineRepository airlineRepository;

    @Autowired
    AirportRepository airportRepository;

    @Autowired
    CountryRepository countryRepository;

    @Override
    public void importarMaestros() {
        List<AeropuertoDto> aeropuertos = feign.verAeropuertos(API_KEY, LIMIT).getData();
        aeropuertos = aeropuertos.stream()
                            .filter(x->x.getCountryIso2().equals(CODE_ISO2_ESPAÑA))
                            .collect(Collectors.toList());
        airportRepository.saveAll(aeropuertos);
        List<AerolineaDto> aerolineas = feign.verAerolineas(API_KEY, LIMIT).getData();
        aerolineas = aerolineas.stream()
                            .filter(x->x.getCountryIso2().equals(CODE_ISO2_ESPAÑA))
                            .collect(Collectors.toList());
        airlineRepository.saveAll(aerolineas);
    }

    @Override
    public List<VueloDto> verVuelosEspaña() {
        List<VueloDto> vuelos = feign.verVuelos(API_KEY).getData();
        List<String> codiogosIata = airportRepository.findAll()
                .stream()
                .map(x->x.getIataCode())
                .collect(Collectors.toList());
        vuelos = vuelos.stream()
                .filter(x-> codiogosIata.contains(x.getDeparture().getIata())
                        || codiogosIata.contains(x.getArrival().getIata()))
                .collect(Collectors.toList());
        return vuelos;
    }
}
