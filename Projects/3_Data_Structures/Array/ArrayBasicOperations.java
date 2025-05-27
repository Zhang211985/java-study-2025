package com.chensun.sport;
public class ArrayBasicOperations {
    public static void main(String[] args) {
        //打印数组地址
        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1);

        //获取数组中的第一个元素1
        int num = arr1[0];
        System.out.println("数组的第一个元素是：" + num);

        //获取数组中第二个元素2
        System.out.println(arr1[1]);

        //存储数据100，覆盖元素5
        System.out.println(arr1[4]);
        arr1[4] = 100;
        System.out.println(arr1[4]);
    }
}