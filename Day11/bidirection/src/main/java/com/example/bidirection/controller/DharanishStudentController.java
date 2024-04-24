package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.DharanishStudent;
import com.example.bidirection.model.DharanishStudentInfo;
import com.example.bidirection.service.DharanishStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DharanishStudentController {
    public DharanishStudentService studentService;
    public DharanishStudentController(DharanishStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public DharanishStudent postMethodName(@RequestBody DharanishStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DharanishStudentInfo postMethodName(@RequestBody DharanishStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<DharanishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}