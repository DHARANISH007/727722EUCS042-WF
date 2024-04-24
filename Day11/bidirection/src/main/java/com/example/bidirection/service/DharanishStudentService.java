package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.DharanishStudent;
import com.example.bidirection.model.DharanishStudentInfo;
import com.example.bidirection.repository.DharanishStudentInfoRepository;
import com.example.bidirection.repository.DharanishStudentRepository;

@Service
public class DharanishStudentService {
    public DharanishStudentRepository studentRepository;
    public DharanishStudentInfoRepository studentInfoRepository;
    public DharanishStudentService(DharanishStudentRepository studentRepository,DharanishStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DharanishStudent saveStudent(DharanishStudent student)
    {
        return studentRepository.save(student);
    }
    public DharanishStudentInfo saveStudentInfo(DharanishStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DharanishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
