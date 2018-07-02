package com.woshidaniu.concurrency.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by kang on 2018/7/2.
 */
//一个定时器实现交替2秒、3秒打印
public class TimerTest {
    static int count = 0;
    public static void main(String[] args) {

        class MyTimerTask extends TimerTask {

            @Override
            public void run() {
                System.out.println(Thread.currentThread()+" bomb!");
                new Timer().schedule(new MyTimerTask(), 2000+1000*(count++%2));
            }
        }
        //3s后开启定时器
        new Timer().schedule(new MyTimerTask(),3000);
    }
}
