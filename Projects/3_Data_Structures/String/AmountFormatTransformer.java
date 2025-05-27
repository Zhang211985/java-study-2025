package com.zcc;
import java.util.Scanner;
public class AmountFormatTransformer {
    public static void main(String[] args) {
        // 金额反转
        // 键盘录入一个整数（小于等于7位）
        Scanner sc = new Scanner(System.in);
        // 定义数组存入每位数字元素
        int[] number = new int[7];  // 索引0~6
        System.out.println("请输入整数金额：");
        while (true) {
            int num = sc.nextInt();
            if (num < 0 || num > 9999999) {
                System.out.println("数值错误！请重新输入：");
            } else {
                int index = number.length - 1;
                int count = 0;
                // 并把每位数字存入数组
                while (num != 0) {
                    int ge = num % 10;
                    number[index] = ge;
                    num = num / 10;
                    index--;
                }
                amountReversal(number);
                break;
            }
        }
    }
    // 定义一个方法实现金额反转
    public static void amountReversal(int[] number) {
        // 定义一个数组记录汉字
        String chinese = "佰拾万千佰拾元";
        // 将num数组中的小写数字转换为大写存入字符串
        String str = arrConvert(number);
        // 定义一个字符串记录反转金额
        String result = "";
        // 遍历两个字符串，穿插拼接
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = chinese.charAt(i);
            result = result + c1 + c2;
        }
        System.out.println(result);
    }
    // 定义一个方法将数字从小写转换为大写
    public static String arrConvert(int[] number) {
        String numberBig = "";
        // 查表法：定义一个大写数字字符串，根据索引对应查找。
        String big = "零壹贰叁肆伍陆柒捌玖";
        for (int i = 0; i < number.length; i++) {
            numberBig = numberBig + big.charAt(number[i]);
        }
        return numberBig;
    }
}