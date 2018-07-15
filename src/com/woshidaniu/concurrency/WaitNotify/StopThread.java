package com.woshidaniu.concurrency.WaitNotify;

import java.util.concurrent.TimeUnit;

/**
 * Created by kang on 2018/7/3.
 */
public class StopThread implements Runnable {
    @Override
    public void run() {

        while ( !Thread.currentThread().isInterrupted()) {
            // 线程执行具体逻辑
            System.out.println(Thread.currentThread().getName() + "运行中。。");
        }

        System.out.println(Thread.currentThread().getName() + "退出。。");

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopThread(), "threaddemo A");
        thread.start();

        System.out.println("main 线程正在运行") ;

        TimeUnit.MILLISECONDS.sleep(10) ;
        thread.interrupt();
    }


}
//可以采用中断线程的方式来通信，调用了 threaddemo.interrupt() 方法其实就是将 threaddemo 中的一个标志属性置为了 true。
//
//        并不是说调用了该方法就可以中断线程，如果不对这个标志进行响应其实是没有什么作用(这里对这个标志进行了判断)。
//
//        但是如果抛出了 InterruptedException 异常，该标志就会被 JVM 重置为 false。
