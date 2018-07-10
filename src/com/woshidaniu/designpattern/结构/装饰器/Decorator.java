package com.woshidaniu.designpattern.结构.装饰器;

/**
 * Created by kang on 2018/7/7.
 */
//下面便是我们的抽象装饰器父类，它主要是为装饰器定义了我们需要装饰的目标是什么，并对Component进行了基础的装饰。
public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    public void method() {
        component.method();
    }

}
