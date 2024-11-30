package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ficha")
public class FichaController {

    @GetMapping
    public String helloWorld()
    {
        return "Oi";
    }
}
