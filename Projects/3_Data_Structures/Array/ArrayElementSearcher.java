package com.chensun.sport;
import java.util.Scanner;
public class ArrayElementSearcher {
    public static void main(String[] args) {
        //定义一个方法，判断数组中是否有这个数，将结果返回给调用处
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        int[] arr = {23, 56, 77, 48, 90};
        boolean result = getNumber(arr, number);
        if (result) {
            System.out.println("该数存在于数组中。");
        } else {
            System.out.println("该数不存在于数组中。");
        }
    }
    public static boolean getNumber(int[] arr, int number) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = true;
            }
        }
        return flag;
    }
}