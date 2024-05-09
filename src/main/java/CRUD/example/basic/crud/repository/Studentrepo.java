package CRUD.example.basic.crud.repository;

import CRUD.example.basic.crud.model.Studentdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepo extends JpaRepository<Studentdetails,Integer> {

   // @Query("FROM Studentdetails sd where sd.s_rollno = :s_rollno")

   /*@Query("SELECT s1.marksub1 as tamil, s1.marksub2 as english ,s1.marksub3 as hindi FROM Semester1 s1 WHERE s1.s_rollno = :s_rollno")*/
   @Query("SELECT sd.s_name as name, sd.s_location as location, sd.s_department as department FROM Studentdetails sd WHERE sd.s_rollno = :s_rollno")
   List<Object[]> list(int s_rollno);


}
