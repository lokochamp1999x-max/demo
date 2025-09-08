package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

public class Task extends BaseEntity {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Status status;
    @Getter @Setter
    private Long assignedUserId;

    public Task(String title, String description, Status status, Long assignedUserId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignedUserId = assignedUserId;
    }
    public Task(String title, String description, Status status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }
    public Task(){

    }

    @Override
    public String toString() {
        return String.format("Task[id=%d, title='%s', description='%s', status=%s, assignedUserId=%s]",
                getId(), title, description, status, assignedUserId);
    }
}
