package com.kiryushin.springboot.teachapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String helloWorldMethod() {

        return "Hello World. Time on server is " + LocalDateTime.now();
    }
}
