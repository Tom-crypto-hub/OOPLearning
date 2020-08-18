package com.pandas.learn.wj.practice_daily.prictice20_08_18;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangjing
 * @create 2020-08-18 9:04
 */
public class Exc {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        // 压入栈的元素
        String[] strings = scanner.next().split(",");
        // 需要判断的元素
        String[] testStrs = scanner.next().split(",");

        int j = 0;
        for(int i = 0; i < strings.length; i++){
            int str = Integer.parseInt(strings[i]);
            stack.push(str);

            int value = Integer.parseInt(testStrs[j]);
            while (!stack.empty() && value == stack.peek()) {
                stack.pop();
                if (++j <= testStrs.length - 1)
                    value = Integer.parseInt(testStrs[j]);
            }
        }
        if(j >= testStrs.length){
            System.out.println("第二个序列是该栈的弹出顺序。");
        }
        else{
            System.out.println("第二个序列不是该栈的弹出顺序。");
        }
    }
}
