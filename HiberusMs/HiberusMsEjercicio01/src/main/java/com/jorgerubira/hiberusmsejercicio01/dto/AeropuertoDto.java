/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dto;

import com.jorgerubira.hiberusmsejercicio01.entity.Aeropuerto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author janus
 */

/*
        "airport_name": "Anaa",
         "iata_code": "AAA",
         "icao_code": "NTGA",
         "latitude": "-17.05",
         "longitude": "-145.41667",
         "geoname_id": "6947726",
         "timezone": "Pacific/Tahiti",
         "gmt": "-10",
         "phone_number": null,
         "country_name": "French Polynesia",
         "country_iso2": "PF",
         "city_iata_code": "AAA"
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AeropuertoDto {
    //private PaginacionDto paginacion;
    private List<Aeropuerto> data;
}
