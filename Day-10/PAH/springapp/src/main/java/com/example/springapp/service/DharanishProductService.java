package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DharanishProduct;
import com.example.springapp.repository.DharanishProductRepo;

@Service
public class DharanishProductService {
    @Autowired
    private DharanishProductRepo productRepo;

    public boolean saveProduct(DharanishProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<DharanishProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public DharanishProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public DharanishProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}