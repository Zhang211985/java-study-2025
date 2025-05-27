package com.zcc;
import java.util.Scanner;
public class StringSymmetryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String strNew = new StringBuilder(str).reverse().toString();
        if (strNew.equals(str)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}