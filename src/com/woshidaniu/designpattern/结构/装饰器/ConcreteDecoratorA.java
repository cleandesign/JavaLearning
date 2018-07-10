package com.woshidaniu.designpattern.结构.装饰器;

/**
 * Created by kang on 2018/7/7.
 */
//再来便是我们具体的装饰器A和装饰器B。
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA(){
        System.out.println("被装饰器A扩展的功能");
    }

    public void method(){
        System.out.println("针对该方法加一层A包装");
        super.method();
        System.out.println("A包装结束");
    }
}