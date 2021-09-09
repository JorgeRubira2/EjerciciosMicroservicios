/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio2.dtos;

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

    private String fleet_average_age;

    //private String fleetAverageAge; 
    
    /*public void setFleet_average_age(String valor){
        fleetAverageAge=valor;
    }*/
    
    private String iataCode;
    public void setIata_code(String valor){
        iataCode=valor;
    }
    
    private String hub_code;
    
    private String countryName;
    public void setCountry_name(String valor){
        countryName=valor;
    }
    
    /*private String nombrePais;
    public void setCountry_name(String valor){
        nombrePais=valor;
    }*/

    //fleet_average_age
    
    //private String iataCode; //iata_code
}
