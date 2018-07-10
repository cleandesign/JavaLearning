package com.woshidaniu.designpattern.结构.装饰器;

/**
 * Created by kang on 2018/7/7.
 */
//接下来便是我们的一个具体的接口实现类，也就是俗称的原始对象，或者说待装饰对象
public class ConcreteComponent implements  Component {
    @Override
    public void method() {
        System.out.println("原来的方法");
    }
}
