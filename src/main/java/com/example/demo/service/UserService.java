package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.add(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void removeUserById(Long id) {
        userRepository.remove(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean existsByEmail(String email) {
       return userRepository.existsByEmail(email);
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> findUsersByName(String name){
        return getAllUsers().stream()
                .filter(user -> user.getName().equals(name))
                .collect(Collectors.toList());
    }

}

