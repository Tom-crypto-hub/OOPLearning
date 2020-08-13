package com.pandas.learn.zt.day09;
/*7.为“无名的粉”写一个类classWuMingFen要求：
        1.有三个属性面码:StringtheMa粉的分量(两)intquantity是
        否带汤booleanlikeSoup
        2.写一个构造方法以便于简化初始化过程如WuMingFenf1=new
        WuMingFen("牛肉",3,true);
        3.重载构造方法使得初始化过程可以多样化WuMingFenf2=new
        WuMingFen("牛肉",2);
        4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的
        WuMingFenf3=newWuMingFen();
        5.写一个普通方法check()用于查看粉是否符合要求。即将对象的
        三个属性打印在控制台上。（分工讲解）*/
public class WuMingFen {
//    属性
    private String theMa;//意义不明
    private int quantity;//分量
    private boolean likeSoup;//是否带汤

    public String getTheMa() {
        return theMa;
    }

    public void setTheMa(String theMa) {
        this.theMa = theMa;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLikeSoup() {
        return likeSoup;
    }

    public void setLikeSoup(boolean likeSoup) {
        this.likeSoup = likeSoup;
    }

    //   无参构造器
    public WuMingFen() {
    }
//    参数为种类、分量的构造器
    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }
//    参数为种类、分量、是否带汤的构造器
    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }
    public void check(){
        System.out.println("种类："+theMa);
        System.out.println("分量："+quantity);
        if (likeSoup){
            System.out.println("带汤");
        }else {
            System.out.println("不带汤");
        }
    }
}
