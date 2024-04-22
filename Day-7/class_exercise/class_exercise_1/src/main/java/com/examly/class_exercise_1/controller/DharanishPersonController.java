package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.DharanishPerson;
import com.examly.class_exercise_1.service.DharanishPersonService;

@RestController
public class DharanishPersonController {

     @Autowired
     public DharanishPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<DharanishPerson> postMethodName(@RequestBody DharanishPerson entity) {

          DharanishPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<DharanishPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<DharanishPerson>> getMethodName() {

          List<DharanishPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DharanishPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DharanishPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<DharanishPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}