package com.mentha.controller;

import com.mentha.service.PortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    private PortsService portsService;

    @Autowired
    public StatusController(PortsService portsService) {
        this.portsService = portsService;
    }

    @GetMapping
    public ResponseEntity checkStatus(){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping(value = "/nullChangeFields")
    public String nullChangeFields(){

        portsService.nullChangeFields();

        return "All change fields has been set to 0.";
    }
}
