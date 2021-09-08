package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Detectar;
import com.jorgerubira.hiberusmsejercicio01.domain.Idiomas;
import com.jorgerubira.hiberusmsejercicio01.domain.Texto;
import com.jorgerubira.hiberusmsejercicio01.domain.Traduccion;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "translate", url="https://libretranslate.de")
public interface IdiomasFeign {
    
    @GetMapping("/languages")
    public List<Idiomas> listaIdiomas();
    
    @PostMapping("/translate")
    public Texto traducir(Traduccion t);  
    @PostMapping("/detect")
    public Detectar[] detectar(Traduccion t);  
    
}
