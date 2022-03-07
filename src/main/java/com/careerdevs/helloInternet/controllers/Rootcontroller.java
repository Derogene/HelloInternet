package com.careerdevs.helloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rootcontroller {

    @GetMapping ("/")
    public String getRoot() {
        return "You are at the root of the application";
    }
}
