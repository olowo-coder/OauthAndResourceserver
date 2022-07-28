package com.example.resourceservert.controller;

import com.example.resourceservert.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

    @PreAuthorize("hasAuthority('SCOPE_lion.read')")
    @GetMapping(name  = "from-resourse")
    public ResponseEntity<?> accessData(){
        return ResponseEntity.ok(ResponseDTO.builder().data("Successful").build());
    }
}
