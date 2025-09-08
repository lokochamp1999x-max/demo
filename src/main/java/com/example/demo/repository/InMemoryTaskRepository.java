package com.example.demo.repository;

import com.example.demo.model.Status;
import com.example.demo.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {
    private final HashMap<Long, Task> storage = new HashMap<>();

    @Override
    public void add(Task entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public void save(Task entity) {
        if (storage.containsKey(entity.getId())) {
            storage.put(entity.getId(), entity);
        } else add(entity);
    }

    @Override
    public void remove(Long id) {
        storage.remove(id);
    }

    @Override
    public Task findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Task findByStatus(Status status) {
        return storage.values().stream().filter(task -> task.getStatus().equals(status)).findFirst().orElse(null);
    }

    @Override
    public Task findByAssigneeId(Long id) {
        return storage.values().stream()
                .filter(task -> task.getAssignedUserId().equals(id)).findFirst().orElse(null);
    }
}
