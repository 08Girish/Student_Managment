package CRUD.example.basic.crud.service;

import CRUD.example.basic.crud.model.Semester2;
import CRUD.example.basic.crud.repository.Sem2Repo;
import CRUD.example.basic.crud.vo.Sem2VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultSem2service {

    @Autowired
    Sem2Repo sem2Repo;


    //SEMESTER 2 get particular details..
    public Sem2VO getAllsem2details(int s_roll)
    {
        return sem2Repo.list2(s_roll);
    }

    //SEMESTER 2 save data....
    public void savesem2(Semester2 semester2)
    {
        sem2Repo.save(semester2);
    }
}
