package CRUD.example.basic.crud.service;

import CRUD.example.basic.crud.model.Semester1;
import CRUD.example.basic.crud.model.Studentdetails;
import CRUD.example.basic.crud.repository.Sem1Repo;
import CRUD.example.basic.crud.repository.Studentrepo;
import CRUD.example.basic.crud.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Studentservice {

    @Autowired
    Studentrepo studentrepo;

    public List<Studentdetails> getAllStudentdetails(){
        return  studentrepo.findAll();
    }
    public Studentdetails getParticulardetailsBys_rollno(int s_roll)
    {
        return studentrepo.findById(s_roll).get();
    }

    //project
    public StudentVO getStudentStudentdetailsBys_rollno(int s_roll)
    {
        List<Object[]> result = studentrepo.list(s_roll);

        StudentVO studentVO = null;
        for (Object[] row : result){
            studentVO = new StudentVO();
            studentVO.setName((String) row[0]);
            studentVO.setLocation((String) row[1]);
            studentVO.setDept((String) row[2]);
        }
        return studentVO;
    }

    public void savedata(Studentdetails studentdetails)
    {
        studentrepo.save(studentdetails);
    }

    public void delete(int s_rollno)
    {
        studentrepo.deleteById(s_rollno);

    }
    public void update(Studentdetails studentdetails,int s_rollno)
    {
        studentrepo.save(studentdetails);
    }
}
