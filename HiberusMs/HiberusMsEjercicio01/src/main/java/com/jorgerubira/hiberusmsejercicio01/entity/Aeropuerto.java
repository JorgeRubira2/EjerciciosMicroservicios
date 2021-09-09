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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aeropuerto {
         private String airport_name;
         private String iata_code;
         private String icao_code;
         private String latitude;
         private String longitude;
         private String geoname_id;
         private String timezone;
         private String gmt;
         private String phone_number;
         private String country_name;
         private String country_iso2;
         private String city_iata_code;
}
