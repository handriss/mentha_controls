package com.mentha.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="users")
@Slf4j
public class User {

    @Id
    @Column(name="user_id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    private User(){}

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }
}