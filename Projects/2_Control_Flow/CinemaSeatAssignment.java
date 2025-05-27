package com.chensun.cinema;
import java.util.Scanner;
public class CinemaSeatAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的电影票的票号");
        int ticket = sc.nextInt();
        //判断
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        } else {
            System.out.println("票号无效");
        }
    }
}