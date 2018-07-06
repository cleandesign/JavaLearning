package com.woshidaniu.designpattern.创建.单例;

/**
 * Created by kang on 2018/7/5.
 */
public class Singleton {
    //一个静态的实例
    private static Singleton singleton;
    //私有化构造函数
    private Singleton(){}
    //给出一个公共的静态方法返回一个单一实例
    //synchronized
    public  static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

//public class BadSynchronizedSingleton {
//
//    //一个静态的实例
//    private static BadSynchronizedSingleton synchronizedSingleton;
//    //私有化构造函数
//    private BadSynchronizedSingleton(){}
//    //给出一个公共的静态方法返回一个单一实例
//    public synchronized static BadSynchronizedSingleton getInstance(){
//        if (synchronizedSingleton == null) {
//            synchronizedSingleton = new BadSynchronizedSingleton();
//        }
//        return synchronizedSingleton;
//    }
//
//}

//public class SynchronizedSingleton {
//
//    //一个静态的实例

//              1.分配内存
//
//                      2.初始化构造器
//
//                      3.将对象指向分配的内存的地址
//    private static volatile SynchronizedSingleton synchronizedSingleton;
//    //私有化构造函数
//    private SynchronizedSingleton(){}
//    //给出一个公共的静态方法返回一个单一实例
//    public static SynchronizedSingleton getInstance(){
//        if (synchronizedSingleton == null) {
//            synchronized (SynchronizedSingleton.class) {
//                if (synchronizedSingleton == null) {
//                    synchronizedSingleton = new SynchronizedSingleton();
//                }
//            }
//        }
//        return synchronizedSingleton;
//    }
//}

//public class InnerClassSingleton {
//
//    public static Singleton getInstance(){
//        return Singleton.singleton;
//    }
//
//    private static class Singleton{
//
//        protected static Singleton singleton = new Singleton();
//
//    }
//}


//public class Singleton {
//
//    private static Singleton singleton = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return singleton;
//    }
//
//}