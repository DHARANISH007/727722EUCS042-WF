package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.DharanishPerson;

/**
 * PersonRepo
 */
@Repository
public interface DharanishPersonRepo extends JpaRepository<DharanishPerson, Integer> {

     List<DharanishPerson> findByAge(int byAge);
}