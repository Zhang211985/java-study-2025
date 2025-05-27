package com.zcc;
public class StringNumberMultiplier {
    public static void main(String[] args) {
        /*给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
          注意: 需要用已有的知识完成。*/
        String str1 = "12345678";
        String str2 = "1234";
        int[] arr1 = strArrayChange(str1);
        int[] arr2 = strArrayChange(str2);
        long num1 = arrayLongChange(arr1);
        long num2 = arrayLongChange(arr2);
        long mul = getMultiplication(num1, num2);
        int[] arr3 = intArrayChange(mul);
        String result = arrayStrChange(arr3);
        System.out.println(result);
    }
    // 定义一个方法将字符串形式表示的整数转换成整数数组形式
    public static int[] strArrayChange(String str) {
        // 定义一个整数数组接受转换后的数据
        int[] num = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            num[i] = c - '0';
        }
        return num;
    }
    // 定义一个方法将整数数组转换为整数
    public static long arrayLongChange(int[] arr) {
        long sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
        }
        return sum;
    }
    // 定义一个方法求两个整数的乘积
    public static long getMultiplication(long num1, long num2) {
        long mul = num1 * num2;
        return mul;
    }
    // 定义一个方法将整数转换整数数组
    public static int[] intArrayChange(long num) {
        // 得到整数的位数
        int count = 0;
        long temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        // 定义整数数组
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (num > 0) {
            arr[index] = (int) (num % 10);
            num = num / 10;
            if (index != 0) {
                index--;
            }
        }
        return arr;
    }
    // 定义一个方法将整数数组转换成字符串形式
    public static String arrayStrChange(int[] arr) {
        char[] chs = new char[arr.length];
        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char) (arr[i] + '0');
        }
        // 将字符数组转换成字符串
        String s = new String(chs);
        return s;
    }
}