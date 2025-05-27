package com;
import java.util.Scanner;
public class ContestantScoreCalculator {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        // 选手的最后得分为:
        // 去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        Scanner sc = new Scanner(System.in);
        // 输入6个0-100之间的随机数存到数组中,并求和
        int[] grade = new int[6];
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            System.out.println("请输入评委打分：");
            int randomGrade = sc.nextInt();
            if (randomGrade >= 0 && randomGrade <= 100) {
                grade[i] = randomGrade;
                sum = sum + grade[i];
            } else {
                System.out.println("该评分不合法！请重新打分：");
                randomGrade = sc.nextInt();
                grade[i] = randomGrade;
                sum = sum + grade[i];
            }
        }
        // 找出数组中最高分和最低分
        int max = grade[0];
        int min = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] < min) {
                min = grade[i];
            } else if (grade[i] > max) {
                max = grade[i];
            }
        }
        // 计算(6 - 2) / 4为选手最终得分
        double result = 0;
        result = (sum - max - min) / 4.0;
        System.out.println("该选手最终得分为：" + result);
    }
}