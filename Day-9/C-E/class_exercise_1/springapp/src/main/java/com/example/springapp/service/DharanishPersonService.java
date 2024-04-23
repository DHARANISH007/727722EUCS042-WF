package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.DharanishPerson;
import com.example.springapp.repository.DharanishPersonRepo;

@Service
public class DharanishPersonService {
    public DharanishPersonRepo personRepo;

    public DharanishPersonService(DharanishPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DharanishPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DharanishPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
