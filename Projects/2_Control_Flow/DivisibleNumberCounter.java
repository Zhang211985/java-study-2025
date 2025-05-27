package com.chensun.sport;
import java.util.Scanner;
public class DivisibleNumberCounter {
    public static void main(String[] args) {
        //键盘录入两个数字表示范围
        //统计这个范围中，既能被3整除，又能被5整除的数字有多少个。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入左边界：");
        int leftNumber = sc.nextInt();
        System.out.println("请输入右边界：");
        int rightNumber = sc.nextInt();
        int sum = 0;
        for (int i = leftNumber; i <= rightNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;
            }
        }
        System.out.println("既能被3整除，又能被5整除的数字有" + sum + "个");
    }
}