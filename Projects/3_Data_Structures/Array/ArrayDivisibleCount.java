package com.chensun.sport;
public class ArrayDivisibleCount {
    public static void main(String[] args) {
        //遍历数组，统计数组中一共有多少个能被3整除的数字
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("该数组中一共有" + count + "个能被3整除的数");
    }
}