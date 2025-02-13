package com.example.practicespringboot.services.interfaces;

import com.example.practicespringboot.dtos.requests.StudentRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;

public interface StudentService {

    public UserResponseDto addStudent(StudentRequestDto studentRequestDto);
}
