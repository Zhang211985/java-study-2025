package com.chensun;
public class PrimeNumberFinder {
    public static void main(String[] args) {
        //判断101-200间有多少个质数，并输出所有质数
        int count = 0;
        int[] arr = new int[100];
        int n = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
                arr[n] = i;
                n++;
            }
        }
        System.out.println("有" + count + "个质数，分别为：");
        for (int i = 0; i < 100; i++) {
            if (i < n - 1) {
                System.out.print(arr[i] + ",");
            } else if (i == n - 1) {
                System.out.print(arr[i]);
            }
        }
    }
}