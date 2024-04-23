package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.DharanishCourseJava;
import com.examly.class_exercise_2.service.DharanishService;

@RestController
public class DharanishCourseController {

     @Autowired
     public DharanishService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<DharanishCourseJava> postMethodName(@RequestBody DharanishCourseJava entity) {

          DharanishCourseJava inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<DharanishCourseJava>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<DharanishCourseJava>> getMethodName() {

          List<DharanishCourseJava> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DharanishCourseJava>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DharanishCourseJava>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<DharanishCourseJava> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}