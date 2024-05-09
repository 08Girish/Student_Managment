package CRUD.example.basic.crud.vo;

public class Sem2VO {
private String python;
private String machineLearning;
private String dbms;
private String result;

    public Sem2VO(String python, String machineLearning, String dbms, String result) {
        this.python = python;
        this.machineLearning = machineLearning;
        this.dbms = dbms;
        this.result = result;
    }

    public String getPython() {   /**/
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
