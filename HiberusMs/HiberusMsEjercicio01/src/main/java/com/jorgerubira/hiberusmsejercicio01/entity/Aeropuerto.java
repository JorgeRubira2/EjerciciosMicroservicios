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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aeropuertos")
public class Aeropuerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String airportName;
    private String iataCode;
    private String icaoCode;
    private String latitude;
    private String longitude;
    private String geonameId;
    private String phoneNumber;
    private String countryName;
    private String countryIso2;
    private String cityIataCode;

    public void setAirport_name(String val) {
        airportName = val;
    }

    public void setIata_code(String val) {
        iataCode = val;
    }

    public void setIcao_code(String val) {
        icaoCode = val;
    }

    public void setGeoname_id(String val) {
        geonameId = val;
    }

    public void setPhone_number(String val) {
        phoneNumber = val;
    }

    public void setCountry_name(String val) {
        countryName = val;
    }

    public void setCountry_iso2(String val) {
        countryIso2 = val;
    }

    public void setCity_iata_code(String val) {
        cityIataCode = val;
    }

}
