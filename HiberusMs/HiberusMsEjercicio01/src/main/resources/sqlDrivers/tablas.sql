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

    airportDep Varchar(100),
    timezoneDep Varchar(100),
    iataDep Varchar(100),
    icaoDep Varchar(100),
    terminalDep Varchar(100),
    gateDep Varchar(100),
    delayDep Varchar(100),
    scheduledDep Varchar(100),
    
    airportArr Varchar(100),
    timezoneArr Varchar(100),
    iataArr Varchar(100),
    icaoArr Varchar(100),
    terminalArr Varchar(100),
    gateArr Varchar(100),
    delayArr Varchar(100),
    scheduledArr Varchar(100)
);

create table aeropuertos(
 id int primary key AUTO_INCREMENT,
    airportName Varchar(100),
    iataCode Varchar(100),
    icaoCode Varchar(100),
    latitude Varchar(100),
    longitude  Varchar(100),
    geonameId  Varchar(100),
    phoneNumber Varchar(100),
    countryName  Varchar(100),
    countryIso2  Varchar(100),
    cityIataCode  Varchar(100)

);


create table aerolineas(
    id int primary key AUTO_INCREMENT,
    airlineName Varchar(100),
    iataCode Varchar(100),
    icaoCode Varchar(100),
    countryName Varchar(100),
    countryIso2 Varchar(100) 
    );