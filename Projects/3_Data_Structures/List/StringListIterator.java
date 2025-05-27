package com.zcc;
import java.util.ArrayList;
public class StringListIterator {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        // 添加字符串
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        // 进行遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(str);
            } else {
                System.out.print(str + ", ");
            }
        }
        System.out.println("]");
    }
}