/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportsDataDto {

    private Integer id;

    private Integer airport_id;
    private String geonameId;
    public void setGeoname_id(String valor){
        geonameId=valor;
    }
    private String iataCode;
    public void setIata_code(String valor){
        iataCode=valor;
    }
    private String cityIataCode;
    public void setCity_iata_code(String valor){
        cityIataCode=valor;
    }
    private String icaoCode;
    public void setIcao_code(String valor){
        icaoCode=valor;
    }
    private String countryIso2;
    public void setCountry_iso2(String valor){
        countryIso2=valor;
    }
    private String airportName;
    public void setAirport_name(String valor){
        airportName=valor;
    }
    private String countryName;
    public void setCountry_name(String valor){
        countryName=valor;
    }
}
