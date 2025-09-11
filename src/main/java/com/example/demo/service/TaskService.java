package com.example.demo.service;

import com.example.demo.model.Status;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task save(Task task) {
       return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Task get(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }
    public List<Task> getTaskByUserId(Long userId) {
        return taskRepository.findByAssignedUser_Id(userId);
    }
    public List<Task> getTaskByStatus(Status status) {
        return taskRepository.findByStatus(status);
    }
}
