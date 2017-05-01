package com.mentha.service;

import com.mentha.model.Ports;
import com.mentha.model.TransferObject;
import com.mentha.model.enums.RoomTypeEnum;
import com.mentha.repository.PortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<TransferObject> convertPortsToTransferObject(List<Ports> portses){
        List<TransferObject> transferObjects = new ArrayList<>();

        for(Ports port : portses){

            TransferObject transferObject = new TransferObject();
            transferObject.setName(port.getNev());

            Boolean status = Objects.equals(port.getAdat(), port.getOnValue());
            transferObject.setWidgetStatus(status);

            transferObject.setRoomTypeEnum(port.getRoomType());

            transferObjects.add(transferObject);
        }

        return transferObjects;
    }
}
