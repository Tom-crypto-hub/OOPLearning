package com.pandas.learn.wj.studyfile.day20_08_12;

import java.util.Random;

/**
 * @author wangjing
 * @create 2020-08-12 9:51
 */
public class StudentTest {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] student = new Student[10];
        for(int i = 0; i < student.length; i++){
            student[i] = new Student(("wj" + i), random.nextInt(101));
        }
        for(Student stu : student)
            stu.printScore();
    }
}
