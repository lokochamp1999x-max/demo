package com.example.demo.repository;

import com.example.demo.model.User;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User>{
    boolean existsByEmail(String email);
}
