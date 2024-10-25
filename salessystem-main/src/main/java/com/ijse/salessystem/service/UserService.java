package com.ijse.salessystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salessystem.entity.User;

@Service
public interface UserService {
    User createUser(User user); //create user method
    User getUserById(Long id); //read user by user_id
    List<User> getAllUsers(); //read all users
}