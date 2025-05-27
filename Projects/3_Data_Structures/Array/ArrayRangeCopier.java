package com.chensun.sport;
import java.util.Scanner;
public class ArrayRangeCopier {
    public static void main(String[] args) {
        //复制数组
        /*需求: 定义一个方法 copyOfRange(int arr, int from, int to)
        功能:将数组arr中，从索引from(包含from)开始,到索引to结束(不包含to)
        的元素复制到新数组中，将新数组返回*/
        int[] arr = {39, 24, 56, 28, 35, 65, 97, 58}; //0-7
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的索引值：");
        int from = sc.nextInt();
        System.out.println("请输入结束的索引值：");
        int to = sc.nextInt();
        if (from < 0 || to > arr.length - 1 || from >= to) {
            System.out.println("非法索引！");
        } else {
            int[] arr2 = copyOfRange(arr, from, to);
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] arr2 = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++) {
            arr2[j] = arr[i];
        }
        return arr2;
    }
}