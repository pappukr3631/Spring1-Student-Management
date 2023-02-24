package com.pks.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController//it tells java compiler that here is REST API// if we miss this it will not know
public class StudentController {

    @Autowired
    StudentService studentService;
    //Adding student info
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //Searching student using admission number
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int admNo) {
        return studentService.getStudent(admNo);
    }
    //Searching student using student's name
    @GetMapping("/get_usingName")
    public Student getStudentName(@RequestParam("q") String name) {
        return studentService.getStudentName(name);
    }
    //Updating info (PUT api)
    @PutMapping("/update_student")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    //Deleting student
    @DeleteMapping("/delete_student")
    public String deleteStudent(@RequestParam("q") int admNo) {
        return studentService.deleteStudent(admNo);
    }
}
