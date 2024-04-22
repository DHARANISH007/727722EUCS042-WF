package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.DharanishStudent;
import com.example.class_exercise_2.service.DharanishStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DharanishStudentController {

     @Autowired
     public DharanishStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<DharanishStudent>> getDetails() {
          List<DharanishStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<DharanishStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DharanishStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<DharanishStudent> postMethodName(@RequestBody DharanishStudent student) {

          DharanishStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<DharanishStudent>> sortedDetails(@PathVariable String field) {
          List<DharanishStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<DharanishStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DharanishStudent>>(list, HttpStatus.OK);

     }
}
