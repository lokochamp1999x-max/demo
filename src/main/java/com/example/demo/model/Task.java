package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
public class Task extends BaseEntity {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Status status;
    @Getter @Setter @ManyToOne @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    public Task(String title, String description, Status status, User assignedUser) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignedUser = assignedUser;
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
                getId(), title, description, status, assignedUser);
    }
}
