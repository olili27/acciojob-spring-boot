package com.example.lms.services.interfaces;

import com.example.lms.dtos.requests.StudentReqDto;
import com.example.lms.dtos.responses.StudentResDto;

public interface StudentService {
    public String addStudent(StudentReqDto studentReqDto);

    public StudentResDto getStudent(int id);
}
