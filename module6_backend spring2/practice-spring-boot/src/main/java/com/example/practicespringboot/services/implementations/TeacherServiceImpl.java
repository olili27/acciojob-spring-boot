package com.example.practicespringboot.services.implementations;

import com.example.practicespringboot.dtos.requests.TeacherRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.Teacher;
import com.example.practicespringboot.repositories.TeacherRepository;
import com.example.practicespringboot.services.interfaces.TeacherService;
import com.example.practicespringboot.transformers.TeacherTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public UserResponseDto addTeacher(TeacherRequestDto teacherRequestDto) {

        Teacher teacher = TeacherTransformer.requestDtoToTeacherEntity(teacherRequestDto);
        Teacher savedTeacher = teacherRepository.save(teacher);

        return TeacherTransformer.teacherToUserResponseDto(savedTeacher);
    }
}
