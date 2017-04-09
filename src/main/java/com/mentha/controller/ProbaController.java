package com.mentha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProbaController {

    @RequestMapping(value = "/android-proba", method = RequestMethod.GET)
    public String greeting(){
        return "Műxik";
    }
}
