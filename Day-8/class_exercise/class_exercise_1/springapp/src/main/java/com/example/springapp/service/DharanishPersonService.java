package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DharanishModel;
import com.example.springapp.repository.DharanishPersonRepo;

@Service
public class DharanishPersonService {
    @Autowired
    private DharanishPersonRepo rep;

    public boolean post(DharanishModel person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DharanishModel> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DharanishModel> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
