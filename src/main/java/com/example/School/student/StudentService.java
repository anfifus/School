package com.example.School.student;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class StudentService {

    @GetMapping
    public List<Student> showStudent()
    {
        return List.of(new Student(1L, "Aleix", "Alvarez"));
    }
}
