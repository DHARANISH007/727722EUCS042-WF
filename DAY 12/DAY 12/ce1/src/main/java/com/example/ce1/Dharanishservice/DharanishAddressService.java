package com.example.ce1.Dharanishservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Dharanishmodel.DharanishAddress;
import com.example.ce1.Dharanishrepository.DharanishAddressRepo;
import com.example.ce1.Dharanishrepository.DharanishEmployeeRepo;

@Service
public class DharanishAddressService {
    @Autowired
    DharanishAddressRepo addressRepo;
    @Autowired
    DharanishEmployeeRepo employeeRepo;
    public DharanishAddress setAddressById(int id,DharanishAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
