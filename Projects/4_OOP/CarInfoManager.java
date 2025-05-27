package com.zcc;
import java.util.Scanner;
public class CarInfoManager {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三辆车的品牌，以空格分开：");
        c1.setBrand(sc.next());
        c2.setBrand(sc.next());
        c3.setBrand(sc.next());
        System.out.println("请输入三辆车的价格，以空格分开：");
        c1.setPrice(sc.nextDouble());
        c2.setPrice(sc.nextDouble());
        c3.setPrice(sc.nextDouble());
        System.out.println("请输入三辆车的颜色，以空格分开：");
        c1.setColor(sc.next());
        c2.setColor(sc.next());
        c3.setColor(sc.next());
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}