package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:37
 */
public class Video extends Media {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Video(String name, String type, String director) {
        super(name, type);
        this.director = director;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("director: " + director);
    }
}
