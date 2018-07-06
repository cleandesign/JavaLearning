package com.woshidaniu.designpattern.创建.工厂方法;

/**
 * Created by kang on 2018/7/6.
 */
public class BuldCreator implements  Creator {
    @Override
    public Light createLight() {
        return new BuldLight();
    }
}
