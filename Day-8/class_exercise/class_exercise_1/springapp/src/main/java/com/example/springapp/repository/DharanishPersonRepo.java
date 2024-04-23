package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.DharanishModel;
import java.util.List;


@Repository
public interface DharanishPersonRepo extends JpaRepository<DharanishModel,Integer>{

    List<DharanishModel> findByNameStartingWith(String name);
    List<DharanishModel> findByNameEndingWith(String name);
    
}
