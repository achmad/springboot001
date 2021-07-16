package com.example.springboot001.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class App001Rest {

    @Value("${coach.name}")
    private String name;

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi "+name+" Now "+ LocalDateTime.now();
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Helloo "+name+" Now "+ LocalDateTime.now();
    }

}
