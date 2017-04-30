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
public class Ports {

    private String nev;
    private Double adat;
    private String miez;
    private String fajta;
    private String szoveg;

    @Id
    @GeneratedValue
    private Long id;
    private java.sql.Timestamp ido;
    private String icon0;
    private Long value1;
    private Long min1;
    private Long max1;
    private String icon1;
    private Long x1;
    private Long y1;
    private Long value2;
    private Long min2;
    private Long max2;
    private String icon2;
    private Long x2;
    private Long y2;
    private Long value3;
    private Long min3;
    private Long max3;
    private String icon3;
    private Long x3;
    private Long y3;

    private Boolean change;

    public Ports() {
        this.change = false;
    }
}
