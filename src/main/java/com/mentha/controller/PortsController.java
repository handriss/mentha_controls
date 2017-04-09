package com.mentha.controller;


import com.mentha.model.Ports;
import com.mentha.repository.PortsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class PortsController {

    private PortsRepository portsRepository;

    @Autowired
    public PortsController(PortsRepository portsRepository) {
//        this.portsRepository = portsRepository;
        this.portsRepository = portsRepository;
    }

    @RequestMapping
    public String home(){
        return "index";
    }

    @RequestMapping( value = "data-row/{id}", method = RequestMethod.GET )
    public String listData(Model model, @PathVariable(value="id") long id){

        Ports ports = portsRepository.findOne(id);


        model.addAttribute("ports", ports);

        return "list-data";
    }

}
