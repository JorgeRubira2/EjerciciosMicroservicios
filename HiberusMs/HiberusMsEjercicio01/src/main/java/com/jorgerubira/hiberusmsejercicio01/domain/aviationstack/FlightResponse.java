package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import java.util.List;

@Data
public class FlightResponse {
    private Pagination pagination;
    private List<Flight> data;
}
