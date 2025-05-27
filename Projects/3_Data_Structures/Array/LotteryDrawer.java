package com;
import java.util.Random;
public class LotteryDrawer {
    public static void main(String[] args) {
        //一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        // 请使用代码模拟抽奖打印出每个奖项，奖项的出现顺序要随机且不重复。
        Random r = new Random();
        int[] money = {2, 588, 888, 1000, 10000};
        int temp = 0;
        for (int i = money.length - 1; i >= 0; i--) {
            int randomIndex = r.nextInt(i + 1);
            temp = money[i];
            money[i] = money[randomIndex];
            money[randomIndex] = temp;
        }
        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i] + "的奖金被抽出。");
        }
    }
}