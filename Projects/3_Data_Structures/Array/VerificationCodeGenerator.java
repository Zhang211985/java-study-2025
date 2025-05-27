package com.chensun;
import java.util.Random;
public class VerificationCodeGenerator {
    public static void main(String[] args) {
        // 需求:
        // 定义方法实现随机产生一个5位的验证码
        // 验证码格式:
        // 长度为5
        // 前四位是大写字母或者小写字母
        // 最后一位是数字
        char[] chs = new char[52];
        // 没有固定规律，将大小写字母都存入数组中
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (i + 97);
            } else {
                chs[i] = (char) (i + 65 - 26);
            }
        }
        // 随机抽取四次，拼接在一起
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(52);
            result = result + chs[randomIndex];
        }
        // 随机生成一个数字
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}