package com.woshidaniu.designpattern.创建.抽象工厂;

/**
 * Created by kang on 2018/7/6.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        ProductA productA = creator.createProductA();
        ProductB productB = creator.createProductB();
        productA.methodA();
        productB.methodB();

        creator = new ConcreteCreator2();
        productA = creator.createProductA();
        productB = creator.createProductB();
        productA.methodA();
        productB.methodB();
    }
}
