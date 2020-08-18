package com.pandas.learn.wj.studyfile.day20_08_18.exc;

/**
 * @author wangjing
 * @create 2020-08-18 10:05
 */
public class Hardware extends Maintainer {

    public Hardware(int id, String name){
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工作为Hardware硬件维护工程师。");
    }
}
