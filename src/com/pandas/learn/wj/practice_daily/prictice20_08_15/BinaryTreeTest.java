package com.pandas.learn.wj.practice_daily.prictice20_08_15;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author wangjing
 * @create 2020-08-15 10:40
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.substring(1, str.length()-1).split(",");

        BinaryTree binaryTree = new BinaryTree();

        for (int i = 0; i < strings.length; i++) {
            if(!strings[i].equals("null")) {
                binaryTree.insertNode(i, Integer.parseInt(strings[i]));
            }
        }

        // [5,1,4,2,null,3,6]测试这个是否插入正确
//        binaryTree.inOrder(binaryTree.root);
//        System.out.println();

        System.out.println(binaryTree.isSearchTree());
    }
}
