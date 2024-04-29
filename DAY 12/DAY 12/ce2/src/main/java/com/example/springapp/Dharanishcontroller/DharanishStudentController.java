package com.example.springapp.Dharanishcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Dharanishmodel.DharanishStudent;
import com.example.springapp.Dharanishservice.DharanishStudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DharanishStudentController{
    @Autowired
    DharanishStudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<DharanishStudent> addStudents(@RequestBody DharanishStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<DharanishStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<DharanishStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


