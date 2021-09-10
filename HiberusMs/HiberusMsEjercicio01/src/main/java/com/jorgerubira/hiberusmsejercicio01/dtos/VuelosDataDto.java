
package com.jorgerubira.hiberusmsejercicio01.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VuelosDataDto {
    private Date flightDate;
    public void setFlight_date(Date valor){
        flightDate=valor;
    }
    private String flightStatus;
    public void setFlight_status(String valor){
        flightStatus=valor;
    }
    private SalidaDto departure;
    private LlegadaDto arrival;
}
