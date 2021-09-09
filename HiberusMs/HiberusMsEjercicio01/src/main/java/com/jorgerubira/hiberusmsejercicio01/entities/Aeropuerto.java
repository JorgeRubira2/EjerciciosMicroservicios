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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Aeropuerto")
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String countryIso;
    public void setCountry_iso(String valor){
        countryIso=valor;
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
