package com.example.springapp.Dharanishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Dharanishmodel.DharanishStudentDetail;
import com.example.springapp.Dharanishrepository.DharanishStudentDetailRepository;
import com.example.springapp.Dharanishrepository.DharanishStudentRepository;

@Service
public class DharanishStudentDetailService {
    @Autowired
    DharanishStudentDetailRepository studentDetailRepository;
    @Autowired
    DharanishStudentRepository studentRepository;
    public DharanishStudentDetail addStudentDetail(int id,DharanishStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
