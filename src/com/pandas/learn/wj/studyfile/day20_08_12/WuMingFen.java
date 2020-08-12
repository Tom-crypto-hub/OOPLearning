package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 17:01
 */
public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;

    public WuMingFen(){
        theMa = "酸辣";
        quantity = 2;
        likeSoup = true;
    }

    public WuMingFen(String theMa, int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public WuMingFen(String theMa, int quantity, boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public void check(){
        System.out.printf("面码：%s\t分量：%s\t是否带汤：%s\n", theMa, quantity, likeSoup);
    }
}

class WuMingFenTest{
    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉",3,true);
        f1.check();
        WuMingFen f2 = new WuMingFen("牛肉",2);
        f2.check();
        WuMingFen f3 = new WuMingFen();
        f3.check();
    }
}
