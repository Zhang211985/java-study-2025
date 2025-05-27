package com.chensun.sport;
public class PaperFoldingCount {
    public static void main(String[] args) {
        //珠穆朗玛峰的高度是8844430mm
        //我现在有一张纸，厚度为0.1mm(纸足够大)
        //问折多少次能折成珠穆朗玛峰的高度

        //分析，我不知道次数和范围，我只知道结束条件，用while循环。
        //定义一个变量用来计数。
        int count = 0;
        int height = 8844430;
        //定义一个变量用来记录当前纸的厚度。
        double i = 0.1;
        while (i <= height) {
            count++;
            i *= 2;
        }
        System.out.println("折了" + count + "次");
    }
}