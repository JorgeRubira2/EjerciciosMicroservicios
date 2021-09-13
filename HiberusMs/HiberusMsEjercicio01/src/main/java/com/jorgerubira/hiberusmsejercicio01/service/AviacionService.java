/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.service;

import com.jorgerubira.hiberusmsejercicio01.dto.AerolineaDto;
import com.jorgerubira.hiberusmsejercicio01.dto.AeropuertoDto;
import com.jorgerubira.hiberusmsejercicio01.dto.VueloDto;
import com.jorgerubira.hiberusmsejercicio01.dto.VuelosStructure;
import com.jorgerubira.hiberusmsejercicio01.entity.Aerolinea;
import com.jorgerubira.hiberusmsejercicio01.entity.Aeropuerto;
import com.jorgerubira.hiberusmsejercicio01.entity.Reserva;
import com.jorgerubira.hiberusmsejercicio01.feign.AviacionFeign;
import com.jorgerubira.hiberusmsejercicio01.repositoy.AerolineaRepository;
import com.jorgerubira.hiberusmsejercicio01.repositoy.AeropuertoRepository;
import com.jorgerubira.hiberusmsejercicio01.repositoy.ReservaRepository;
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
    
    private static String TOKEN="2573fdb7973e63abcf701430bdd7f1a9";
    
    private static String ISOESPANYA = "ES";
    
    @Autowired 
    private AerolineaRepository repoAerolinea;
    
    @Autowired
    private AeropuertoRepository repoAeropuerto;
    
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
        
        AerolineaDto aerolineas = feignAviacion.leerAerolineas(TOKEN,LIMITE);
        repoAerolinea.deleteAll();
        aerolineas.getData().parallelStream()
                .map(x-> mapeador.map(x,Aerolinea.class))
                .filter(x->ISOESPANYA.equals(x.getCountryIso2()))
                .forEach(x-> repoAerolinea.save(x));
                
        AeropuertoDto aeropuertos = feignAviacion.leerAeropuertos(TOKEN,LIMITE);
        repoAeropuerto.deleteAll();
        aeropuertos.getData().parallelStream()
                .map(x-> mapeador.map(x,Aeropuerto.class))
                .filter(x-> ISOESPANYA.equals(x.getCountryIso2()) )
                .forEach(x-> repoAeropuerto.save(x));
    }
    

    public List<VuelosStructure> consultaVuelos(String flightDate, String airlineName, String depIcao){
        VueloDto vuelos = feignAviacion.leerVuelos(TOKEN,LIMITE, flightDate, airlineName, depIcao);
        return vuelos.getData().parallelStream()
                        .map(x-> mapeador.map(x, VuelosStructure.class))
                        .collect(Collectors.toList());
    }
}
