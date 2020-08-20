package com.pandas.learn.wj.studyfile.day20_08_19.test1;

/**
 * @author wangjing
 * @create 2020-08-19 10:12
 */
public class Test {
    public static void main(String[] args) {
        Role minister = new Minister(100);
        Role monster = new Monster(220);
        Role warrior = new Warrior(150);

        System.out.println("--------------初始化-------------------");
        minister.operate(minister);
        monster.operate(monster);
        warrior.operate(warrior);

        System.out.println("---------------------------------------");
        minister.operate(monster);
        System.out.println("---------------------------------------");
        minister.operate(warrior);

        System.out.println("---------------------------------------");
        monster.operate(minister);
        System.out.println("---------------------------------------");
        monster.operate(warrior);

        System.out.println("---------------------------------------");
        warrior.operate(minister);
        System.out.println("---------------------------------------");
        warrior.operate(monster);

        System.out.println("-----------------结束-------------------");
        minister.operate(minister);
        monster.operate(monster);
        warrior.operate(warrior);
    }
}
