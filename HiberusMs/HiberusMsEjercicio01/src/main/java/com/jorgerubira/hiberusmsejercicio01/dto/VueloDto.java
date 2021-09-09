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

class Aerolinea {

    private String name;
}

class Vuelo {

    private List<Aeropuerto> departure;
    private List<Aeropuerto> arrival;
    private List<Aerolinea> airline;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VueloDto {

    private List<Vuelo> data;

}
