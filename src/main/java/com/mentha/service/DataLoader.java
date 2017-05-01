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

//        Bedroom values
        setOnePorts("p_oli_24", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_k2b", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_25", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_26a", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_26b", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_k9", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_k8", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_27", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("fh_zsmk3", RoomTypeEnum.Bedroom, 0.0d, 1.0d);
        setOnePorts("ff_zsmk1", RoomTypeEnum.Bedroom, 0.0d, 1.0d);
        setOnePorts("p_oli_30", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_29", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_32", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_33", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_34", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_od_tsz1", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_31", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_ve1", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("fgyf_zsmk1", RoomTypeEnum.Bedroom, 0.0d, 1.0d);
        setOnePorts("p_oli_39", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_22", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_38", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_21", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_23", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_37", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_od_tsz2", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_36", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_oli_35", RoomTypeEnum.Bedroom, 0.0d, 80.0d);
        setOnePorts("p_ve2", RoomTypeEnum.Bedroom, 0.0d, 80.0d);

        //        Upstairs values
        setOnePorts("p_oli_101", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_102", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_103", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_104", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_105", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_108", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_109", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_k101", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_k101b", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_k102", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_110", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_112", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("p_oli_113", RoomTypeEnum.Upstairs, 0.0d, 80.0d);
        setOnePorts("ev_zsmk1", RoomTypeEnum.Upstairs, 0.0d, 1.0d);
        setOnePorts("ev_zsmk2", RoomTypeEnum.Upstairs, 0.0d, 1.0d);
        setOnePorts("evf_zsmk1", RoomTypeEnum.Upstairs, 0.0d, 1.0d);
        setOnePorts("ed_zsmk1", RoomTypeEnum.Upstairs, 0.0d, 1.0d);
        setOnePorts("p_od_tsz3", RoomTypeEnum.Upstairs, 0.0d, 1.0d);


        //        Garage values
        setOnePorts("p_oli_k7", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_k7b", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_k11", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_k12", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_7", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_8", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_10", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_41", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_40", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_42", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_43", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_44", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_45", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_oli_46", RoomTypeEnum.Garage, 0.0d, 80.0d);
        setOnePorts("p_ve3", RoomTypeEnum.Garage, 0.0d, 80.0d);

    }

    private void setOnePorts(String portsName, RoomTypeEnum roomTypeEnum, Double min, Double max){
        Ports ports = portsRepository.findBynev(portsName);
        ports.setPriorData(roomTypeEnum, min, max);
        portsRepository.save(ports);
    }

}
