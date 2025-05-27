package com.chensun.sport;
import java.util.Random;
import java.util.Scanner;
public class 、 {
    public static void main(String[] args) {
        //猜数字小游戏：系统随机生成一个数字1-100，用户猜这个数字是什么。
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("请输入您猜的数字");
            int guess = sc.nextInt();
            if (guess < number) {
                System.out.println("猜小了");
            } else if (guess > number) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}