package com.zcc;
import java.util.Random;
public class FightingGame {
    private String name;
    private int blood;

    public FightingGame() {}

    public FightingGame(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void attack(FightingGame f) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;  // 生成伤害在1 - 20之间
        int remainBlood = f.getBlood() - hurt; // 计算剩余血量
        remainBlood = remainBlood < 0? 0 : remainBlood; // 如果负数，把负数改为0
        f.setBlood(remainBlood);
        System.out.println(this.getName() + "举起拳头打了" + f.getName() + "一下，造成了" + hurt + "点伤害，" + f.getName() + "还剩下" + f.getBlood() + "点血。");
    }
}