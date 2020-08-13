package com.pandas.learn.wj.practice_daily.prictice20_08_13;

import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 9:19
 */
public class DOSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = 0;
        int lose = 0;

        String[] strs = sc.nextLine().split(" ");
        int [] arr = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        E = arr[arr.length - 1];
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > E)
                lose = arr[i] - E;
        }

    }
}
