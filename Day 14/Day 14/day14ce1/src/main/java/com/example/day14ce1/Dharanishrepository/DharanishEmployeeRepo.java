package com.example.day14ce1.Dharanishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.Dharanishmodel.DharanishEmployee;

@Repository
public interface DharanishEmployeeRepo extends JpaRepository<DharanishEmployee,Long> {
    
}
