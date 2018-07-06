package com.woshidaniu.singletonPattern;

/**
 * Created by kang on 2018/7/3.
 */
@Deprecated
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}

//懒汉式，线程安全
//class Singleton {
//    private static Singleton instance;
//    private Singleton (){}
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
//饿汉式
//class Singleton {
//    private static Singleton instance = new Singleton();
//    private Singleton (){}
//    public static Singleton getInstance() {
//        return instance;
//    }

//双检锁/双重校验锁
// class Singleton {
//    private volatile static Singleton 单例;
//    private Singleton (){}
//    public static Singleton getSingleton() {
//        if (单例 == null) {
//            synchronized (Singleton.class) {
//                if (单例 == null) {
//                    单例 = new Singleton();
//                }
//            }
//        }
//        return 单例;
//    }
//    public void showMessage(){
//        System.out.println("Hello World!");
//    }
//}

//登记式/静态内部类

 class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
     public void showMessage(){
         System.out.println("Hello World!");
     }
}

//枚举
//public enum Singleton {
//    INSTANCE;
//    public void whateverMethod() {
//    }
//}
//一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。

