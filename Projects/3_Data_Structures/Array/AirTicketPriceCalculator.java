package com.chensun.sport;
import java.util.Scanner;
public class AirTicketPriceCalculator {
    public static void main(String[] args) {
        //机票价格按照淡旺季、头等舱和经济舱收费
        // 输入机票原价、月份和头等舱或经济舱。
        // 按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折。
        // 淡季(11到来年4月)头等舱7折，经济舱6.5折。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price = sc.nextDouble();
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        System.out.println("头等舱请输入0，经济舱请输入1：");
        int seat = sc.nextInt();
        //case 穿透
        switch (month) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                price = getPrice(price, seat, 0.9, 0.85);
                break;
            default:
                price = getPrice(price, seat, 0.7, 0.65);
                break;
        }
        System.out.println("最终的机票价格为：" + price);
    }
    public static double getPrice(double price, int seat, double v, double v2) {
        if (seat == 0) {
            price = price * v;
        } else {
            price = price * v2;
        }
        return price;
    }
}