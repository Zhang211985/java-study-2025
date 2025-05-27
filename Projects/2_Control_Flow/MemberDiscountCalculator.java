package com.chensun.cinema;
import java.util.Scanner;
public class MemberDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int memberGrade = sc.nextInt();
        int price = 1000;
        //判断
        if (memberGrade >= 1 && memberGrade <= 3) {
            if (memberGrade == 1) {
                System.out.println("您实际支付的钱应为：" + (price * 0.9));
            } else if (memberGrade == 2) {
                System.out.println("您实际支付的钱应为：" + (price * 0.8));
            } else if (memberGrade == 3) {
                System.out.println("您实际支付的钱应为：" + (price * 0.7));
            }
        } else {
            System.out.println("您实际支付的钱应为：" + price);
        }
    }
}