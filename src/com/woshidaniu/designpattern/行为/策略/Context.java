package com.woshidaniu.designpattern.行为.策略;

/**
 * Created by kang on 2018/7/7.
 */
public class Context {
    Strategy strategy;

    public void method(){
        strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
