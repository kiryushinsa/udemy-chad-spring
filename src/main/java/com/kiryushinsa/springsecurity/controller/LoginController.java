package com.kiryushinsa.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    //url from DemoSecurityConfig.configure .loginPage ;
    @GetMapping("/loginPage")
    public String showLoginPage() {
        
        return "bootstrap-login-form";
    }
    
}
