package com.example.ce1.Dharanishcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.Dharanishmodel.DharanishEmployee;
import com.example.ce1.Dharanishservice.DharanishEmployeeService;

@RestController
public class DharanishEmployeeController {
    @Autowired
    DharanishEmployeeService employeeService;

    @PostMapping("/employee")
    public DharanishEmployee setMethod(@RequestBody DharanishEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DharanishEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DharanishEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
