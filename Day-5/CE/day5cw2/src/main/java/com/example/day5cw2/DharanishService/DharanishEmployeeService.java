package com.example.day5cw2.DharanishService;

import org.springframework.stereotype.Service;

import com.example.day5cw2.DharanishModel.DharanishEmployee;
import com.example.day5cw2.Dharanishrepo.DharanishEmployeeRepo;

@Service
public class DharanishEmployeeService {
    public DharanishEmployeeRepo employeeRepo;
    public DharanishEmployeeService(DharanishEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(DharanishEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DharanishEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public DharanishEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
