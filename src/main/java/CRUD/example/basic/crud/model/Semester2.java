package CRUD.example.basic.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
    public class Semester2 {
    @Id
    @Column
    private int s_rollno;
    @Column
    private String python;

    @Column
    private String machineLearning;

    @Column
    private String dbms;

    @Column
    private  String result;

    public int getS_rollno() {
        return s_rollno;
    }

    public void setS_rollno(int s_rollno) {
        this.s_rollno = s_rollno;
    }

    public String getPython() {
        return python;
    }

    public void setPython(String python) {
        this.python = python;
    }

    public String getMachineLearning() {
        return machineLearning;
    }

    public void setMachineLearning(String machineLearning) {
        this.machineLearning = machineLearning;
    }

    public String getDbms() {
        return dbms;
    }

    public void setDbms(String dbms) {
        this.dbms = dbms;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
