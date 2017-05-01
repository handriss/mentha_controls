package com.mentha.controller;

import com.mentha.model.Ports;
import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("/widget")
public class WidgetController {

    private PortsRepository portsRepository;

    @Autowired
    public WidgetController(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    @GetMapping(value = "/{deviceId}")
    public Ports readStates(@PathVariable(value = "deviceId") String deviceId){

        Ports ports = portsRepository.findBynev(deviceId);

        return ports;
    }

    @PostMapping(value = "/{deviceId}/{value}")
    public String writeStates(@PathVariable(value = "deviceId") String deviceId, @PathVariable(value = "value") String value){

        Ports ports = portsRepository.findBynev(deviceId);

        if(Objects.equals(value, "ON")){
            ports.setAdat(ports.getOnValue());
        }else if(Objects.equals(value, "OFF")){
            ports.setAdat(ports.getOffValue());
        }

        ports.setChange1(true);

        portsRepository.save(ports);

        return "Successfully changed the value";

    }

    @GetMapping(value = "/getBulkdata")
    public List<Ports> getBulkData(){

        return portsRepository.findByroomTypeIsNotNull();
    }

}