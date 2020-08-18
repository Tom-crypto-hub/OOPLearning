package com.pandas.learn.wj.studyfile.day20_08_17;

/**
 * @author wangjing
 * @create 2020-08-17 18:37
 */
public class Test {
}

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

class TestDog{
    public static void main(String[] args){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
    }
}
