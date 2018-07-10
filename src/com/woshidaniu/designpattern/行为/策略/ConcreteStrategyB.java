package com.woshidaniu.designpattern.行为.策略;

/**
 * Created by kang on 2018/7/7.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("采用策略B计算");
    }
}
