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
        sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        for(int i = N-1;i >= 0;i--){
            E = (int) Math.ceil(((arr[i] + E) / 2.0));
        }
        System.out.println(E);
    }
}
