package com.zcc;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //将所有学生对象存入集合，默认初始无学生信息
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        //初始菜单
        System.out.println("-------------欢迎来到哈师大学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择（1~5）:");
        //定义一个循环让用户重复进行选择操作
        while(true){
            //定义一个循环接受用户输入的合法数据
            while(true){
                choose = sc.nextInt();
                if(choose < 1 || choose > 5){
                    System.out.println("没有此选项，请重新输入您的选择（1~5）：");
                } else {
                    switch(choose){
                        case 1 :
                            list = StudentUtil.addInfo(list);break;
                        case 2 :
                            ArrayList<Student> listCompare= StudentUtil.removeInfo(list);
                            if(listCompare.size() != list.size()){
                                list = listCompare;
                            }
                            break;
                        case 3 :
                            list = StudentUtil.setInfo(list);
                            break;
                        case 4 :
                            StudentUtil.getInfo(list);
                        default:
                            break;
                    }
                    break; //跳出内循环，进行下次输入
                }
            }
            if(choose == 5){
                break;   //用户退出，跳出大循环
            }
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择（1~5）:");
        }
    }
}
