package com.pandas.learn.wj.studyfile.day20_08_20.test05;

/**
 * @author wangjing
 * @create 2020-08-20 15:43
 */
public class Master {
    private String animal;

    public String getAnimal() {

        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Master(String animal) {
        this.animal = animal;
    }

    public void feed(){
        System.out.println("给动物喂食");
    }

}
