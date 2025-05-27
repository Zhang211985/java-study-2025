package com.zcc;
public class BoyFriendInfoManager {
    public static void main(String[] args) {
        BoyFriend bfr = new BoyFriend(30, "张凌赫", "男");
        System.out.println(bfr.getAge());
        System.out.println(bfr.getName());
        System.out.println(bfr.getGender());

        bfr.setAge(28);
        System.out.println(bfr.getAge());
    }
}