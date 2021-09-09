/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author janus
 */
@Entity
@Table(name="reservas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    private String id_vuelo;
    
    private String airportDep;
    private String timezoneDep;
    private String iataDep;
    private String icaoDep;
    private String terminalDep;
    private String gateDep;
    private String delayDep;
    private String scheduledDep;
    
    private String airportArr;
    private String timezoneArr;
    private String iataArr;
    private String icaoArr;
    private String terminalArr;
    private String gateArr;
    private String delayArr;
    private String scheduledArr;
}
