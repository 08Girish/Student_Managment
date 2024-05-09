package CRUD.example.basic.crud.controller;

import CRUD.example.basic.crud.model.Semester1;
import CRUD.example.basic.crud.model.Semester2;
import CRUD.example.basic.crud.service.ResultSem1service;
import CRUD.example.basic.crud.service.ResultSem2service;
import CRUD.example.basic.crud.vo.Sem1VO;
import CRUD.example.basic.crud.vo.Sem2VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Resultcontrol<MyResourceNotFoundException> {

    @Autowired
    ResultSem1service resultSem1service;

    @Autowired
    ResultSem2service resultSem2service;



    //SEMESTER 1 detaisls
    @GetMapping("/api/semester1/{s_rollno}")
    private Sem1VO getResultSem1(@PathVariable("s_rollno")int s_rollno)  {

            return resultSem1service.getAllsem1details(s_rollno);

    }
    //create SEMESTER 1 marks
    @PostMapping("/semester1")
    private String saveSem1Deatails(@RequestBody Semester1 semester1)
    {

        resultSem1service.savesem1(semester1);
        return "Semester1 mark entered succesfully...";
    }





//SEMESTER 2 details
    @GetMapping("/api/semester2/{s_rollno}")
    private Sem2VO getResultSem2(@PathVariable("s_rollno")int s_rollno){
        return resultSem2service.getAllsem2details(s_rollno);
    }

    //create SEMESTER 2 marks
    @PostMapping("/semester2")
    private String saveSem2Details(@RequestBody Semester2 semester2)
    {
        resultSem2service.savesem2(semester2);
        return "Semester2 mark entered succesfully...";
    }
}
