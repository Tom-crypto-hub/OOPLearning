package com.pandas.learn.wj.studyfile.day20_08_12;

import java.util.Random;

/**
 * @author wangjing
 * @create 2020-08-13 8:13
 */
public class Prictice {
    public static void main(String[] args) {
        String[] strings = { "ramer", "jelly", "bean", "cake" };
        fanzhuan(strings);
        two();
    }

    // 数组的反转
    public static void fanzhuan(String[] strings){
        String temp ;
        for(int i = 0; i < strings.length / 2; i++){
            temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        for(String str : strings)
            System.out.print(str + "\t");
    }

    // 2   3*3矩阵对角线元素之和
    public static void two(){
        Random random = new Random();
        int[][] arrs = new int[3][3];
        for(int i = 0; i < 3; i++){
            arrs[i] = new int[3];
            for(int j = 0; j < 3; j++){
                arrs[i][j] = random.nextInt(10);
            }
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrs[i][j] + "\t");
            }
            System.out.println();
        }
        // 求和
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 3 - 1 || i == j) {
                    sum += arrs[i][j];
                }
            }
        }
        System.out.println("和为：" + sum);
    }


}
