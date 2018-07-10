package com.woshidaniu.designpattern.结构.适配器.定制适配器;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by kang on 2018/7/7.
 */
//    即我们继承我们希望复用其功能的类，并且实现我们想适配的接口，在这里就是Observer，那么就会产生一个适配器，这个适配器具有原有类（即HashMap）的功能，又具有观察者接口，所以这个适配器现在可以加入到观察者列表了。
//
//            看，类适配器很简单吧？那么下面我们来看看对象适配器，刚才说了对象适配器是采用组合的方式实现。
//
//            为什么要采用组合呢？上面的方式不是很好吗？
//
//            究其根本，是因为JAVA单继承的原因，一个JAVA类只能有一个父类，所以当我们要适配的对象是两个类的时候，你怎么办呢？你难道要将两个类全部写到extends后面吗，如果你这么做了，那么编译器会表示它的不满的。
public class HashMapObserverAdapter<K, V> extends HashMap<K, V> implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //被观察者变化时，清空Map
        super.clear();
    }
}
