package com.pandas.learn.wj.practice_daily.prictice20_08_17;

import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-17 15:41
 */
public class MinStackTest {

    /**
     * 输入：
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * 输出：
     * [null,null,null,null,-3,null,0,-2]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String[] strings1 = str1.substring(1, str1.length() - 1).split(",");

        String str2 = scanner.next();
        String[] strings2 = str2.substring(1, str2.length() - 1).split(",");

        MinStack minStack = null;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < strings1.length; i++){
            String str = strings2[i].substring(1, strings2[i].length() - 1);
            String strTemp = strings1[i].substring(1, strings1[i].length() - 1);
           if (strTemp.equals("MinStack")) {
               minStack = new MinStack();
               sb.append("null").append(',');
           }
           else if(strTemp.equals("push")) {
               minStack.push(Integer.parseInt(str));
               sb.append("null").append(",");
           }
           else if(strTemp.equals("pop")) {
               minStack.pop();
               sb.append("null").append(",");
           }
           else if(strTemp.equals("getMin")) {
               sb.append(minStack.getMin()).append(",");
           }
           else if(strTemp.equals("top")) {
               sb.append(minStack.top()).append(",");
           }
           else{
               System.out.println(strings1[i].length());
           }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");

        System.out.println(sb.toString());
    }
}
