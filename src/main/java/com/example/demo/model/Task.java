package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

enum Status {
    CREATED,
    IN_WORK ,
    COMPLETED;
}

public class Task extends BaseEntity {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Status status;
    @Getter @Setter
    private Long assignedUserId;
}
