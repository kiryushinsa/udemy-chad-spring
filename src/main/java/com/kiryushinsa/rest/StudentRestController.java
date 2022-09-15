package com.kiryushinsa.rest;

import com.kiryushinsa.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    void init(){
        students = new ArrayList<>();
        students.add(new Student("Anton","Gavric"));
        students.add(new Student("Viktor","Ler"));
        students.add(new Student("Isa","Git"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check the student id
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("StudentID not found - " + studentId );
        }

        return students.get(studentId);
    }



}
