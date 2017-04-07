package com.mentha.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class AppPorts {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public AppPorts(){};

    public AppPorts(String name) {
        this.name = name;
    }
}
