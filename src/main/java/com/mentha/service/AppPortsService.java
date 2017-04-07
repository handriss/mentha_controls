package com.mentha.service;


import com.mentha.model.AppPorts;
import com.mentha.repository.AppPortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppPortsService {

    private AppPortsRepository portsRepository;

    @Autowired
    public AppPortsService(AppPortsRepository portsRepository) {
        this.portsRepository = portsRepository;
    }

    public void setName(Long id, String name){
        AppPorts ports = portsRepository.findOne(id);
        ports.setName(name);
    }

    public String getName(Long id){
        return portsRepository.findOne(id).getName();
    }

    public void save(AppPorts ports){
        portsRepository.save(ports);
    }
}
