package com.woshidaniu.designpattern.创建.工厂方法;

/**
 * Created by kang on 2018/7/6.
 */
public class TubeLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("TubeLight On");
    }

    @Override
    public void turnOff() {
        System.out.println("TubeLight Off");
    }
}
