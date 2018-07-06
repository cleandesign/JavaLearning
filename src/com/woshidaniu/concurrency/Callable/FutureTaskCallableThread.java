package com.woshidaniu.concurrency.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by kang on 2018/7/4.
 */
public class FutureTaskCallableThread implements Callable<String> {

    public String call() throws Exception
    {
        System.out.println("进入CallableThread的call()方法, 开始睡觉, 睡觉时间为" + System.currentTimeMillis());
        Thread.sleep(5000);
        System.out.println("离开CallableThread的call()方法" + System.currentTimeMillis());
        return "321";
    }
    public static void main(String[] args) throws Exception
    {
        ExecutorService es = Executors.newSingleThreadExecutor();
        FutureTaskCallableThread ct = new FutureTaskCallableThread();
        FutureTask<String> f = new FutureTask<String>(ct);
        es.submit(f);
        es.shutdown();

        Thread.sleep(3000);
        System.out.println("主线程等待3秒, 当前时间为" + System.currentTimeMillis());

        String str = f.get();
        System.out.println("Future已拿到数据, str = " + str + ", 当前时间为" + System.currentTimeMillis());
    }
}
