package com.mentha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping
    public ResponseEntity checkStatus(){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
