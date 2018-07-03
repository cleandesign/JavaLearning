package com.woshidaniu.concurrency.WaitNotify;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by kang on 2018/7/3.
 */
public class CyclicBarrierDemo {
    private static void cyclicBarrier() throws Exception {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3) ;

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +"thread run");
                try {
                    cyclicBarrier.await() ;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +"thread end do something");

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +"thread run");

                try {
                    cyclicBarrier.await() ;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +"thread end do something");

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +"thread run");

                try {
                    Thread.sleep(5000);
                    cyclicBarrier.await() ;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +"thread end do something");
                //LOGGER.info();
            }
        }).start();
        System.out.println(Thread.currentThread().getName() +"main thread");

    }
    public static void main(String[] args) {
        try {
            cyclicBarrier();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//    CyclicBarrier 中文名叫做屏障或者是栅栏，也可以用于线程间通信。
//
//        它可以等待 N 个线程都达到某个状态后继续运行的效果。
//
//        首先初始化线程参与者。
//        调用 await() 将会在所有参与者线程都调用之前等待。
//        直到所有参与者都调用了 await() 后，所有线程从 await() 返回继续后续逻辑。
//        运行结果:
//
//        2018-03-18 22:40:00.731 [Thread-0] INFO  c.c.actual.ThreadCommunication - thread run
//        2018-03-18 22:40:00.731 [Thread-1] INFO  c.c.actual.ThreadCommunication - thread run
//        2018-03-18 22:40:00.731 [Thread-2] INFO  c.c.actual.ThreadCommunication - thread run
//        2018-03-18 22:40:00.731 [main] INFO  c.c.actual.ThreadCommunication - main thread
//        2018-03-18 22:40:05.741 [Thread-0] INFO  c.c.actual.ThreadCommunication - thread end do something
//        2018-03-18 22:40:05.741 [Thread-1] INFO  c.c.actual.ThreadCommunication - thread end do something
//        2018-03-18 22:40:05.741 [Thread-2] INFO  c.c.actual.ThreadCommunication - thread end do something
//        可以看出由于其中一个线程休眠了五秒，所有其余所有的线程都得等待这个线程调用 await() 。
//
//        该工具可以实现 CountDownLatch 同样的功能，但是要更加灵活。甚至可以调用 reset() 方法重置 CyclicBarrier (需要自行捕获 BrokenBarrierException 处理) 然后重新执行。