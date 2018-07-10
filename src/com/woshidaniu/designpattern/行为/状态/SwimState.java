package com.woshidaniu.designpattern.行为.状态;

/**
 * Created by kang on 2018/7/8.
 */
public class SwimState implements RunState{

    public void run(Hero hero) {
        System.out.println("--------------不能跑动---------------");
        try {
            Thread.sleep(2000);//假设眩晕持续2秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------眩晕状态结束，变为正常状态------");
    }

}