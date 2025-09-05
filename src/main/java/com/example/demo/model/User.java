package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

public class User extends BaseEntity {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }
}
