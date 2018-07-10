package com.woshidaniu.designpattern.行为.观察者;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by kang on 2018/7/6.
 */
public class Observable  {
    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void changed(){
        System.out.println("我是被观察者，我已经发生变化了");
        notifyObservers();//通知观察自己的所有观察者
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
