package com.mentha.service;


import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DataLoader {

    private PortsRepository portsRepository;

    @Autowired
    public DataLoader(PortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }


    @PostConstruct
    public void loadPortsSample(){
//        Ports ports = new Ports();
//        portsRepository.save(ports);
    }

}
