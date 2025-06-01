package com.icecreamparlour.icecream.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping // Maps GET requests to /health
    public ResponseEntity<String> checkHealth() {

        return new ResponseEntity<>("Healthy", HttpStatus.OK);
    }


}