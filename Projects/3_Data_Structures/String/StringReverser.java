package com.zcc;
import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String result = strReverse(str);
        System.out.println("反转结果为：" + result);
    }
    public static String strReverse(String str) {
        if (str == null) {
            return "";
        } else {
            //定义一个字符记录反转的字符串元素
            String result = "";
            //倒着遍历字符串，将元素反转并拼接
            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                result = result + c;
            }
            return result;
        }
    }
}