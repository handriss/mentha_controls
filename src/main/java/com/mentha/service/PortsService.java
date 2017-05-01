package com.mentha.service;

import com.mentha.model.Ports;
import com.mentha.model.enums.RoomTypeEnum;
import com.mentha.repository.PortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortsService {

    private PortsRepository portsRepository;

    @Autowired
    public PortsService(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    public void nullChangeFields(){
        List<Ports> ports = portsRepository.findByroomTypeIsNotNull();
        for(Ports port : ports){
            port.setRoomType(RoomTypeEnum.No_Room);
            portsRepository.save(port);
        }
    }
}
