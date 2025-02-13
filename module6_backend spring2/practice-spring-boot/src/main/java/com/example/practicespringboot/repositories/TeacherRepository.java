package com.example.practicespringboot.repositories;

import com.example.practicespringboot.models.Student;
import com.example.practicespringboot.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
