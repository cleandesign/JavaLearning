package com.woshidaniu.concurrency.MutiThreadShareData;

/**
 * Created by kang on 2018/7/2.
 */

//多线程访问共享数据
//        几种方式
//        线程执行代码相同，使用同一Runnable对象，Runnable对象中有共享数据
//        线程执行代码不同，将共享数据封装在另一对象中（操作数据的方法也在该对象完成），将这个对象逐一传递给各个Runnable对象。[本质：共享数据的对象作为参数传入Runnable对象]
//        线程执行代码不同，将Runnable对象作为某一个类的内部类，共享数据作为这个外部类的成员变量（操作数据的方法放在外部类）。[本质:不同内部类共享外部类数据]
//        结合上两种方式，将共享数据封装在另一对象中（操作数据的方法也在该对象完成），该对象作为这个外部类的成员变量，将Runnable对象作为内部类
//设计5个线程，其中三个线程每次对j增加1，另外两个线程对j每次减少1
public class MutiThreadShareData {
    private static MutiShareData mutiShareData = new MutiShareData();

    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread()+":{j from "+ mutiShareData.getJ()+" + to: "+mutiShareData.increment()+"}");
                        }
                    }
            ).start();
        }

        for(int i=0;i<2;i++){
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread()+":{j from "+ mutiShareData.getJ()+" - to: "+mutiShareData.decrement()+"}");
                        }
                    }
            ).start();
        }
    }

}

/**
 * 将共享数据封装在另一对象中（操作数据的方法也在该对象完成）
 */
class MutiShareData{
    private int j = 0;
    public synchronized  int increment(){
        return  ++j;
    }
    public synchronized int  decrement(){
        return --j;
    }

    public synchronized int getJ() {
        return j;
    }

    public synchronized void setJ(int j) {
        this.j = j;
    }
}

