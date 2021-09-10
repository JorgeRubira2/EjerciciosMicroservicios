/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.entity;

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
 * @author janus
 */


/*
        "airline_name": "American Airlines",
         "iata_code": "AA",
         "iata_prefix_accounting": "1",
         "icao_code": "AAL",
         "callsign": "AMERICAN",
         "type": "scheduled",
         "status": "active",
         "fleet_size": "963",
         "fleet_average_age": "10.9",
         "date_founded": "1934",
         "hub_code": "DFW",
         "country_name": "United States",
         "country_iso2": "US"

*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="aerolineas")
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String airlineName;
    private String iataCode;
    private String icaoCode;
    private String countryName;
    private String countryIso2;
    
    public void setAirline_name(String val){
        airlineName = val;
    }
    
    public void setIata_code(String val){
        iataCode = val;
    }

    public void setIcao_code(String val){
        icaoCode = val;
    }
    
    public void setCountry_name(String val){
        countryName = val;
    }
    
    public void setCountry_iso2(String val){
        countryIso2 = val;
    }
    
        
}
