
package com.jorgerubira.hiberusmsejercicio01.dtos;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VuelosDto {
    private List<VuelosDataDto> data;
}