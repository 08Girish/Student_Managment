package CRUD.example.basic.crud.controller;

import CRUD.example.basic.crud.model.Semester1;
import CRUD.example.basic.crud.model.Studentdetails;
import CRUD.example.basic.crud.service.Studentservice;
import CRUD.example.basic.crud.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Studentcontrol {

    @Autowired
    Studentservice studentservice;

    //Read all details

    @GetMapping("/studentdetails")
    private List<Studentdetails> getAllstudentdetails()
    {
        return studentservice.getAllStudentdetails();
    }

    //read particular detail....
    @GetMapping("/studentdetails/{s_rollno}")   //4
    private StudentVO getstudentdetails(@PathVariable("s_rollno")int s_rollno)
    {
        return studentservice.getStudentStudentdetailsBys_rollno(s_rollno);
    }


    @GetMapping("/api/studentdetails/{s_rollno}")
    private Studentdetails getAllstudentdetails(@PathVariable("s_rollno")int s_rollno)
    {
        return studentservice.getParticulardetailsBys_rollno(s_rollno);
    }



//create details
    @PostMapping("/studentdetails")
    private String saveStudentdetails(@RequestBody Studentdetails studentdetails)
    {
        studentservice.savedata(studentdetails);
        return "Data sucessfully created...";
    }




//delete details

    @DeleteMapping("/studentdetails/{s_rollno}")
    private String deletedata(@PathVariable("s_rollno")int s_rollno)
    {
        studentservice.delete(s_rollno);
        return "Data deleted Succefully...";
    }


    //update details....

    @PutMapping("/studentdetails")
    private Studentdetails update(@RequestBody Studentdetails studentdetails)
    {
        studentservice.update(studentdetails, studentdetails.getS_rollno());
        return studentdetails;
    }
}
