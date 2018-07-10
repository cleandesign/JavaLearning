package com.woshidaniu.designpattern.行为.模板方法.ClassLoader;

/**
 * Created by kang on 2018/7/7.
 */

//LZ截取了主要的部分，为了突出这三个方法。在上面LZ加了简单的注释，相信经过刚才的介绍，各位应该能看出来这是一个模板方法模式，只是它没有定义抽象方法，因为findClass这个方法，并不是必须实现的，所以JDK选择留给程序员们自己选择是否要覆盖。
//
//        从代码上我们可以看出，在ClassLoader中定义的算法顺序是。
//
//        1，首先看是否有已经加载好的类。
//
//        2，如果父类加载器不为空，则首先从父类类加载器加载。
//
//        3，如果父类加载器为空，则尝试从启动加载器加载。
//
//        4，如果两者都失败，才尝试从findClass方法加载。
//
//        这是JDK类加载器的双亲委派模型，即先从父类加载器加载，直到继承体系的顶层，否则才会采用当前的类加载器加载。这样做的目的刚才已经说了，是为了JVM中类的一致性。
//
//        如果有读者第一次接触这方面的知识，估计会比较迷茫，下面LZ给出一个例子。各位猜测下下面程序的运行结果会是什么？


//public abstract class ClassLoader {
//    //这是一个重载方法
//    public Class<?> loadClass(String name) throws ClassNotFoundException {
//        return loadClass(name, false);
//    }
//
//    //这里就是父类算法的定义
//    protected synchronized Class<?> loadClass(String name, boolean resolve)
//            throws ClassNotFoundException
//    {
//        Class c = findLoadedClass(name);
//        if (c == null) {
//            try {
//                if (parent != null) {
//                    c = parent.loadClass(name, false);
//                } else {
//                    c = findBootstrapClass0(name);
//                }
//            } catch (ClassNotFoundException e) {
//                c = findClass(name);
//            }
//        }
//        if (resolve) {
//            resolveClass(c);
//        }
//        return c;
//    }
//    //这里留了一个方法给子类选择性覆盖
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        throw new ClassNotFoundException(name);
//    }
//
//}