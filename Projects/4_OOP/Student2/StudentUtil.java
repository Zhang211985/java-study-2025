package com.zcc;
import java.util.ArrayList;
public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAge(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}