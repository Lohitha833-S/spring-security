package com.example.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class welcomeController {
    @GetMapping
    public String welcome(){
        return "welcome to world";

    }
}