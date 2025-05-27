package com;
import java.util.Random;
import java.util.Scanner;
public class LotteryChecker {
    public static void main(String[] args) {
        Random r = new Random();
        int[] redRightNumber = new int[6]; //定义一个数组记录红色球号码
        int[] already = new int[6];
        for (int i = 0; i < 6; ) {
            boolean flag = true;
            int randomNumber = r.nextInt(33) + 1;
            for (int j = 0; j < 6; j++) {
                if (randomNumber == already[j]) {
                    flag = false;
                }
            }
            if (flag) {
                redRightNumber[i] = randomNumber;
                already[i] = randomNumber;
                i++;
            }
        }
        int blueRightNumber = r.nextInt(16) + 1; //定义一个变量记录蓝色球号码
        //用户输入中奖号码
        Scanner sc = new Scanner(System.in);
        int blueScanNumber;
        System.out.println("请输入蓝色球号码：");
        while (true) {
            blueScanNumber = sc.nextInt();
            if (blueScanNumber >= 1 && blueScanNumber <= 16) {
                break;
            } else {
                System.out.println("不合法！请重新输入：");
            }
        }
        System.out.println("请输入红色球号码：");
        int[] redScanNumber = new int[6];
        int[] already2 = new int[6];
        for (int i = 0; i < 6; ) {
            boolean flag2 = true;
            redScanNumber[i] = sc.nextInt();
            if (redScanNumber[i] < 1 || redScanNumber[i] > 33) {
                System.out.println("不合法！请重新输入：");
            } else {
                for (int j = 0; j < 6; j++) {
                    if (already2[j] == redScanNumber[i]) {
                        flag2 = false;
                    }
                }
                if (flag2) {
                    already2[i] = redScanNumber[i];
                    i++;
                }
            }
        }
        int countRed = 0;
        boolean countBlue = false;
        if (blueScanNumber == blueRightNumber) {
            countBlue = true;
        }
        for (int i = 0; i < 6; i++) { //用户输入的红色球号码与中奖号码一一比对
            for (int j = 0; j < 6; j++) {
                if (redScanNumber[j] == redRightNumber[i]) {
                    countRed++;
                    redRightNumber[i] = 0;
                    break;
                }
            }
        }
        //中奖情况
        if (countBlue) {
            switch (countRed) {
                case 0:
                case 1:
                    System.out.println("恭喜您中六等奖5元！");
                    break;
                case 2:
                    System.out.println("恭喜您中五等奖5元！");
                    break;
                case 3:
                    System.out.println("恭喜您中五等奖10元！");
                    break;
                case 4:
                    System.out.println("恭喜您中四等奖200元！");
                    break;
                case 5:
                    System.out.println("恭喜您中三等奖3000元！");
                    break;
                case 6:
                    System.out.println("恭喜您中一等奖1000万元！");
                    break;
            }
        } else {
            switch (countRed) {
                case 4:
                    System.out.println("恭喜您中四等奖10元！");
                    break;
                case 5:
                    System.out.println("恭喜您中四等奖200元！");
                    break;
                case 6:
                    System.out.println("恭喜您中二等奖500万元！");
                    break;
                default:
                    System.out.println("很遗憾，您未能中奖。");
            }
        }
        System.out.print("红色球中奖号码为：");
        for (int i = 0; i < 6; i++) {
            System.out.print(redRightNumber[i] + " ");
        }
        System.out.println("\n蓝色球中奖号码为：" + blueRightNumber);
    }
}