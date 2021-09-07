package com.jorgerubira.hiberusmsejercicio01.feign;

import com.jorgerubira.hiberusmsejercicio01.domain.Idiomas;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "translate", url="https://libretranslate.de")
public interface IdiomasFeign {
    
    @GetMapping("/languages")
    public List<Idiomas> listaIdiomas();
    
}
