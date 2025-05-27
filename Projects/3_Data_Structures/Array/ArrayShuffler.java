package com.chensun.sport;
import java.util.Random;
public class ArrayShuffler {
    public static void main(String[] args) {
        //定义一个数组，存入1-5。要求打乱数组中所有数据的顺序
        //采用Fisher-Yates洗牌算法
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}