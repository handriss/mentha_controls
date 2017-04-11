package com.mentha.controller;

import com.mentha.repository.PortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bedroom")
public class BedRoomController {

    private PortsRepository portsRepository;

    @Autowired
    public BedRoomController(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    @RequestMapping(value = "/{deviceId}", method = RequestMethod.GET)
    public String readStates(@PathVariable(value = "deviceId") String deviceId){

        return "";
    }
}