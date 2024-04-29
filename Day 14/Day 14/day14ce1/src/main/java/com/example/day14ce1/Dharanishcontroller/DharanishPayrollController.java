package com.example.day14ce1.Dharanishcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.Dharanishmodel.DharanishPayroll;
import com.example.day14ce1.Dharanishservice.DharanishPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class DharanishPayrollController {
    @Autowired
    DharanishPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public DharanishPayroll addPayroll(@PathVariable Long employeeId,@RequestBody DharanishPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<DharanishPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
