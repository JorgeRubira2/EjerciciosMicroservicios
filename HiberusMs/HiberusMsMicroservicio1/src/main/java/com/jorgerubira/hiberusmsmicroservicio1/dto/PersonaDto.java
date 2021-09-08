package com.jorgerubira.hiberusmsmicroservicio1.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDto  { 
    private Integer id;
    private String nombre;
    private String apellidos;   
    private List<TelefonoDto> telefonos; 
}
