package com.mentha.service;


import com.mentha.model.Ports;
import com.mentha.model.User;
import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DataLoader {

    private UserService userService;
    private PortsRepository portsRepository;

    @Autowired
    public DataLoader(UserService userService, PortsRepository portsRepository) {
        this.userService = userService;
        this.portsRepository = portsRepository;
    }

    @PostConstruct
    public void loadSampleUser(){

        User user = new User("admin@admin.com",  "admin");

        userService.save(user);
    }

    @PostConstruct
    public void loadPortsSample(){
        Ports ports = new Ports();
        portsRepository.save(ports);

    }

}
