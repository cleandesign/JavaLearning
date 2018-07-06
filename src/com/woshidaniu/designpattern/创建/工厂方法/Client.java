package com.woshidaniu.designpattern.创建.工厂方法;

/**
 * Created by kang on 2018/7/6.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new BuldCreator();
        Light light = creator.createLight();
        light.turnOn();
        light.turnOff();

        creator = new TubeCreator();
        light = creator.createLight();
        light.turnOn();
        light.turnOff();
    }
}
