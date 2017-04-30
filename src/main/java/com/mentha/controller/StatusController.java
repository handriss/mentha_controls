package com.mentha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping
    public String checkStatus(){

//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        return "cool";
    }
}
