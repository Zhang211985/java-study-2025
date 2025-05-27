package com.zcc;
public class ArrayToStringConnector {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = getStr(arr);
        System.out.print("[");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) {
                System.out.print(c);
            } else {
                System.out.print(c + ", ");
            }
        }
        System.out.println("]");
    }
    public static String getStr(int[] arr) {
        char[] chs = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            chs[i] = (char) (arr[i] + 48);
        }
        String s = new String(chs);
        return s;
    }
}