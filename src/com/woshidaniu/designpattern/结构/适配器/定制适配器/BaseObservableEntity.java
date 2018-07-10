package com.woshidaniu.designpattern.结构.适配器.定制适配器;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by kang on 2018/7/7.
 */

//适配器模式的用法还是比较清晰的，我们以上两种方式都是为了复用现有的代码而采用的适配器模式，LZ刚才说了，根据目的的不同，适配器模式也可以分为两种，那么上述便是第一种，可称为定制适配器，还有另外一种称为缺省适配器。
//我们扩展BaseEntity,适配出来一个可观察的实体基类
public class BaseObservableEntity extends BaseEntity{

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
