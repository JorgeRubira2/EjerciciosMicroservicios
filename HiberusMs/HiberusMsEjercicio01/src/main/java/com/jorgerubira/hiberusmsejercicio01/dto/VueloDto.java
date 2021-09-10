/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dto;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author janus
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class Aeropuerto {

    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private String delay;
    private String scheduled;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Aerolinea {
    private String name;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class IdentVuelo {
    private String number;
    private String iata;
    private String icao;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Vuelo {

    private Aeropuerto departure;
    private Aeropuerto arrival;
    private Aerolinea airline;
    private IdentVuelo flight;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VueloDto {

    private List<Vuelo> data;

}
