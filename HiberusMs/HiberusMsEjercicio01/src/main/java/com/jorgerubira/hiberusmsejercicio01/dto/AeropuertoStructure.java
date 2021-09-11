/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author janus
 */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class AeropuertoStructure {

        private String airport;
        private String timezone;
        private String iata;
        private String icao;
        private String terminal;
        private String gate;
        private String delay;
        private String scheduled;
    }