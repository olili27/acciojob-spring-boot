package com.example.practicespringboot.services.interfaces;

import com.example.practicespringboot.dtos.responses.UserResponseDto;

import java.util.List;

public interface UserService {

    public List<UserResponseDto> getAllUsers();
}
