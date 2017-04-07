package com.mentha.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataLoader {

    private AppPortsService portsService;

    @Autowired
    public DataLoader(AppPortsService portsService) {
        this.portsService = portsService;
    }

//    @PostConstruct
//    public void loadSample(){
//
//        AppPorts portsOne = new AppPorts("cicafül");
//        log.info(portsOne.toString());
//        portsService.save(portsOne);
//    }

}
