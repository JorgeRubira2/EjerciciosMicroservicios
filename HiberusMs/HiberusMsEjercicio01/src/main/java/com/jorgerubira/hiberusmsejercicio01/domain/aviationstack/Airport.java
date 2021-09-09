package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

@Data
public class Airport {

    private String airport_name;
    private String iata_code;
    private String icao_code;
    private String country_name;
    private String country_iso2;
}
