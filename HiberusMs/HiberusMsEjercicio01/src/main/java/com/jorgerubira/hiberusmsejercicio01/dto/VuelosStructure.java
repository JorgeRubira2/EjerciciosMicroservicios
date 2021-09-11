/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dto;


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
public class VuelosStructure {

    private String flightDate;
    private String flightStatus;

    public void setFlight_date(String val) {
        flightDate = val;
    }

    public void setFlight_status(String val) {
        flightStatus = val;
    }

    private AeropuertoStructure departure;
    private AeropuertoStructure arrival;
    private AerolineaStructure airline;
    private IdentVueloStructure flight;

}
