package com.pandas.learn.zt.day09;
/*1.反转当前数组
        String[]strings={"ramer","jelly","bean","cake"};*/
public class Array {
//   反转数组
    public String[] invertArray(String[] strings){
        String[] arrayReversal = new String[strings.length];
        for (int i = 0; i <arrayReversal.length ; i++) {
            arrayReversal[i]=strings[strings.length-1-i];
        }
        return  arrayReversal;
    }
//    输出数组
    public void printArray(String[] strings){
        for (int i = 0; i <strings.length ; i++) {
            System.out.print(strings[i]+" ");
        }
    }
    public static void main(String[] args) {
        String[] strings={"ramer","jelly","bean","cake"};
        Array array = new Array();
        array.printArray(array.invertArray(strings));
    }
}
