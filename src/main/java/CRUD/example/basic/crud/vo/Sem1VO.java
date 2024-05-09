package CRUD.example.basic.crud.vo;

import CRUD.example.basic.crud.repository.Sem1Repo;

import java.util.List;

public class Sem1VO {

    private int tamil;
    private int english;
    private int hindi;
    private String result;

    public int getTamil() {
        return tamil;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
