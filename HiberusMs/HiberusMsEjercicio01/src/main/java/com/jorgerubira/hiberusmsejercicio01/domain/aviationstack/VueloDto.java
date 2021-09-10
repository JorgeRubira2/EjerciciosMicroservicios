package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import java.util.Date;

@Data
public class VueloDto {

    private long id;
    private Date flightDate;
    private String flightStatus;
    private LocalizacionDto departure;
    private LocalizacionDto arrival;
    private DetalleVueloDto flight;

    public void setFlight_date(Date flight_date) {
        this.flightDate = flight_date;
    }

    public void setFlight_status(String flight_status) {
        this.flightStatus = flight_status;
    }

}
