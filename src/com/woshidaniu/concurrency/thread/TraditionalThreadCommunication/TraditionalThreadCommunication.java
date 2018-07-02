package com.woshidaniu.concurrency.thread.TraditionalThreadCommunication;

/**
 * Created by kang on 2018/7/2.
 */
//子线程循环5次，主线程循环10次，如此交替50次
    //使用一个Business类来包含子线程和主线程要运行的代码，从而，该类的对象成为加锁的对象。同步互斥在该类实现，由线程调用该类的方法，即调用了资源。

public class TraditionalThreadCommunication {

    public static void main(String[] args) {
        final Business business = new Business();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=1;i<=50;i++){
                            business.sub(i);
                        }
                    }
                }
        ).start();




        for(int i=1;i<=50;i++){
            business.main(i);
        }

    }


}

