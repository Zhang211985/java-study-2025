package com.zcc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserUtil {

    private UserUtil(){}

    //注册
    public static ArrayList<User> register(ArrayList<User> list){
        User u = new User();
        //获取用户名
        String username = getCorrectUsername(list);
        u.setUsername(username);
        //获取密码
        String password = getCorrectPassword();
        u.setPassword(password);
        //获取身份证号
        String idCardNumber = getCorrectIdCardNumber();
        u.setIdCardNumber(idCardNumber);
        //获取手机号
        String telephoneNumber = getCorrectTelephoneNumber();
        u.setTelephoneNumber(telephoneNumber);
        list.add(u);
        System.out.println("注册成功！");
        return list;
    }
    //登录
    public static int login(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        boolean judge = usernameJudge(list , username);
        if(judge){
            int index = getCorrespondUserIndex(list , username);
            User u = list.get(index);
            String password = u.getPassword();
            System.out.println("请输入密码：");
            boolean flag = false;
            for (int i = 0; i < 3; i++) {
                String s = sc.next();
                if(s.equals(password)){
                    flag = true;
                    break;
                } else {
                    if(i != 2){
                        System.out.println("密码错误！请重新输入。你还有"+ (2 - i) + "次机会：");
                    } else {
                        System.out.println("密码错误！超过限制次数，已锁定。");
                    }
                }
            }
            if(flag){
                while(true){
                    String code = getCode();
                    System.out.println("验证码为：" + code);
                    System.out.println("请输入验证码：");
                    String str = sc.next();
                    if(str.equals(code)){
                        break;
                    }
                }
                System.out.println("登录成功！");
                return 1;
            } else {
                return -1;
            }
        } else {
            System.out.println("用户名未注册，请先注册!");
            return -1;
        }

    }
    //忘记密码
    public static ArrayList<User> setPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        boolean flag = usernameJudge(list , username);
        if(flag){
            int index = getCorrespondUserIndex(list , username);
            User u = list.get(index);
            System.out.println("请输入身份证号码：");
            String s = sc.next();
            String idCardNumber = u.getIdCardNumber();
            if(s.equals(idCardNumber)){
                System.out.println("请输入手机号码：");
                String s2 = sc.next();
                String telephoneNumber = u.getTelephoneNumber();
                if(s2.equals(telephoneNumber)){
                    System.out.println("请输入新密码：");
                    String password = sc.next();
                    u.setPassword(password);
                    System.out.println("修改成功！");
                } else {
                    System.out.println("账号信息不匹配，修改失败。");
                }
            } else {
                System.out.println("账号信息不匹配，修改失败。");
            }
        } else {
            System.out.println("用户名未注册，请先注册！");
        }
        return list;
    }

    //判断用户名是否正确，返回正确用户名
    public static String getCorrectUsername(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String str = "";
        while(true){
            boolean flag = false;
            str = sc.next();
            for (int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    flag = true;
                }
            }
            if(str.length() < 3 || str.length() >15){
                System.out.println("用户名长度不合法！请重新输入：");
            } else if(!flag){
                System.out.println("用户名不能是纯数字！请重新输入：");
            } else if(usernameJudge(list , str)){
                System.out.println("用户名已存在！请重新输入：");
            } else {
                break;
            }
        }
        return str;
    }
    //判断用户名是否存在
    public static boolean usernameJudge(ArrayList<User> list , String username){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String s = u.getUsername();
            if(username.equals(s)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    //判断身份证号是否正确，并返回正确的身份证号码
    public static String getCorrectIdCardNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String idCardNumber = "";
        while(true){
            idCardNumber = sc.next();
            boolean flag = false;
            for (int i = 0; i < 17; i++) {
                char c = idCardNumber.charAt(i);
                if(c < '0' && c >'9'){
                    flag = true;
                    break;
                }
            }
            if(idCardNumber.length() != 18){
                System.out.println("身份证号码有误！请重新输入：");
            } else if(idCardNumber.charAt(0) == 0){
                System.out.println("身份证号码有误！请重新输入：");
            } else if(flag){
                System.out.println("身份证号码有误！请重新输入：");
            } else if((idCardNumber.charAt(17) < '0' || idCardNumber.charAt(17) > '9')
                    && (idCardNumber.charAt(17) != 'X') && (idCardNumber.charAt(17) != 'x')){
                System.out.println("身份证号码有误！请重新输入：");
            } else {
                break;
            }
        }
        return idCardNumber;
    }
    //判断手机号是否正确，并返回正确的手机号
    public static String getCorrectTelephoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String telephoneNumber = "";
        while (true) {
            telephoneNumber = sc.next();
            boolean flag = false;
            for (int i = 0; i < telephoneNumber.length(); i++) {
                char c = telephoneNumber.charAt(i);
                if (c < '0' && c > '9') {
                    flag = true;
                    break;
                }
            }
            if (telephoneNumber.length() != 11) {
                System.out.println("手机号输入有误！请重新输入：");
            } else if (telephoneNumber.charAt(0) == 0) {
                System.out.println("手机号输入有误！请重新输入：");
            } else if (flag) {
                System.out.println("手机号输入有误！请重新输入：");
            } else {
                break;
            }
        }
        return telephoneNumber;
    }
    //给正确的用户名，查找对应用户
    public static int getCorrespondUserIndex(ArrayList<User> list , String username){
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String s = u.getUsername();
            if(s.equals(username)){
                index = i;
                break;
            }
        }
        return index;
    }
    //判断两次密码是否输入一致，并返回正确密码
    public static String getCorrectPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请设置密码：");
        String s1 = "";
        while(true){
            s1 = sc.next();
            System.out.println("请再次输入密码：");
            String s2 = sc.next();
            if(s1.equals(s2)){
                break;
            } else {
                System.out.println("密码输入不一致！请重新设置密码：");
            }
        }
        return s1;
    }
    //生成一个正确的验证码
    public static String getCode(){
        String str = "";
        Random r = new Random();
        char[] c = new char[52];
        for (int i = 0; i < 26; i++) {
            c[i] = (char)(65 + i);
        }
        for(int i = 26; i < 52; i++){
            c[i] = (char)(97 + i  - 26);
        }
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);  //0~52
            str = str + c[index];
        }
        //将最后一个索引定义为随机数字   //生成随机数字
        int number = r.nextInt(10);
        str = str + number;
        return str;
    }

}
