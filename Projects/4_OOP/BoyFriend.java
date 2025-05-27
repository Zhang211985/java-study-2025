package com.zcc;
public class BoyFriend {
    private String name;
    private int age;
    private String gender;

    public BoyFriend() {}

    public BoyFriend(int age, String name, String gender) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法输入！");
        }
        this.name = name;
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法输入！");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}