package com.chensun.sport;
import java.util.Scanner;
public class SquareRootCalculator {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数 x ，计算并返回x的平方根。
        //结果保留整数部分，小数部分舍去。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        //定义一个变量记录键盘录入的值
        int x = sc.nextInt();
        //定义一个变量记录i的平方值
        int num = 0;
        //从1开始循环，直到找到满足平方>=x或x>=左的最大数。
        if (x >= 2) {
            for (int i = 1; i <= x; i++) {
                num = i * i;
                if (num == x) {
                    System.out.println("该整数的平方根就是：" + i);
                    break;
                }
                if (num > x) {
                    System.out.println("该整数的平方根的整数部分是：" + (i - 1));
                    break;
                }
            }
        } else {
            System.out.println("该数字不合法！");
        }
    }
}