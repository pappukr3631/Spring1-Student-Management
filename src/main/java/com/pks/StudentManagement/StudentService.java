package com.pks.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;//@Autowired is used to access bean(object) from IOC container //it is called "dependency injection"
    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }
    public Student getStudent(int admNo) {
        return studentRepository.getStudent(admNo);
    }
    public Student getStudentName(String name) {
        return studentRepository.getStudentName(name);
    }
    public String updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }
    public String deleteStudent(int admNo) {
        return studentRepository.deleteStudent(admNo);
    }
}
