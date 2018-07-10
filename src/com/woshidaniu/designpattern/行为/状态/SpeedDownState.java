package com.woshidaniu.designpattern.行为.状态;

/**
 * Created by kang on 2018/7/8.
 */
public class SpeedDownState implements RunState{

    public void run(Hero hero) {
        System.out.println("--------------减速跑动---------------");
        try {
            Thread.sleep(4000);//假设减速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------减速状态结束，变为正常状态------");
    }

}