package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private studentRepository studentRepository;
    @GetMapping
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentRepository.save(student);
    }
}