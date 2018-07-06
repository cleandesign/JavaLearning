package com.woshidaniu.Volatile;

/**
 * Created by kang on 2018/7/3.
 */
//这里的 volatile 关键字主要是为了防止指令重排。 如果不用 volatile ，单例 = new Singleton();，这段代码其实是分为三步：
//
//        分配内存空间。(1)
//        初始化对象。(2)
//        将 单例 对象指向分配的内存地址。(3)
//        加上 volatile 是为了让以上的三步操作顺序执行，反之有可能第二步在第三步之前被执行就有可能某个线程拿到的单例对象是还没有初始化的，以致于报错。
public class Singleton {
    private static volatile Singleton singleton ;
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton ;
    }
}


//控制停止线程的标记