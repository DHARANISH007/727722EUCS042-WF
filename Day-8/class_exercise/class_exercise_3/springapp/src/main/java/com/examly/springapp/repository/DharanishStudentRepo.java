package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.DharanishStudent;
import java.util.List;

@Repository
public interface DharanishStudentRepo extends JpaRepository<DharanishStudent, Long> {

    List<DharanishStudent> findByMarksGreaterThan(int mark);

    List<DharanishStudent> findByMarksLessThan(int mark);

}
