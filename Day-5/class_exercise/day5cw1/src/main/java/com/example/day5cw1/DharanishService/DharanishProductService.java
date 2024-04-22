package com.example.day5cw1.DharanishService;

import org.springframework.stereotype.Service;

import com.example.day5cw1.DharanishModel.DharanishProduct;
import com.example.day5cw1.Dharanishrepo.Dharanishproductrepo;

@Service
public class DharanishProductService {
    public Dharanishproductrepo productRepo;
    public DharanishProductService(Dharanishproductrepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DharanishProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DharanishProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DharanishProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
