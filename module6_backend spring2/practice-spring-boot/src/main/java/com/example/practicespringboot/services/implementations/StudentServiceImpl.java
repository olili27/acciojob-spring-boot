package com.example.practicespringboot.services.implementations;

import com.example.practicespringboot.dtos.requests.StudentRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.Student;
import com.example.practicespringboot.repositories.StudentRepository;
import com.example.practicespringboot.services.interfaces.StudentService;
import com.example.practicespringboot.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserResponseDto addStudent(StudentRequestDto studentRequestDto) {

        Student student = StudentTransformer.requestDtoToStudentEntity(studentRequestDto);
        Student savedStudent = studentRepository.save(student);

        return StudentTransformer.studentToUserResponseDto(savedStudent);
    }
}
