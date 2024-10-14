package com.upstrive.assignment.user_management_service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



    @Autowired
    private PasswordEncoder  passwordEncoder;

    public User createUser(CreateUserRequest userCreateDto) {
        User user = new User();
        user.setUsername(userCreateDto.username());
        user.setPassword(passwordEncoder.encode(userCreateDto.password())); // Hash the password
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}