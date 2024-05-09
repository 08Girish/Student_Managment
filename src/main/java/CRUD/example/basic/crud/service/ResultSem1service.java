package CRUD.example.basic.crud.service;

import CRUD.example.basic.crud.model.Semester1;
import CRUD.example.basic.crud.model.Semester2;
import CRUD.example.basic.crud.repository.Sem1Repo;
import CRUD.example.basic.crud.repository.Sem2Repo;
import CRUD.example.basic.crud.vo.Sem1VO;
import CRUD.example.basic.crud.vo.Sem2VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultSem1service {

    @Autowired
    Sem1Repo sem1Repo;


//semester 1 get particular details
    public Sem1VO getAllsem1details(int s_roll)
    {
        /* return sem1Repo.findAll();*/
        List<Object[]> result1 = sem1Repo.list(s_roll);
        Sem1VO sem1VO = null;
        for (Object[] row : result1){
            sem1VO = new Sem1VO();
            sem1VO.setTamil((int) row[0]);
            sem1VO.setEnglish((int) row[1]);
            sem1VO.setHindi((int) row[2]);
            sem1VO.setResult((String) row[3]);
        }
        return sem1VO;
    }
//SEMESTER 1 Save data....
    public void savesem1(Semester1 semester1){
        sem1Repo.save(semester1);
    }


}
