package com.zcc;
import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int countNum = 0;
        int countSmall = 0;
        int countBig = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                countNum++;
            } else if (c >= 'A' && c <= 'Z') {
                countBig++;
            } else {
                countSmall++;
            }
        }
        System.out.println("大写字母字符有" + countBig + "个，小写字母字符有" + countSmall + "个，数字字符有" + countNum + "个。");
    }
}