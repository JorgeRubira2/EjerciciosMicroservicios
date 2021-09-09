package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import java.util.Date;

@Data
public class Flight {
    private Date flight_date;
    private String flight_status;
    private Location departure;
    private Location arrival;
}
