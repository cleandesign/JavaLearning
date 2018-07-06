package com.woshidaniu.designpattern.创建.抽象工厂;

/**
 * Created by kang on 2018/7/6.
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }

}
