package com.example.practicespringboot.controllers;

import com.example.practicespringboot.dtos.requests.StudentRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.services.interfaces.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public UserResponseDto addStudent(@Valid @RequestBody StudentRequestDto studentRequestDto) {

        return studentService.addStudent(studentRequestDto);
    }
}
