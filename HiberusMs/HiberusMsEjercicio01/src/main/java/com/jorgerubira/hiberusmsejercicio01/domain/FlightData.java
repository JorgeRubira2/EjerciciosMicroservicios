/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jesus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightData {
    
    private Date flightDate;
    private String flightStatus; 
    private DepartureArrival departure;
    private DepartureArrival arrival;
    private Airline airline;
    private FlightDetails flight;
    
    private void setFlight_date(Date valor){
        flightDate=valor;
    }
    
    private void setFlight_status(String valor){
        flightStatus=valor;
    }
    
    
}
