package com.zcc;
import java.util.Scanner;
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = {
            new Student("2022011541", "张晨晨", 21),
            new Student("2022025643", "张凌赫", 25),
            new Student("heima003", "小明", 20)
        };
        Student[] arr2 = new Student[arr.length + 1];

        System.out.println("请输入添加的学生的姓名 年龄：");
        String name = sc.next();
        int age = sc.nextInt();
        String idJudge = "heima002";
        Student s4 = new Student(idJudge, name, age);
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = s4;

        // 要求2：添加完毕之后，遍历所有学生信息。
        System.out.println("添加成功！学生信息为：");
        for (int i = 0; i < arr2.length; i++) {
            Student student = arr2[i];
            System.out.println(student.getId() + "," + student.getName() + "," + student.getAge());
        }

        // 要求3：通过id删除学生信息
        // 如果存在，则删除，如果不存在，则提示删除失败。
        System.out.println("请输入删除的学生的id：");
        String idJudge2 = sc.next();
        boolean flag2 = true;
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            Student student = arr2[i];
            if (idJudge2.equals(student.getId())) {
                flag2 = false;
                index = i;
                break;
            }
        }
        if (flag2) {
            System.out.println("删除失败。");
        } else {
            Student[] arr3 = new Student[arr2.length - 1];
            for (int i = 0, j = 0; i < arr2.length; i++) {
                Student student = arr2[i];
                if (i != index) {
                    arr3[j] = arr2[i];
                    j++;
                }
            }
            // 要求4：删除完毕之后，遍历所有学生信息。
            System.out.println("删除成功！学生信息为：");
            for (int i = 0; i < arr3.length; i++) {
                Student student = arr3[i];
                System.out.println(student.getId() + "," + student.getName() + "," + student.getAge());
            }

            // 查询数组id为"heima002"的学生，如果存在，则将他的年龄+1岁。
            boolean flag3 = false;
            for (int i = 0; i < arr3.length; i++) {
                Student student = arr3[i];
                if (student.getId().equals("heima002")) {
                    student.setAge(student.getAge() + 1);
                    System.out.println("修改成功！id为heima002的学生的年龄为：" + arr3[i].getAge());
                    flag3 = true;
                    break;
                }
            }
            if (!flag3) {
                System.out.println("查询失败！");
            }
        }
    }
}