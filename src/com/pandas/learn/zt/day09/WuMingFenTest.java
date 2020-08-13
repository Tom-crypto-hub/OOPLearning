package com.pandas.learn.zt.day09;

public class WuMingFenTest {
    public static void main(String[] args) {
        WuMingFen fen1 = new WuMingFen("牛肉", 3, true);
        WuMingFen fen2 = new WuMingFen("牛肉", 2);
        WuMingFen fen3 = new WuMingFen();
        fen3.setTheMa("酸辣面码");
        fen3.setQuantity(2);
        fen3.setLikeSoup(true);
        fen1.check();
        fen2.check();
        fen3.check();
    }
}
