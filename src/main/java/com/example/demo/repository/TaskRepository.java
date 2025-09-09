package com.example.demo.repository;

import com.example.demo.model.Task;

import java.util.List;

@org.springframework.stereotype.Repository
public interface TaskRepository extends Repository<Task>{
    List<Task> findByStatus(String status);
    List<Task> findByAssigneeId(Long id);
}
