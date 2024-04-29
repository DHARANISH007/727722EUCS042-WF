package com.example.springapp.Dharanishcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Dharanishmodel.DharanishStudentDetail;
import com.example.springapp.Dharanishservice.DharanishStudentDetailService;

@RestController
public class DharanishStudentDetailController {
    @Autowired
    DharanishStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<DharanishStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody DharanishStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
