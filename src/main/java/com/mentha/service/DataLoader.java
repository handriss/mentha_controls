package com.mentha.service;


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

}
