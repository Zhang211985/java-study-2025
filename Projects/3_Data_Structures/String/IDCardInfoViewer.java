package com.zcc;
import java.util.Scanner;
public class IDCardInfoViewer {
    public static void main(String[] args) {
        // 用户输入身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        while (true) {
            String str = sc.next();
            if (str.length() != 18) {
                System.out.println("身份证号码有误，请重新输入：");
            } else {
                // 截取出出生年月日
                String year = str.substring(6, 10);
                String month = str.substring(10, 12);
                String day = str.substring(12, 14);
                System.out.println("人物信息为：");
                System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
                // 判断性别
                char c = str.charAt(16);
                int num = (int) c - 48;
                String gender = "";
                if (num % 2 == 0) {
                    gender = gender + "女";
                } else {
                    gender = gender + "男";
                }
                System.out.println("性别为：" + gender);
                break;
            }
        }
    }
}