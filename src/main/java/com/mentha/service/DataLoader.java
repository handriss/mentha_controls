package com.mentha.service;


import com.mentha.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DataLoader {

    private UserService userService;

    @Autowired
    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void loadSample(){

        User user = new User("admin@admin.com",  "admin");

        userService.save(user);
    }

}
