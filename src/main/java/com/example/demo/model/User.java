package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    @OneToMany(mappedBy = "assignedUser")
    private List<Task> tasks;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }
}
