package CRUD.example.basic.crud.repository;

import CRUD.example.basic.crud.model.Semester2;
import CRUD.example.basic.crud.vo.Sem2VO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sem2Repo extends JpaRepository<Semester2,Integer> {

    @Query("SELECT new CRUD.example.basic.crud.vo.Sem2VO(s2.python as python, s2.machineLearning as machineLearning ,s2.dbms as  dbms ,s2.result as result) FROM Semester2 s2 WHERE s2.s_rollno = :s_rollno")
    Sem2VO list2(int s_rollno);
}
