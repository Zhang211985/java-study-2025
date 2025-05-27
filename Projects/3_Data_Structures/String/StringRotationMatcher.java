package com.zcc;
public class StringRotationMatcher {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "deabc";
        if (A.equals(B)) {
            System.out.println("True");
        } else {
            String str = A;
            int count = 0;
            Boolean result = false;
            while (count < str.length() - 1) {
                str = getMove(str);
                count++;
                result = getCompare(str, B);
                if (result) {
                    break;
                }
            }
            System.out.println(result);
            if (result) {
                System.out.println("第" + count + "次调整之后，A成功变成了B。");
            }
        }
    }
    // 定义一个方法进行字符串的旋转操作
    public static String getMove(String str) {
        char first = str.charAt(0);
        String newStr = str.substring(1) + first;
        return newStr;
    }
    // 定义一个方法比较两个字符串是否相等
    public static Boolean getCompare(String str, String target) {
        return str.equals(target);
    }
}