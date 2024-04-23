package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.DharanishPerson;
import com.examly.class_exercise_1.repository.DharanishPersonRepo;

@Service
public class DharanishPersonService {

     @Autowired
     public DharanishPersonRepo personRepo;

     public DharanishPerson SaveEntity(DharanishPerson entity) {
          return personRepo.save(entity);

     }

     public List<DharanishPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<DharanishPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
