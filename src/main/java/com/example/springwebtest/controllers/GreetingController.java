package com.example.springwebtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springwebtest.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService service;

    @GetMapping
    public String greeting(){
        return service.greet();
    }
    
}
