package CRUD.example.basic.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Studentdetails {
    @Column
    private String s_name;

    @Id
    @Column
    private int s_rollno;

    @Column
    private String s_location;

    @Column
    private String s_department;

    @Column
    private String s_semester;

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_rollno() {
        return s_rollno;
    }

    public void setS_rollno(int s_rollno) {
        this.s_rollno = s_rollno;
    }

    public String getS_location() {
        return s_location;
    }

    public void setS_location(String s_location) {
        this.s_location = s_location;
    }

    public String getS_department() {
        return s_department;
    }

    public void setS_department(String s_department) {
        this.s_department = s_department;
    }

    public String getS_semester() {
        return s_semester;
    }

    public void setS_semester(String s_semester) {
        this.s_semester = s_semester;
    }
}
