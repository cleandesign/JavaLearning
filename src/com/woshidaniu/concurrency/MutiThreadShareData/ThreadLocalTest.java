package com.woshidaniu.concurrency.MutiThreadShareData;

import java.util.Random;

/**
 * Created by kang on 2018/7/2.
 */
//定义一个对象来封装多个变量，然后在ThreadLocal中存储整个对象
//
//        多变量时，最好将ThreadLocal类放在数据类的内部，数据类采用单例模式，这样，新建对象和获取对象都会更方便，同时封装性更强。


public class ThreadLocalTest {
    private  static ThreadLocal<Integer> threadInger = new ThreadLocal<>();
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int data = new Random().nextInt(100);
                    threadInger.set(data);
                    System.out.println(Thread.currentThread()+" put data："+data);
                    MyThreadScopeData.getThreadInstance().setName(Thread.currentThread().toString());
                    MyThreadScopeData.getThreadInstance().setAge(data%10);
                    new A().get();
                    new B().get();
                }
            }).start();
        }
//        try {
//            // 括号内的参数是毫秒值,线程休眠1s
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
    static  class A{
        public void get(){
            int data = threadInger.get();
            System.out.println("A from "+Thread.currentThread()+" get data "+data);
            MyThreadScopeData myThreadScopeData = MyThreadScopeData.getThreadInstance();
            System.out.println("A from "+myThreadScopeData);

        }
    }

    static  class B{
        public void get(){
            int data = threadInger.get();
            System.out.println("B from "+Thread.currentThread()+" get data "+data);
            MyThreadScopeData myThreadScopeData = MyThreadScopeData.getThreadInstance();
            System.out.println("B from "+myThreadScopeData);
        }
    }
}

/**
 * 将多变量封装起来的数据类
 * 单例模式，内置ThreadLocal类型变量
 */
class MyThreadScopeData{

    private MyThreadScopeData(){}

    private static ThreadLocal<MyThreadScopeData> data = new ThreadLocal<>();

    public static  MyThreadScopeData getThreadInstance(){
        MyThreadScopeData instance = data.get();
        if(instance == null){
            instance = new MyThreadScopeData();
            data.set(instance);
        }
        return instance;
    }



    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String reVal = super.toString()+"-{name,age}"+":{"+getName()+","+getAge()+"}";
        return reVal;
    }
}
