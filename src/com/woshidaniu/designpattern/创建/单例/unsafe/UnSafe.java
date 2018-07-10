package com.woshidaniu.designpattern.创建.单例.unsafe;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kang on 2018/7/9.
 */
public class UnSafe {

    private static  UnSafe instance;

    private  UnSafe(){}


    public static  UnSafe getInstance(){
        if (instance == null) {
            instance = new  UnSafe();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        int threadCounts = 100;
        int testCounts = 100;
        for (int i = 0; i < testCounts; i++) {
            test(threadCounts);
        }
    }

    public static void test(int threadCounts) throws InterruptedException{
        ExecutorService executorService = Executors.newCachedThreadPool();
        final CountDownLatch startFlag = new CountDownLatch(1);
        final CountDownLatch counter = new CountDownLatch(threadCounts);
        final Set<String> instanceSet = Collections.synchronizedSet(new java.util.HashSet<>());
        for (int i = 0; i < threadCounts; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        startFlag.await();
                    } catch (InterruptedException e) {}
                    instanceSet.add( UnSafe.getInstance().toString());
                    counter.countDown();
                }
            });
        }
        startFlag.countDown();
        counter.await();
        UnSafe.instance = null;
        if (instanceSet.size() > 1) {
            System.out.print("{");
            for (String instance : instanceSet) {
                System.out.print("[" + instance + "]");
            }
            System.out.println("}");
        }
        executorService.shutdown();
    }
}
