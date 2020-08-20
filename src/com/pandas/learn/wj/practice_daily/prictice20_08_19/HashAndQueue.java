package com.pandas.learn.wj.practice_daily.prictice20_08_19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangjing
 * @create 2020-08-19 10:38
 */
public class HashAndQueue {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        Queue<Character> queue = new LinkedList<>();
        String str = "dddcdadsonweorjadfdfjdnoehndf";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
                queue.offer(c);
            }
            else {
                hashMap.replace(c, hashMap.get(c) + 1);
                if(!queue.isEmpty() && c == queue.peek()){
                    queue.poll();
                }
            }
        }
        char result = '0';
        for(int i = 0; i < queue.size(); i++){
            char value = queue.peek();
            if(hashMap.get(value) == 1){
                result = value;
                break;
            }
            else{
                queue.poll();
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
