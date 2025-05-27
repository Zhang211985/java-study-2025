package com.zcc;
import java.util.ArrayList;
public class PhoneFilter {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneList = getInfo(list);
        if (phoneList == null) {
            System.out.println("没有手机的价格低于3000元。");
        } else {
            for (int i = 0; i < phoneList.size(); i++) {
                Phone p = phoneList.get(i);
                System.out.println(p.getBrand() + p.getPrice());
            }
        }
    }
    // 定义一个方法，将价格低于3000的手机信息返回
    public static ArrayList<Phone> getInfo(ArrayList<Phone> list) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                phoneList.add(p);
            }
        }
        return phoneList;
    }
}