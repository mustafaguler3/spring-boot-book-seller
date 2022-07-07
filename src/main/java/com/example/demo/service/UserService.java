package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);

    User saveUser(User user);

}
