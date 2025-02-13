package com.example.practicespringboot.transformers;

import com.example.practicespringboot.dtos.requests.StudentRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.Student;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StudentTransformer {

    public static Student requestDtoToStudentEntity(StudentRequestDto studentRequestDto) {

        Student student = new Student();
        student.setFirstName(studentRequestDto.getFirstName());
        student.setLastName(studentRequestDto.getLastName());
        student.setEmail(studentRequestDto.getEmail());
        student.setAge(studentRequestDto.getAge());
        student.setSubject(studentRequestDto.getSubject());
        student.setClassGrade(studentRequestDto.getClassGrade());
        student.setMobileNo(studentRequestDto.getMobileNo());

        return student;
    }

    public static UserResponseDto studentToUserResponseDto(Student student) {
        return UserResponseDto.builder()
                .firstName(student.getFirstName())
                .email(student.getEmail())
                .lastName(student.getLastName())
                .build();
    }
}
