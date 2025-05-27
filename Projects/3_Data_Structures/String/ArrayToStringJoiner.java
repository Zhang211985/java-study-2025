package com.zcc;
import java.util.Scanner;
public class ArrayToStringJoiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("请输入数组元素，以空格为分隔：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder().append("[");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = sb.append(arr[i]).append("]").toString();
            } else {
                sb.append(result).append(arr[i]).append(", ");
            }
        }
        System.out.println(result);
    }
}