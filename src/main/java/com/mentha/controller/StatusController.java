package com.mentha.controller;

import com.mentha.repository.PortsRepository;
import com.mentha.service.PortsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/status")
public class StatusController {

    private PortsRepository portsRepository;
    private PortsService portsService;

    @Autowired
    public StatusController(PortsRepository portsRepository, PortsService portsService) {
        this.portsRepository = portsRepository;
        this.portsService = portsService;
    }

}
