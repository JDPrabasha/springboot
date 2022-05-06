package com.example.springboot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,"Mariam", LocalDate.of(2000,12,21),"04@gmail.com",56));
    }
}
