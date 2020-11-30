package DAO;

public class Athlete {

    private String name;
    private int rollNo;

    Athlete(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    //返回运动员name
    public String getName() {
        return name;
    }

    //设置name
    public void setName(String name) {
        this.name = name;
    }

    //返回编号
    public int getRollNo() {
        return rollNo;
    }

    //设置编号
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
