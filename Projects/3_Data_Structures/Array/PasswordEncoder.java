package com;
public class PasswordEncoder {
    public static void main(String[] args) {
        //某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
        // 规则如下:
        // 先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
        int password = 1983;
        int[] number = new int[4];
        for (int i = 3; i >= 0; i--) {
            number[i] = (password % 10 + 5) % 10;
            password = password / 10;
        }
        int[] newNumber = new int[4];
        for (int i = 0, j = number.length - 1; i < number.length; i++, j--) {
            newNumber[j] = number[i];
        }
        System.out.print("新数是：");
        for (int i = 0; i < newNumber.length; i++) {
            System.out.print(newNumber[i]);
        }
    }
}