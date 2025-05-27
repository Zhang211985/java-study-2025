package com.zcc;
public class FightingGameSimulator {
    public static void main(String[] args) {
        FightingGame f1 = new FightingGame("乔峰", 100);
        FightingGame f2 = new FightingGame("鸠摩智", 100);
        while (true) {
            f1.attack(f2);
            if (f2.getBlood() == 0) {
                System.out.println(f1.getName() + "KO了" + f2.getName());
                break;
            }
            f2.attack(f1);
            if (f1.getBlood() == 0) {
                System.out.println(f2.getName() + "KO了" + f1.getName());
                break;
            }
        }
    }
}