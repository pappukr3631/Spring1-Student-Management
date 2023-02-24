package com.pks.StudentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    private Map<Integer,Student> db;
    StudentRepository(){
        db = new HashMap<>();
    }
    public String addStudent(Student student) {
        int admNo = student.getAdmissionNo();
        db.put(admNo,student);
        return "Student Added Successfully";
    }

    //Searching student using admission number
    public Student getStudent(int admNo) {
        return db.get(admNo);
    }

    //Searching student using student's name
    public Student getStudentName(String name) {
        for(int i : db.keySet()) {
            if(db.get(i).getName().equals(name)) {
                return db.get(i);
            }
        }
        return null;
    }

    //Updating info
    public String updateStudent(Student student) {
        int admNo = student.getAdmissionNo();
        if(db.containsKey(admNo)) {
            db.put(admNo, student);
            return "Student's info Updated";
        }
        return "Student's info not found";
    }

    //Deleting student
    public String deleteStudent(int admNo) {
        if(db.containsKey(admNo)) {
            db.remove(admNo);
            return "Student with admission no.: " + admNo + " deleted.";
        }
        return "Invalid admission no.: " + admNo;
    }
}
