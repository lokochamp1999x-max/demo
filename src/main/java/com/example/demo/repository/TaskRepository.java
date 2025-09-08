package com.example.demo.repository;

import com.example.demo.model.Status;
import com.example.demo.model.Task;

public interface TaskRepository extends Repository<Task>{
    Task findByStatus(Status status);
    Task findByAssigneeId(Long id);
}
