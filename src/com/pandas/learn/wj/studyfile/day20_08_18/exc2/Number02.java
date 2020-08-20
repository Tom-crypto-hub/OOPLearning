package com.pandas.learn.wj.studyfile.day20_08_18.exc2;

/**
 * @author wangjing
 * @create 2020-08-18 11:36
 */
public class Number02 extends Number {
    @Override
    public int method(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
