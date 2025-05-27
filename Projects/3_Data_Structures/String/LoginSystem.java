package com.zcc;
public class LoginSystem {
    public static void main(String[] args) {
        //定义正确用户名与密码
        String correctId = "heima002";
        String correctPassword = "zcc985";
        //用户输入
        int index = 3;
        boolean flag = false;
        while (index > 0) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            //进行判断
            if (username.equals(correctId) && password.equals(correctPassword)) {
                flag = true;
                System.out.println("登录成功！欢迎用户" + username);
                break;
            } else {
                index--;
                if (index != 0) {
                    System.out.println("用户名或密码错误，您还剩下" + index + "次机会，请重新输入：");
                }
            }
        }
        if (!flag) {
            System.out.println("登录失败！");
        }
    }
}