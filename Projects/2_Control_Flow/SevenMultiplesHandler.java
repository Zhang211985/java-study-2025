package com.chensun.sport;
public class SevenMultiplesHandler {
    public static void main(String[] args) {
        //逢七过：从任意一个数字开始报数，逢七或七的倍数，要说“过”。
        //要求打印出1-100中满足逢七必过的数据。
        //个位是7，十位是7，是7或7的倍数
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 7 || i % 7 == 0 || i / 10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}