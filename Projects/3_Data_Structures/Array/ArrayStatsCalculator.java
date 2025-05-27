package com.chensun.sport;
import java.util.Random;
public class ArrayStatsCalculator {
    public static void main(String[] args) {
        //遍历数组求和：
        //需求:生成10个1-100之间的随机数存入数组。
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;
        int avg = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\n所有数据的和为：" + sum);

        // 2) 求所有数据的平均数
        avg = sum / 10;
        System.out.println("所有数据的平均数为：" + avg);

        // 3) 统计有多少个数据比平均值小
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("有" + count + "个数据小于平均值");
    }
}