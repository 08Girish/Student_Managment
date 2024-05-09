package CRUD.example.basic.crud.model;

import CRUD.example.basic.crud.repository.Sem2Repo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Semester1 {
    @Id
    @Column
    private int s_rollno;

    @Column
    private String subject1;

    @Column
    private int marksub1;

    @Column
    private String subject2;

    @Column
    private int marksub2;

    @Column
    private String subject3;

    @Column
    private  int marksub3;

    @Column
    private String result;


    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public int getMarksub1() {
        return marksub1;
    }

    public void setMarksub1(int marksub1) {
        this.marksub1 = marksub1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public int getMarksub2() {
        return marksub2;
    }

    public void setMarksub2(int marksub2) {
        this.marksub2 = marksub2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    public int getMarksub3() {
        return marksub3;
    }

    public void setMarksub3(int marksub3) {
        this.marksub3 = marksub3;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getS_rollno() {
        return s_rollno;
    }

    public void setS_rollno(int s_rollno) {
        this.s_rollno = s_rollno;
    }

}
