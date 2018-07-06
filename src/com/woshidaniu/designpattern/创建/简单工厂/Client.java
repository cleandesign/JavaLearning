package com.woshidaniu.designpattern.创建.简单工厂;

/**
 * Created by kang on 2018/7/5.
 */
public class Client {

    public static void main(String[] args) {
        IProduct product1 = Creator.createProduct("A");
        product1.method();

        IProduct product2 = Creator.createProduct("B");
        product2.method();
    }
}
