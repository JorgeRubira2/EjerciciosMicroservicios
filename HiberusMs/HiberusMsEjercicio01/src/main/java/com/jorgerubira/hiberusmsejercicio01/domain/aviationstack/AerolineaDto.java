package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aerolineas")
public class AerolineaDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String airlineName;
    private String iataCode;
    private String countryIso2;
    private String countryName;

    public void setAirline_name(String airline_name) {
        this.airlineName = airline_name;
    }

    public void setIata_code(String iata_code){this.iataCode = iata_code;}

    public void setCountry_iso2(String country_iso2) {
        this.countryIso2 = country_iso2;
    }

    public void setCountry_name(String country_name) {
        this.countryName = country_name;
    }
}
