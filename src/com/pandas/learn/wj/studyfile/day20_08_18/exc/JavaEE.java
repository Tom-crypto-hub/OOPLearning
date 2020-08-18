package com.pandas.learn.wj.studyfile.day20_08_18.exc;

/**
 * @author wangjing
 * @create 2020-08-18 10:02
 */
public class JavaEE extends Developer {

    public JavaEE(int id, String name){
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工作为JavaEE开发工程师。");
    }
}
