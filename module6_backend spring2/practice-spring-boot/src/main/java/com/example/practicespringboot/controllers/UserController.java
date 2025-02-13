package com.example.practicespringboot.controllers;

import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get-all")
    public List<UserResponseDto> getAllUsers() {
        return userService.getAllUsers();
    }
}
