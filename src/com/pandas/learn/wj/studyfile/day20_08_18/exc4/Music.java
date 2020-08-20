package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:37
 */
public class Music extends Media{

    Integer a = 0;
    Short b = 0;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Music(String name, String type, String author) {
        super(name, type);
        this.author = author;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("author：" + author);
    }
}
