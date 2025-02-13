package com.example.lms.dtos.responses;

import com.example.lms.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentResDto {
    private String name;

    private int age;

    private Department department;

    private String mobileNumber;
}
