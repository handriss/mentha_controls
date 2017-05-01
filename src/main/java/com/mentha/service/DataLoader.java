package com.mentha.service;


import com.mentha.model.Ports;
import com.mentha.model.enums.RoomTypeEnum;
import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DataLoader {

    @Value("${profileName}")
    private String profileName;

    private PortsRepository portsRepository;

    @Autowired
    public DataLoader(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    @PostConstruct
    public void printProfileInfo(){
        log.info("Currently active profile: " + profileName);
    }

    @PostConstruct
    public void setRoomTypesAndMinAndMaxValues(){
//        + a nyitásérzékelők

//        LivingRoom values
        setOnePorts("p_oli_kulso", RoomTypeEnum.LivingRoom, 0.0d, 1.0d);
        setOnePorts("p_oli_k3", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k1", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k5", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k6", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_17", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_18", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_19", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k3b", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k4", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k2b", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_k2", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_14", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_11", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_12", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_13", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_15", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_1", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_2", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_3", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_4", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_5", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_6", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_7", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_10", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_ve3", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);
        setOnePorts("p_oli_40", RoomTypeEnum.LivingRoom, 0.0d, 80.0d);

        log.info(portsRepository.findByroomTypeIsNotNull().toString());

    }

    private void setOnePorts(String portsName, RoomTypeEnum roomTypeEnum, Double min, Double max){
        Ports ports = portsRepository.findBynev(portsName);
        ports.setPriorData(roomTypeEnum, min, max);
        portsRepository.save(ports);
    }

}
