package com.woshidaniu.designpattern.行为.状态;



/**
 * Created by kang on 2018/7/8.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("");
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(5000);
        hero.setState(Hero.SPEED_DOWN);
        Thread.sleep(5000);
        hero.setState(Hero.SWIM);
        Thread.sleep(5000);
        hero.stopRun();
    }
}
