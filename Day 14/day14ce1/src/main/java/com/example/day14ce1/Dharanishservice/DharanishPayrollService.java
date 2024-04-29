package com.example.day14ce1.Dharanishservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.Dharanishmodel.DharanishPayroll;
import com.example.day14ce1.Dharanishrepository.DharanishPayrollRepo;

@Service
public class DharanishPayrollService {
    @Autowired
    DharanishPayrollRepo payrollRepo;

    public DharanishPayroll addPayroll(Long id,DharanishPayroll payroll)
    {
        DharanishPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<DharanishPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
