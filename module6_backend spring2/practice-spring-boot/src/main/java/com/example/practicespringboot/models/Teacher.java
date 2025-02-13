package com.example.practicespringboot.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "teachers")
public class Teacher extends User{

    String qualification;

    String department;
   @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    List<Student> studentsHandled = new ArrayList<>();
}
