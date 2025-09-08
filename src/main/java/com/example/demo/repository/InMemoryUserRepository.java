package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> storage = new HashMap<>();

    @Override
    public boolean existsByEmail(String email) {
        return findAll().stream().anyMatch(user -> user.getEmail().equals(email));
    }

    @Override
    public void add(User entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public void save(User entity) {
        if (storage.containsKey(entity.getId())) {
            storage.put(entity.getId(), entity);
        } else add(entity);
    }

    @Override
    public void remove(Long id) {
        storage.remove(id);
    }

    @Override
    public User findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storage.values());
    }
}
