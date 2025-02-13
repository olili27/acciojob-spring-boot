package com.example.lms.dtos.requests;

import com.example.lms.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentReqDto {

    private String name;

    private int age;

    private Department department;

    private String mobileNumber;
}
