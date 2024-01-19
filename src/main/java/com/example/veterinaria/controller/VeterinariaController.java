package com.example.veterinaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeterinariaController {


    @GetMapping("/hola")
    public String hola(){
        return "Hola";
    }
}
