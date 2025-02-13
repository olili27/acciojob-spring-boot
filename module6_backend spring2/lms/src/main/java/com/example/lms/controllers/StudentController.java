package com.example.lms.controllers;

import com.example.lms.dtos.requests.StudentReqDto;
import com.example.lms.dtos.responses.StudentResDto;
import com.example.lms.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentReqDto studentReqDto) {
        return studentService.addStudent(studentReqDto);
    }

    @GetMapping("/get-student")
    public StudentResDto getStudent(@RequestParam("id") int id) {
        return studentService.getStudent(id);
    }
}
