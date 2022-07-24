package com.example.authorizationservert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/fill")
    public String supply(){
        return "great";
    }
}
