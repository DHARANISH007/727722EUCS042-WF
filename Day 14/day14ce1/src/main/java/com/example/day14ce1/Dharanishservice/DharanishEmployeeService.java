package com.example.day14ce1.Dharanishservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.Dharanishmodel.DharanishEmployee;
import com.example.day14ce1.Dharanishrepository.DharanishEmployeeRepo;

@Service

public class DharanishEmployeeService {
    @Autowired
    DharanishEmployeeRepo employeeRepo;

    public DharanishEmployee addEmployee(DharanishEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DharanishEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<DharanishEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
