package com.example.springapp.Dharanishrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.Dharanishmodel.DharanishStudent;
@Repository
public interface DharanishStudentRepository extends JpaRepository<DharanishStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<DharanishStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<DharanishStudent> getStudentsLeftOuter();

    

    
}
