package com.example.springapp.Dharanishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Dharanishmodel.DharanishStudent;
import com.example.springapp.Dharanishrepository.DharanishStudentRepository;

@Service
public class DharanishStudentService {
    @Autowired
    DharanishStudentRepository studentRepository;
    public DharanishStudent addStudents(DharanishStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DharanishStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<DharanishStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<DharanishStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
