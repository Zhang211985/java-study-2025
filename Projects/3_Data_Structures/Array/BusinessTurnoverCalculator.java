package com;
public class BusinessTurnoverCalculator {
    public static void main(String[] args) {
        int[][] price = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int[] priceQuarter = new int[4];
        int sumYear = 0;
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                priceQuarter[i] = priceQuarter[i] + price[i][j];
            }
            sumYear = sumYear + priceQuarter[i];
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + (i + 1) + "个季度的总营业额为：" + priceQuarter[i] + "万元");
        }
        System.out.println("全年的总营业额为：" + sumYear + "万元");
    }
}