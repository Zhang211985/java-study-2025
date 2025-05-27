package com.chensum.math;

import java.util.Scanner;

public class NumberDigitExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int number = sc.nextInt();
        
        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int one = (number % 100) % 10;
        
        System.out.println("个位是: " + one);
        System.out.println("十位是: " + ten);
        System.out.println("百位是: " + hundred);
    }
}