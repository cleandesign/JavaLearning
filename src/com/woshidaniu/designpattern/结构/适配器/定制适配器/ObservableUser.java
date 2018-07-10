package com.woshidaniu.designpattern.结构.适配器.定制适配器;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by kang on 2018/7/7.
 */
//我们继承User,组合Observable.
public class ObservableUser extends User{

    private Observable observable = new Observable();

    public synchronized void addObserver(Observer o) {
        observable.addObserver(o);
    }

    public synchronized void deleteObserver(Observer o) {
        observable.deleteObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void notifyObservers(Object arg) {
        observable.notifyObservers(arg);
    }

    public synchronized void deleteObservers() {
        observable.deleteObservers();
    }
//
//    protected synchronized void setChanged() {
//        observable.setChanged();
//    }
//
//    protected synchronized void clearChanged() {
//        observable.clearChanged();
//    }

    public synchronized boolean hasChanged() {
        return observable.hasChanged();
    }

    public synchronized int countObservers() {
        return observable.countObservers();
    }


}