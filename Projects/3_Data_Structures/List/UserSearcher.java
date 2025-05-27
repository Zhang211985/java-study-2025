package com.zcc;
import java.util.ArrayList;
import java.util.Scanner;
public class UserSearcher {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("heima001", "小明", "001");
        User u2 = new User("heima002", "小美", "002");
        User u3 = new User("heima003", "小华", "003");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean result = getSelect(list);
        System.out.println(result);
    }
    // 定义一个方法，根据ID查找对应的用户信息
    public static boolean getSelect(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id：");
        String id = sc.next();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String str = u.getId();
            if (id.equals(str)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}