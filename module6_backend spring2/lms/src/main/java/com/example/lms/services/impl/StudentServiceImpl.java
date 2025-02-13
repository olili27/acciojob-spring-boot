package com.example.lms.services.impl;

import com.example.lms.dtos.requests.StudentReqDto;
import com.example.lms.dtos.responses.StudentResDto;
import com.example.lms.enums.CardStatus;
import com.example.lms.models.Card;
import com.example.lms.models.Student;
import com.example.lms.repositories.StudentRepository;
import com.example.lms.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(StudentReqDto studentReqDto) {

        Student student = new Student();
        student.setAge(studentReqDto.getAge());
        student.setDepartment(studentReqDto.getDepartment());
        student.setName(studentReqDto.getName());
        student.setMobileNumber(studentReqDto.getMobileNumber());

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2024-01-01");
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);

        return "student saved";
    }

    @Override
    public StudentResDto getStudent(int id) {
        Student student = studentRepository.findById(id).get();

        StudentResDto studentResDto = new StudentResDto();
        studentResDto.setName(student.getName());
        studentResDto.setAge(student.getAge());
        studentResDto.setMobileNumber(student.getMobileNumber());
        studentResDto.setDepartment(student.getDepartment());

        return studentResDto;
    }
}
