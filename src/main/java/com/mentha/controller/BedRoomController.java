package com.mentha.controller;

import com.mentha.model.Ports;
import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/bedroom")
public class BedRoomController {

    private PortsRepository portsRepository;

    @Autowired
    public BedRoomController(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    @GetMapping(value = "/{deviceId}")
    public Ports readStates(@PathVariable(value = "deviceId") String deviceId){

        Ports ports = portsRepository.findBynev(deviceId);

        return ports;
    }

    @PostMapping(value = "/{deviceId}/{value}")
    public String writeStates(@PathVariable(value = "deviceId") String deviceId, @PathVariable(value = "value") Double value){

        Ports ports = portsRepository.findBynev(deviceId);
        ports.setAdat(value);
        portsRepository.save(ports);

        return "Successfully changed the value";

    }

}