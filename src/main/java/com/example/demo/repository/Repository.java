package com.example.demo.repository;

import java.util.List;

public interface Repository<T> {
    void add(T entity);

    void remove(Long id);

    T findById(Long id);

    List<T> findAll();
}
