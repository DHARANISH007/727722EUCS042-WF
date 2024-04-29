package com.example.day14ce2.Dharanishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.Dharanishmodel.DharanishBook;

@Repository
public interface DharanishBookRepo extends JpaRepository<DharanishBook,Integer> {
    
}
