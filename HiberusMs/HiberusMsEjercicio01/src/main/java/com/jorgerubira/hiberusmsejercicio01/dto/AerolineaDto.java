/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsejercicio01.dto;

import com.jorgerubira.hiberusmsejercicio01.entity.Aerolinea;
import java.util.List;
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

public class AerolineaDto {
   // private PaginacionDto paginacion;
    private List<Aerolinea> data;
}
