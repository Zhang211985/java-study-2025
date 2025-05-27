package com.chensun.sport;
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        //键盘录入一个正整数x，判断该整数是不是质数。
        //质数：只能被1和本身整除。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");

        int x = sc.nextInt();
        boolean flag = true;
        if (x > 0) {
            for (int i = 2; i < x; i++) {
                //找出x的所有因数
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(x + "是一个质数。");
            } else {
                System.out.println(x + "不是一个质数。");
            }
        } else {
            System.out.println("该数不是正整数！");
        }
    }
}