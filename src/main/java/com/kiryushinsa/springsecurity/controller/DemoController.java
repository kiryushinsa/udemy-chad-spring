package com.kiryushinsa.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String showHome() {
        
        return "home";
    }
    
    // add reaquest mappint for leaders
    @GetMapping("/leaders")
    public String showLeaders() {
    
        return "leaders";
    }
    
    
    // add reaquest mappint for leaders
    @GetMapping("/systems")
    public String showSystems() {
        
        return "systems";
    }
    
}
