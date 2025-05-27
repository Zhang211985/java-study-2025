package com.chensun.sport;
public class RectangleAreaComparator {
    public static void main(String[] args) {
        //定义一个方法，比较长方形的面积
        int area1 = getArea(10, 20);
        int area2 = getArea(30, 20);
        String result = area1 > area2? "第一个长方形更大" : "第二个长方形更大";
        System.out.println(result);
    }
    public static int getArea(int len, int width) {
        int area = len * width;
        return area;
    }
}