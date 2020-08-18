package com.pandas.learn.wj.studyfile.day20_08_18.exc;

/**
 * @author wangjing
 * @create 2020-08-18 9:58
 */
public class Employee {
    private int ID;
    private String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
        this.ID = 0;
        this.name = "name";
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void work(){
        System.out.printf("员工号为%s的 %s员工\n", ID, name);
    }

}
