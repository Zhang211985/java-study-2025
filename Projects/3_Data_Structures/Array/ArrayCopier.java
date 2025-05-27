package com;
public class ArrayCopier {
    public static void main(String[] args) {
        //数组复制：将一个数组中的元素复制到一个新数组中去
        int[] arr = {1, 4, 6, 2, 90, 56};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}