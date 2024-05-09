package CRUD.example.basic.crud.repository;

import CRUD.example.basic.crud.model.Semester1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sem1Repo extends JpaRepository<Semester1,Integer> {

    @Query("SELECT s1.marksub1 as tamil, s1.marksub2 as english ,s1.marksub3 as hindi,s1.result as result FROM Semester1 s1 WHERE s1.s_rollno = :s_rollno")
    List<Object[]> list(int s_rollno);

}
