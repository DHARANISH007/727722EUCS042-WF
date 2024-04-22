package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.DharanishProduct;

@Repository
public interface DharanishProductRepo extends JpaRepository<DharanishProduct, Integer> {

    public List<DharanishProduct> findByProductCategory(String productCategory);
    public List<DharanishProduct> findByPriceCategory(String priceCategory);

}
