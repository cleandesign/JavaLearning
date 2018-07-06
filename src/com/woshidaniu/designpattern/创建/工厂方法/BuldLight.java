package com.woshidaniu.designpattern.创建.工厂方法;

/**
 * Created by kang on 2018/7/6.
 */
public class BuldLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("BuldLight On");
    }

    @Override
    public void turnOff() {
        System.out.println("BuldLight Off");
    }
}
