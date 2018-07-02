package com.woshidaniu.dynamicproxy;

/**
 * Created by kang on 2018/7/2.
 */
public class SayImpl implements Say {
    @Override
    public void sayHello(String words) {
        System.out.println("hello:" + words);
    }
}
