package com.chensun.sport;
public class EvenNumberSumCalculator {
    public static void main(String[] args) {
        //求1-100之间的偶数和
        //将1-100的数找到
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //找到1-100间的偶数
            if (i % 2 == 0) {
                //求和
                sum += i;
            }
        }
        System.out.println("1-100间的偶数和为：" + sum);
    }
}