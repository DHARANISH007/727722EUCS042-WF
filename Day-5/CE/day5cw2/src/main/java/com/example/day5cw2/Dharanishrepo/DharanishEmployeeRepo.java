package com.example.day5cw2.Dharanishrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.DharanishModel.DharanishEmployee;


@Repository
public interface DharanishEmployeeRepo extends JpaRepository<DharanishEmployee,Integer>{
    
}
