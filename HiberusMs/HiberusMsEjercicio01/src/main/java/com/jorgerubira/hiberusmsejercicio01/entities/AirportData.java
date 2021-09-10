/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.entities;

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
@Entity
@Table(name="airpor_data")
public class AirportData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    private String airportName;
    private String iataCode;
    private String icaoCode;
    private String countryName;
    private String countryIso2;
    private String cityIataCode;
    
    public void setAirport_name(String valor){
        airportName=valor;
    }
    
    public void setIata_code(String valor){
        iataCode=valor;
    }
    
    public void setIcao_code(String valor){
        icaoCode=valor;
    }
    
    public void setCountry_name(String valor){
        countryName=valor;
    }
    
    public void setCountry_iso2(String valor){
        countryIso2=valor;
    }
    
    public void setCity_iata_code(String valor){
        cityIataCode=valor;
    }
    
    
    
}
