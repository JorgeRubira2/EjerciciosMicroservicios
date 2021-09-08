
package com.jorgerubira.hiberusmsejercicio01.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traducido {
    private String translatedText;
    private String error;
}
