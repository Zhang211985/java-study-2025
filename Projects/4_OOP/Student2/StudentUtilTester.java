package com.zcc;
import java.util.ArrayList;
public class StudentUtilTester {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("小明", 17, "男");
        Student s2 = new Student("小美", 18, "女");
        Student s3 = new Student("小华", 19, "男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int ageMax = StudentUtil.getMaxAge(list);
        System.out.println("最大学生年龄为：" + ageMax);
    }
}