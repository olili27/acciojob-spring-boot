package com.example.practicespringboot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "students")
public class Student extends User{
    int age;

    String subject;

    String classGrade;

    @ManyToOne
    @JoinColumn
    Teacher teacher;
}
