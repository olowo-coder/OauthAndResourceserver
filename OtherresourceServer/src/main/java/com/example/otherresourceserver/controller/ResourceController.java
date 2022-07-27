package com.example.otherresourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/data")
public class ResourceController {

    @GetMapping
    public ResponseEntity<?> accessData(){
        return ResponseEntity.ok(Map.of("ResoureTwo", "Success"));
    }
}
