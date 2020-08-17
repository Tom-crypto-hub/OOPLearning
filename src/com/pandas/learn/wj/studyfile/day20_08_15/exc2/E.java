package com.pandas.learn.wj.studyfile.day20_08_15.exc2;

/**
 * @author wangjing
 * @create 2020-08-15 10:13
 */
public class E {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("ABC");
        monkey.run();
        monkey.speak();

        Person person = new Person("ccc");
        person.run();
        person.speak();
        person.think();
        person.wish();
    }
}
