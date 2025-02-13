package com.example.practicespringboot.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherRequestDto {

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    @NotBlank
    String email;

    @NotBlank
    String role;

    String qualification;

    String department;

    String mobileNo;
}
