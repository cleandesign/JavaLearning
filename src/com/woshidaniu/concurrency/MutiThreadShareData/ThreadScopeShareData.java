package com.woshidaniu.concurrency.MutiThreadShareData;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by kang on 2018/7/2.
 */
public class ThreadScopeShareData {
    //准备一个哈希表，为每个线程准备数据
    private  static Map<Thread,Integer> threadData = new HashMap<>();
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
             new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            int data = new Random().nextInt();
                            threadData.put(Thread.currentThread(),data);
                            System.out.println(Thread.currentThread()+" put data："+data);
                            new A().get();
                            new B().get();
                        }
                    }).start();

            try {
                // 括号内的参数是毫秒值,线程休眠1s
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    static  class A{
        public void get(){
            int data = threadData.get(Thread.currentThread());
            System.out.println("A from "+Thread.currentThread()+" get data "+data);
        }
    }

    static  class B{
        public void get(){
            int data = threadData.get(Thread.currentThread());
            System.out.println("B from "+Thread.currentThread()+" get data "+data);
        }
    }
}
