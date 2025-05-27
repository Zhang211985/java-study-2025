package com.zcc;
import static com.zcc.ArrayUtil.getAverage;
import static com.zcc.ArrayUtil.printArr;
public class ArrayUtilTester {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        String str = printArr(arr);
        System.out.println("整数数组的内容为：" + str);

        double[] num = {90.00, 93.75, 98.7};
        double avg = getAverage(num);
        System.out.println("平均分为：" + avg);
    }
}