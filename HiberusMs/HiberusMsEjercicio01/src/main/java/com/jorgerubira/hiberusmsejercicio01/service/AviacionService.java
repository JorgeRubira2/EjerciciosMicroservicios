/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.service;

import com.jorgerubira.hiberusmsejercicio01.dto.AerolineaDto;
import com.jorgerubira.hiberusmsejercicio01.dto.AeropuertoDto;
import com.jorgerubira.hiberusmsejercicio01.dto.VueloDto;
import com.jorgerubira.hiberusmsejercicio01.entity.Aerolinea;
import com.jorgerubira.hiberusmsejercicio01.entity.Aeropuerto;
import com.jorgerubira.hiberusmsejercicio01.entity.Reserva;
import com.jorgerubira.hiberusmsejercicio01.domain.Vuelo;
import com.jorgerubira.hiberusmsejercicio01.feign.AviacionFeign;
import com.jorgerubira.hiberusmsejercicio01.repositoy.AerolineaRepository;
import com.jorgerubira.hiberusmsejercicio01.repositoy.AeropuertoRepository;
import com.jorgerubira.hiberusmsejercicio01.repositoy.ReservaRepository;
import com.jorgerubira.hiberusmsejercicio01.repositoy.VueloRepository;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janus
 */
@Service
public class AviacionService {
    
    private static Integer LIMITE = 99999;
    
    @Autowired 
    private AerolineaRepository repoAerolinea;
    
    @Autowired
    private AeropuertoRepository repoAeropuerto;
    
    @Autowired
    private VueloRepository repoVuelo;
    
    @Autowired
    private ReservaRepository repoReserva;
    
    @Autowired
    private AviacionFeign feignAviacion;
    
    @Autowired
    private ModelMapper mapeador;
    
    public List<Aerolinea> consultaAerolineas(){
        return repoAerolinea.findAll();
    }
    public List<Aeropuerto> consultaAeropuertos(){
        return repoAeropuerto.findAll();
    }
        
    public List<Reserva> consultaReservas(){
        return repoReserva.findAll();
    }
    
    public void cargarDatosAero(){
        // mapear a BBDD 
        List<AerolineaDto> aerolineas = feignAviacion.leerAerolineas(LIMITE);
        aerolineas.parallelStream()
                .map(x-> mapeador.map(x,Aerolinea.class))
                .forEach(x-> repoAerolinea.save(x));
                
        List<AeropuertoDto> aeropuertos = feignAviacion.leerAeropuertos(LIMITE);
        aeropuertos.parallelStream()
                .map(x-> mapeador.map(x,Aeropuerto.class))
                .forEach(x-> repoAeropuerto.save(x));
    }
    

    public List<Vuelo> consultaVuelos(String flightDate, String airlineName,String depIcao){
        List<VueloDto> vuelos = feignAviacion.leerVuelos(LIMITE, flightDate, airlineName, depIcao);
        return vuelos.parallelStream()
                        .map(x-> mapeador.map(x, Vuelo.class))
                        .collect(Collectors.toList());
    }
}
