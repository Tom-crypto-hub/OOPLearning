package com.pandas.learn.wj.practice_daily.prictice20_08_20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-20 9:18
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("要查找的下标：");
        int k = scanner.nextInt();
        int[][] intArrs = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
//        int[][] intArrs = {
//                {1, 5, 9, 14},
//                {10, 11, 13, 20},
//                {12, 13, 15, 16},
//                {8, 14, 17, 21}
//        };
        int[] arr = new int[intArrs.length * intArrs[0].length];

        // 将二维数组转为一维数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = intArrs[i / intArrs.length][i % intArrs.length];
        }
        // 冒泡排序，然后打印K位置的值
        sort(arr);
        System.out.println("暴力解析：" + arr[k - 1]);

        // 二分查找
        System.out.println("二分查找：" + binarySearch(arr, k));

        // 归并排序
        System.out.println("归并排序：" + mergeSort(arr)[k - 1]);
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void sort(int[] arr) {
        int len = arr.length - 1;
        int temp = 0; // 一个临时变量
        int tempPostion = 0; // 记录最后一次交换的位置
        // 要遍历的次数
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 1; // 标志符
            // 依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = 0; j < len; j++) {
                // 比较相邻元素，如果前一个比后一个小，就发生交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 0; //发生交换，标志位置0
                    tempPostion = j; // 记录交换的位置
                }
            }
            // 把最后一次交换的位置赋给len，以此来缩减内循环的次数
            len = tempPostion;
            // 如果没有交换过元素，则已经有序
            if (flag == 1) {
                return;
            }
        }
    }

    /**
     * 一维数组的二分查找
     * @param arr
     * @return
     */
    public static int binarySearch(int[] arr, int key){
        int left = 1;
        int right = arr.length;
        if(key > right || key < left) return -1;
        int mid;
        while (left < right){
            mid = (left + right) / 2;
            if(mid == key){
                return arr[mid - 1];
            }
            else if(mid < key){
                left = mid;
            }
            else{
                right = mid;
            }
        }
        return -1;
    }

    public static int binarySearchTwo(int[][] arr, int key){
        return 0;
    }

    /**
     * 归并排序
     * @param arr
     * @return
     */
    public static int[] mergeSort(int[] arr){
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        if(tempArr.length < 2){
            return tempArr;
        }

        int mid = tempArr.length / 2;
        int[] left = Arrays.copyOfRange(tempArr, 0, mid);
        int[] right = Arrays.copyOfRange(tempArr, mid, tempArr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * 归并排序交换的逻辑
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int index = 0;
        while (left.length > 0 && right.length > 0){
            if(left[0] < right[0]){
                result[index++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            }
            else {
                result[index++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0){
            result[index++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0){
            result[index++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }

}
