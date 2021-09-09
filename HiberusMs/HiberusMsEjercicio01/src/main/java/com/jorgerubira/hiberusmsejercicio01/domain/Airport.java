/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.domain;

import com.jorgerubira.hiberusmsejercicio01.entities.AirportData;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jesus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
    private List<AirportData> data;
}
