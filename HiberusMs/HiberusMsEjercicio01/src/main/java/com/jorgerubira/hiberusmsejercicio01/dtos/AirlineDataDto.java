/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineDataDto {
    
    private Integer id;
    
    private Integer airlineId;
    public void setAirline_id(Integer valor){
        airlineId=valor;
    }
    private String callsign;

    private String hubCode;
    public void setHub_code(String valor){
        hubCode=valor;
    }
    private String iataCode;
    public void setIata_code(String valor){
        iataCode=valor;
    }
    private String icaoCode;
    public void setIcao_code(String valor){
        icaoCode=valor;
    }
    private String countryIso2;
    public void setCountry_iso2(String valor){
        countryIso2=valor;
    }
    private String airlineName;
    public void setAirline_name(String valor){
        airlineName=valor;
    }
    private String countryName;
    public void setCountry_name(String valor){
        countryName=valor;
    }
}
