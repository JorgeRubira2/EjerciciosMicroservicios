/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  janus
 * Created: 9 sept. 2021
 */

create table reservas (
   
    id int primary key AUTO_INCREMENT,
    
    id_vuelo Varchar(50),
    
    cantidad int,

    airport_dep Varchar(100),
    timezone_dep Varchar(100),
    iata_dep Varchar(100),
    icao_dep Varchar(100),
    terminal_dep Varchar(100),
    gate_dep Varchar(100),
    delay_dep Varchar(100),
    scheduled_dep Varchar(100),
    
    airport_arr Varchar(100),
    timezone_arr Varchar(100),
    iata_arr Varchar(100),
    icao_arr Varchar(100),
    terminal_arr Varchar(100),
    gate_arr Varchar(100),
    delay_arr Varchar(100),
    scheduled_arr Varchar(100)
);

create table aeropuertos(
 id int primary key AUTO_INCREMENT,
    airport_name Varchar(100),
    iata_code Varchar(100),
    icao_code Varchar(100),
    latitude Varchar(100),
    longitude  Varchar(100),
    geoname_id  Varchar(100),
    phone_number Varchar(100),
    country_name  Varchar(100),
    country_iso2  Varchar(100),
    city_iata_code  Varchar(100)

);


create table aerolineas(
    id int primary key AUTO_INCREMENT,
    airline_name Varchar(100),
    iata_code Varchar(100),
    icao_code Varchar(100),
    country_name Varchar(100),
    country_iso2 Varchar(100) 
    );