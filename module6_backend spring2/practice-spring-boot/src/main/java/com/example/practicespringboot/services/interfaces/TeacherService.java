package com.example.practicespringboot.services.interfaces;

import com.example.practicespringboot.dtos.requests.TeacherRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;

public interface TeacherService {

    public UserResponseDto addTeacher(TeacherRequestDto teacherRequestDto);
}
