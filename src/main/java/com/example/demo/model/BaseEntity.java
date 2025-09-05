package com.example.demo.model;

import java.time.LocalDateTime;

public class BaseEntity {
    private Long id;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
    }
}
