package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "paises")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String countryName;
    private String countryIso2;

    public void setCountry_name(String country_name) {
        this.countryName = country_name;
    }

    public void setCountry_iso2(String country_iso2) {
        this.countryIso2 = country_iso2;
    }
}
