package com.example.day5cw3.DharanishService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.DharanishModel.DharanishLanguage;
import com.example.day5cw3.DharanishRepo.Dharanishlanguagerepo;

@Service
public class DharanishlanguageService {
    private Dharanishlanguagerepo languageRepo;
    public DharanishlanguageService(Dharanishlanguagerepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(DharanishLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DharanishLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,DharanishLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public DharanishLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
