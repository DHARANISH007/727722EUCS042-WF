package com.examly.springapp.service;

import com.examly.springapp.model.DharanishProduct;
import com.examly.springapp.repository.DharanishProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DharanishProductService {
    @Autowired
    DharanishProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(DharanishProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DharanishProduct> getAll() {
        return repo.findAll();

    }

    public List<DharanishProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<DharanishProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
