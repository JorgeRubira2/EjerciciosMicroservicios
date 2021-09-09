package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

import java.util.List;

@Data
public class AirportResponse {
    private Pagination pagination;
    private List<Airport> data;
}
