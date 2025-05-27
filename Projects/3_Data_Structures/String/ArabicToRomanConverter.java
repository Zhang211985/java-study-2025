package com.zcc;
import java.util.Scanner;
public class ArabicToRomanConverter {
    public static void main(String[] args) {
        System.out.println("请输入一个数字字符串：");
        String str = getStr();
        String result = getRomanNumber(str);
        System.out.println("罗马数字为：" + result);
    }
    // 定义一个方法获取合法的字符串
    public static String getStr() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            str = sc.next();
            if (str.length() > 9) {
                System.out.println("长度超出限制！请重新输入：");
            } else {
                boolean flag = true;
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (c < '0' || c > '9') {
                        System.out.println("包含非数字字符！请重新输入：");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        return str;
    }
    // 定义一个方法将内容变成罗马数字
    public static String getRomanNumber(String str) {
        // 定义一个罗马数字数组 - 查表法
        String[] romanNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(romanNumber[c - '0']).append(" ");
        }
        return sb.toString();
    }
}