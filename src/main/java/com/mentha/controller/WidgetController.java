package com.mentha.controller;

import com.mentha.model.Ports;
import com.mentha.model.TransferObject;
import com.mentha.repository.PortsRepository;
import com.mentha.service.PortsService;
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
    private PortsService portsService;

    @Autowired
    public WidgetController(PortsRepository portsRepository, PortsService portsService) {
        this.portsRepository = portsRepository;
        this.portsService = portsService;
    }

    @GetMapping(value = "/{deviceId}")
    public TransferObject readStates(@PathVariable(value = "deviceId") String deviceId){

        Ports ports = portsRepository.findBynev(deviceId);
        TransferObject resultObject = portsService.convertPortsToTransferObject(ports);

        return resultObject;
    }

    @PostMapping(value = "/{deviceId}/{value}")
    public String writeStates(@PathVariable(value = "deviceId") String deviceId, @PathVariable(value = "value") String value){

        Ports ports = portsRepository.findBynev(deviceId);

        if(Objects.equals(value, "ON")){
            ports.setAdat(ports.getOnValue());
        }else if(Objects.equals(value, "OFF")){
            ports.setAdat(ports.getOffValue());
        }else{
            return "Please specify ON or OFF as an argument.";
        }

        ports.setChange1(true);

        portsRepository.save(ports);

        return "Successfully changed the value";

    }

    @GetMapping(value = "/getBulkdata")
    public List<TransferObject> getBulkData(){

        return portsService.convertPortsToTransferObject(portsRepository.findByroomTypeIsNotNull());

    }

}