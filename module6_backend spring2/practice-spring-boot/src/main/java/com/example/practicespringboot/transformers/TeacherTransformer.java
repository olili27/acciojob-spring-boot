package com.example.practicespringboot.transformers;

import com.example.practicespringboot.dtos.requests.TeacherRequestDto;
import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.Student;
import com.example.practicespringboot.models.Teacher;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TeacherTransformer {

    public static Teacher requestDtoToTeacherEntity(TeacherRequestDto teacherRequestDto) {

        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherRequestDto.getFirstName());
        teacher.setLastName(teacherRequestDto.getLastName());
        teacher.setEmail(teacherRequestDto.getEmail());
        teacher.setMobileNo(teacherRequestDto.getMobileNo());
        teacher.setQualification(teacherRequestDto.getQualification());
        teacher.setDepartment(teacherRequestDto.getDepartment());

        return teacher;
    }

    public static UserResponseDto teacherToUserResponseDto(Teacher teacher) {
        return UserResponseDto.builder()
                .firstName(teacher.getFirstName())
                .email(teacher.getEmail())
                .lastName(teacher.getLastName())
                .build();
    }
}
