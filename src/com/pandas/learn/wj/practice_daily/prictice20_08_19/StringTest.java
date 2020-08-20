package com.pandas.learn.wj.practice_daily.prictice20_08_19;

import java.util.*;

/**
 * @author wangjing
 * @create 2020-08-19 9:20
 *
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从
 * 字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该
 * 字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 解法:使用map实现
 *
 * 进阶：使用哈希+队列实现
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "ffopghga";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.replace(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        char result = '0';
        for (char c : map.keySet()){
            if(map.get(c) == 1){
                result = c;
                break;
            }
        }
        if(result == '0'){
            System.out.println("没有只出现一次的字符");
        }
        else{
            System.out.printf("第一个只出现一次的字符是\"%s\"", result);
        }
    }
}
