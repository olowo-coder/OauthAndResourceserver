package com.example.resourceservert.controller;

import com.example.resourceservert.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping
    public ResponseEntity<?> accessData(){
        return ResponseEntity.ok(ResponseDTO.builder().data("Successful").build());
    }
}
