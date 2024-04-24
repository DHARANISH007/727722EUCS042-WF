package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DharanishStudent;



@Repository
public interface DharanishStudentRepository extends JpaRepository<DharanishStudent,Integer>{
    
}
