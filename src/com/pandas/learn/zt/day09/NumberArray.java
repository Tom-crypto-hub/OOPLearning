package com.pandas.learn.zt.day09;

import java.util.Random;

/*.求一个3*3矩阵对角线元素之和
        651
        988矩阵中数值使用随机数产生[0,10)
        408
        此矩阵对角线的和为:22*/
public class NumberArray {
//    生成一个新的3*3二维数组
    public int[][] newArray(){
        Random random = new Random();
        int[][] ints = new int[3][3];
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
                ints[i][j]=random.nextInt(10);
            }
        }
        return ints;
    }
//    输出二维数组
    public void printArray(int[][] ints){
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }
    }
//    对角线相加求和
    public int sum(int[][] ints){
        int sum=ints[0][2]+ints[2][0];
        for (int i = 0; i <ints.length ; i++) {
                sum+=ints[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        NumberArray na = new NumberArray();
        int[][] ints=na.newArray();
        na.printArray(ints);
        System.out.println("对角线和："+na.sum(ints));
    }
}
