package com.chensun.math;
public class TrafficLightLogic {
    public static void main(String[] args) {
        //true表示灯亮，false表示灯灭。
        boolean isLightRed = true;
        boolean isLightYellow = false;
        boolean isLightGreen = false;
        //判断
        if (isLightRed) {
            System.out.println("Stop!");
        }
        if (isLightYellow) {
            System.out.println("Slow!");
        }
        if (isLightGreen) {
            System.out.println("Go go go!");
        }
    }
}