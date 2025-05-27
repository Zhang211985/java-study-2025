package com.chensun.sport;
import java.util.Scanner;
public class PalindromeNumberChecker {
    public static void main(String[] args) {
        //键盘录入一个正整数，判断是不是回文数。
        //回文数：正着读和倒着读是一样的
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        //定义一个变量记录这个正整数
        int num = sc.nextInt();
        //定义一个中间变量记录正整数的值，因为num要参与计算，值会改变，不能用于后续比较
        int temp = num;
        //定义一个变量记录倒过来后的数字
        int count = 0;
        while (num != 0) {
            //定义一个变量为提取出来的数
            int a = num % 10;
            num = num / 10;
            count = count * 10 + a;
        }
        System.out.println(count == temp);
    }
}