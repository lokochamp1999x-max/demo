package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

import java.util.List;

public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void add(Task task) {
        taskRepository.add(task);
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.remove(id);
    }

    public Task get(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }
    public Task getTaskByUserId(Long userId) {
        return taskRepository.findByAssigneeId(userId);
    }
    public Task getTaskByStatus(String status) {
        return taskRepository.findByStatus(status);
    }
}
