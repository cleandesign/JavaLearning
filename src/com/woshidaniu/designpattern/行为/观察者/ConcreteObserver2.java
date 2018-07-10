package com.woshidaniu.designpattern.行为.观察者;


/**
 * Created by kang on 2018/7/6.
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update(Observable o) {
        System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者2做出相应");
    }
}
