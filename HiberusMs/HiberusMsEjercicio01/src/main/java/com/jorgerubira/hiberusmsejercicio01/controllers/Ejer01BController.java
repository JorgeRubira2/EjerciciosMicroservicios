
package com.jorgerubira.hiberusmsejercicio01.controllers;

import com.jorgerubira.hiberusmsejercicio01.dtos.AirlineDto;
import com.jorgerubira.hiberusmsejercicio01.dtos.AirportsDto;
import com.jorgerubira.hiberusmsejercicio01.dtos.VuelosDto;
import com.jorgerubira.hiberusmsejercicio01.entities.Aerolinea;
import com.jorgerubira.hiberusmsejercicio01.entities.Aeropuerto;
import com.jorgerubira.hiberusmsejercicio01.feign.AirportsFeign;
import com.jorgerubira.hiberusmsejercicio01.repositories.AirlineRepository;
import com.jorgerubira.hiberusmsejercicio01.repositories.AirportRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ejercicio01b")
public class Ejer01BController {
    
    private final String APIKEY = "2573fdb7973e63abcf701430bdd7f1a9";
    
    @Autowired
    private AirportsFeign airports;
    @Autowired
    private AirportRepository repoPorts;
    @Autowired
    private AirlineRepository repoAir;
    @Autowired
    private ModelMapper obj;
    
    @GetMapping
    public String inicio(Model m,String msg){
        if(msg!=null){
            m.addAttribute("importado",msg);    
        }
        List<Aeropuerto> ports = repoPorts.findAll();
        List<Aerolinea> lineas = repoAir.findAll();
        if(!ports.isEmpty() && !lineas.isEmpty()){
            m.addAttribute("ports", ports);
            m.addAttribute("lineas", lineas);
            m.addAttribute("haydatos","existen");
        }else{
            m.addAttribute("error","Error al cargar aeropuertos o aerolineas");
        }
        
        return "/ej01b/vista";
    }
    @GetMapping("/guardarDatos")
    public String importar(Model m){
        
        AirportsDto ports = airports.leerAeropuertos(APIKEY, 9999);                 //Funciona bien e inserta en base de datos, comento para quitar llamadas mientras sigo con pruebas
        List<Aeropuerto> puerto = ports.getData().stream()
                        .filter(x->"Spain".equalsIgnoreCase(x.getCountryName()))
                        .map(x->obj.map(x, Aeropuerto.class))
                        .collect(Collectors.toList());
        repoPorts.saveAll(puerto);  
        AirlineDto lines = airports.leerAerolineas(APIKEY, 9999);
        List<Aerolinea> aLineas = lines.getData().stream()
                        .filter(x->"Spain".equalsIgnoreCase(x.getCountryName()))
                        .map(x->obj.map(x, Aerolinea.class))
                        .collect(Collectors.toList());
        repoAir.saveAll(aLineas);
        
        String msg = "Datos importados con exito";
        return inicio(m,msg);
    }
    
    @PostMapping("/filtrar") //@DateTimeFormat(pattern = "yyyy-MM-dd")
    @ResponseBody
    public VuelosDto filtrar(String ae, String pt){
        VuelosDto vuelos = new VuelosDto();
        if(ae!=null){
            if(pt!=null){
                //vuelos = airports.leerVuelos(APIKEY, 999, pt, ae);
                //vuelos.getData();
            }else{
                
            }      
        }else if(pt!=null){
            
        }
        return vuelos;
    }
}
