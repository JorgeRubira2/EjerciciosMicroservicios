/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.entity;

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
public class Aerolinea {
    private String airline_name;
    private String iata_code;
    private String iata_prefix_accounting;
    private String icao_code;
    private String callsign;
    private String type;
    private String status;
    private String fleet_size;
    private String fleet_average_age;
    private String date_founded;
    private String hub_code;
    private String country_name;
    private String country_iso2;
}
