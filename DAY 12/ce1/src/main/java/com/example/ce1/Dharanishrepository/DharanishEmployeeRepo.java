package com.example.ce1.Dharanishrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ce1.Dharanishmodel.DharanishEmployee;

public interface DharanishEmployeeRepo extends JpaRepository<DharanishEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<DharanishEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<DharanishEmployee> getByLeftOuterEmployees();
}