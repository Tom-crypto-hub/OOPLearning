package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:35
 */
public class Media {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Media(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void getInfo(){
        System.out.print("name: " + name + ", type: " + type + "    ");
    }
}
