package com.example.practicespringboot.controllers;

import com.example.practicespringboot.dtos.requests.TeacherRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.services.interfaces.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/add")
    public UserResponseDto addTeacher(@Valid @RequestBody TeacherRequestDto teacherRequestDto) {

        return teacherService.addTeacher(teacherRequestDto);
    }
}
