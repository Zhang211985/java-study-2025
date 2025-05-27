package com.chensun.sport;
public class ArrayMaxFinder {
    public static void main(String[] args) {
        //已知数组中的元素为{33,5,22,44,55}
        //请找出数组中最大值并打印在控制台。

        //定义数组
        int[] arr = {30,5,22,44,23}; //arr.Length=5 索引0-4

        //定义一个变量记录数组的最大值
        int max = arr[0];

        //遍历数组中的数据寻找最大值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //输出最大值
        System.out.println("该数组的最大值为：" + max);
    }
}