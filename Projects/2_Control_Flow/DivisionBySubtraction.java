package com.chensun.sport;
public class DivisionBySubtraction {
    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 3;
        //不用*/%，求出num1和num2的商和余数
        //用减法，看减了多少次减不了了，记录次数为商，剩下的数为余数。
        //定义一个变量记录商
        int shang = 0;
        while (num1 >= num2) {
            num1 -= num2;
            shang++;
        }
        System.out.println("商为" + shang + ',' + "余数为" + num1);
    }
}