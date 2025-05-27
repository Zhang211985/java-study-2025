package com.zcc;
public class ArrayUtil {
    private ArrayUtil() {}

    // 返回整数数组里的内容
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // 返回平均分
    public static double getAverage(double[] arr) {
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
}