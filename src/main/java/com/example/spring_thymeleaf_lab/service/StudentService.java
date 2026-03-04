package com.example.spring_thymeleaf_lab.service;

import com.example.spring_thymeleaf_lab.models.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}