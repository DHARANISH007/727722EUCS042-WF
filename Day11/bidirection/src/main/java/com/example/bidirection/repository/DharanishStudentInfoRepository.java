package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DharanishStudentInfo;

@Repository
public interface DharanishStudentInfoRepository extends JpaRepository<DharanishStudentInfo,Integer>{
    
}