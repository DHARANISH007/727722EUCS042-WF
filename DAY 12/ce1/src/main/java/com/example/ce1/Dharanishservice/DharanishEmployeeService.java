package com.example.ce1.Dharanishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Dharanishmodel.DharanishEmployee;
import com.example.ce1.Dharanishrepository.DharanishEmployeeRepo;

@Service
public class DharanishEmployeeService {
    @Autowired
    DharanishEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DharanishEmployee setEmployee(DharanishEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DharanishEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DharanishEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
