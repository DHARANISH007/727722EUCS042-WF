package com.example.day5cw1.Dharanishrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.DharanishModel.DharanishProduct;

@Repository
public interface Dharanishproductrepo extends JpaRepository<DharanishProduct,Integer>{
    
}
