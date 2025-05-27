package com.zcc;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentUtil {

    private StudentUtil(){}

    //添加学生信息方法
    public static ArrayList<Student> addInfo(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加的学生信息：");
        Student s = new Student();
        //判断学生id是否唯一
        //先全部接收，id暂不赋值
        String id = sc.next();
        s.setName(sc.next());
        s.setAge(sc.nextInt());
        s.setAddress(sc.next());
        //看List中是否为空，若是，则直接存
        if(list == null) {
            s.setId(id);
            System.out.println("添加成功！");
        } else {
            while(true){
                //遍历list中每个对象的id值，看是否重复
                boolean flag = false;
                for (int i = 0; i < list.size(); i++) {
                    Student stu = list.get(i);
                    String compareId = stu.getId();
                    if(compareId.equals(id)){
                        System.out.println("id重复，请重新输入学生id：");
                        flag = true;
                        id = sc.next();
                    }
                }
                if(!flag){
                    s.setId(id);
                    System.out.println("添加成功！");
                    break;
                }
            }
        }
        list.add(s);
        return list;
    }

    //删除学生信息方法
    public static ArrayList<Student> removeInfo(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除的学生id：");
        String id = sc.next();
        //判断id是否存在于集合的对象中
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String compareId = stu.getId();
            if(compareId.equals(id)){
                list.remove(stu);
                System.out.println("删除成功！");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("id不存在！");
        }
        return list;
    }

    //修改功能
    public static ArrayList<Student> setInfo(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id：");
        String id = sc.next();
        //判断id是否存在于集合的对象中
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String compareId = stu.getId();
            if(compareId.equals(id)){
                index = i;
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("id不存在！");
        } else {
            System.out.println("修改学生" + id + "的 id/姓名/年龄/家庭住址？");
            while(true){
                String choose = sc.next();
                if(!choose.equals("id") && !choose.equals("姓名") && !choose.equals("年龄") && !choose.equals("家庭住址")){
                    System.out.println("输入非法！请重新输入：");
                } else {
                    switch(choose){
                        case "id":
                            System.out.println("请输入修改后的id：");
                            while(true){
                                boolean flag2 = false;
                                String idSet = sc.next();
                                //查找要修改的id是否已存在
                                for (int i = 0; i < list.size(); i++) {
                                    Student stu = list.get(i);
                                    String idCompare = stu.getId();
                                    if(idCompare.equals(idSet)){
                                        System.out.println("id已存在！请重新输入id：");
                                        flag2 = true;
                                        break; //存在了，不用查了，重新输入
                                    }
                                }
                                if(!flag2){
                                    list.get(index).setId(idSet);
                                    System.out.println("修改成功！");
                                    flag2 = true;
                                    break;  // 修改成功，退出循环
                                }
                            }
                            break; //switch语句的break
                        case "姓名":
                            System.out.println("请输入修改后的姓名：");
                            String nameSet = sc.next();
                            list.get(index).setName(nameSet);
                            System.out.println("修改成功！");
                            break;
                        case "年龄":
                            System.out.println("请输入修改后的年龄：");
                            int ageSet = sc.nextInt();
                            list.get(index).setAge(ageSet);
                            System.out.println("修改成功！");
                            break;
                        case "家庭住址":
                            System.out.println("请输入修改后的家庭住址：");
                            String addressSet = sc.next();
                            list.get(index).setAddress(addressSet);
                            System.out.println("修改成功！");
                    }
                    break;
                }
            }
        }
        return list;
    }

    //查询功能
    public static void getInfo(ArrayList<Student> list){
        if(list == null){
            System.out.println("当前无学生信息，请添加后再查询！");
        } else {
            System.out.println("id" + " " + "姓名" + " " + "年龄" + " " + "家庭住址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge() + " " + stu.getAddress());
            }
        }
    }
}
