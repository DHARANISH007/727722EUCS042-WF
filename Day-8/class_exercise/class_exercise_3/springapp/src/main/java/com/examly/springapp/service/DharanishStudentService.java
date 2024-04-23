package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.DharanishStudent;
import com.examly.springapp.repository.DharanishStudentRepo;

@Service
public class DharanishStudentService {
    @Autowired
    private DharanishStudentRepo studentRepo;

    public boolean post(DharanishStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DharanishStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<DharanishStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
