
package com.jorgerubira.hiberusmsejercicio01.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LlegadaDto {
    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private String baggage;
    private Integer delay;
    private Date scheduled;
    private Date estimated;
    private Date actual;
    private Date estimatedRunway;
    public void setEstimated_runway(Date valor){
        estimatedRunway=valor;
    }
    private Date actualRunway;
    public void setActual_runway(Date valor){
        actualRunway=valor;
    }
}
