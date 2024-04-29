package com.example.day14ce1.Dharanishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.Dharanishmodel.DharanishPayroll;

@Repository
public interface DharanishPayrollRepo extends JpaRepository<DharanishPayroll,Long> {
    
}
