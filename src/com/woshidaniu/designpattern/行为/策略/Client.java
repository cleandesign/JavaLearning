package com.woshidaniu.designpattern.行为.策略;

/**
 * Created by kang on 2018/7/7.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.method();

        context.setStrategy(new ConcreteStrategyB());
        context.method();

        context.setStrategy(new ConcreteStrategyC());
        context.method();
    }
}
