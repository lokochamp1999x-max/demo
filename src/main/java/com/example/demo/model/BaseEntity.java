package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
    }
}
