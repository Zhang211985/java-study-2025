package com.zcc;
import java.util.Scanner;
public class ArrayToStringFormatter {
    public static void main(String[] args) {
        // 键盘输入数组元素
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入int数组元素个数：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        if (arr != null && arr.length != 0) {
            System.out.println("请输入int数组元素，以空格分隔：");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
        String result = arrToString(arr);
        System.out.println(result);
    }
    // 定义方法拼接字符串
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    result = result + arr[i];
                } else {
                    result = result + arr[i] + ", ";
                }
            }
            result = result + "]";
            return result;
        }
    }
}