package com.woshidaniu.designpattern.创建.抽象工厂.List;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by kang on 2018/7/6.
 */

// 1.List，是抽象工厂的角色，它有两个制造产品的方法，iterator和listIterator，相当于Creator。
//
//         2.ListIterator和Iterator都是抽象产品，相当于ProductA和ProductB。其中ListIterator有两个实现类，分别是AbstractList.ListItr和LinkedList.ListItr，相当于ProductA1和ProductA2。Iterator的实现类为AbstractList.Itr，相当于ProductB1，但是没有B2。
//
//         3.LinkedList是其中一个具体的工厂类，相当于ConcreteCreator1，实现抽象工厂List，它制造的两个具体产品分别是LinkedList.ListItr和AbstractList.Itr。
//
//         4.同样的，ArrayList也是一个具体的工厂类，相当于ConcreteCreator2，实现抽象工厂List，它制造的两个具体产品分别是AbstractList.ListItr和AbstractList.Itr。


//
//      Iterable接口是List的父接口，所以它只负责一个产品Iterator的制造，所以是工厂方法模式，而List接口扩展了Iterable接口，又添加了一个制造产品的方法，即又添加了一个系列的产品，所以就成为了抽象工厂模式。

//         1.Creator=List
//
//                 2.ConcreteCreator1=ArrayList
//
//                 3.ConcreteCreator2=LinkedList
//
//                 4.ProductA=Iterator
//
//                 5.ProductB=ListIterator
//
//                 6.ProductA1=AbstractList.Itr
//
//                 7.ProductA2=无（具体的A产品2在第一个类图中是没有的，但这并不影响整个体系）
//
//                 8.ProductB1=AbstractList.ListItr
//
//                 9.ProductB2=LinkedList.ListItr

public interface demoList extends Collection<E> {
    Iterator<E> iterator();//一种产品

    Object[] toArray();

    <T> T[] toArray(T[] a);

    ListIterator<E> listIterator();//另外一种产品

    ListIterator<E> listIterator(int index);
}
