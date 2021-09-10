package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aeropuertos")
public class AeropuertoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String airportName;
    private String iataCode;
    private String icaoCode;
    private String countryName;
    private String countryIso2;

    public void setAirport_name(String airport_name) {
        this.airportName = airport_name;
    }

    public void setIata_code(String iata_code) {
        this.iataCode = iata_code;
    }

    public void setIcao_code(String icao_code) {
        this.icaoCode = icao_code;
    }

    public void setCountry_name(String country_name) {
        this.countryName = country_name;
    }

    public void setCountry_iso2(String country_iso2) {
        this.countryIso2 = country_iso2;
    }
}
