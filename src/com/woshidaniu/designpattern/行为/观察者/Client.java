package com.woshidaniu.designpattern.行为.观察者;

/**
 * Created by kang on 2018/7/6.
 */
public class Client {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());

        observable.changed();

    }
}

