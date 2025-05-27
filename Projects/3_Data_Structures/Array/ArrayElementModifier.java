package com.chensun.sport;
public class ArrayElementModifier {
    public static void main(String[] args) {
        /*
        如果是奇数，则将当前数字扩大两倍，如果是偶数，则将当前数字变成二分之一
        */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //循环遍历得到并且修改数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 0.5;
            } else {
                arr[i] *= 2;
            }
        }
        //遍历打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}