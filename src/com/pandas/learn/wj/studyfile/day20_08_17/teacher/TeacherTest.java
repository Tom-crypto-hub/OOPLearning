package com.pandas.learn.wj.studyfile.day20_08_17.teacher;

/**
 * @author wangjing
 * @create 2020-08-17 16:09
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.pay();
        teacher = new CommonTeacher();
        teacher.pay();
        teacher = new HighTeacher();
        teacher.pay();
        teacher = new SuperfineTeacher();
        teacher.pay();
    }
}
