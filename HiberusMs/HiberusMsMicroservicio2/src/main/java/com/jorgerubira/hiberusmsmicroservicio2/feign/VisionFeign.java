package com.jorgerubira.hiberusmsmicroservicio2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "vision", url="https://api.openvisionapi.com")
@RequestMapping("/api/v1")
public interface VisionFeign {
    
    //@PostMapping("/detection")
    
}
