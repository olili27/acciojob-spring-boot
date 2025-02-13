package com.example.spring2.mock.services;

import com.example.spring2.mock.models.User;
import com.example.spring2.mock.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        User savedUser  = userRepository.save(user);
        return "added user";
    }
}
