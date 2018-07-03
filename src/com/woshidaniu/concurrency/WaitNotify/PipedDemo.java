package com.woshidaniu.concurrency.WaitNotify;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by kang on 2018/7/3.
 */
public class PipedDemo {
    public static void piped() throws IOException {
        //面向于字符 PipedInputStream 面向于字节
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();

        //输入输出流建立连接
        writer.connect(reader);


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //LOGGER.info("running");
                System.out.println(Thread.currentThread().getName()+"running");
                try {
                    for (int i = 0; i < 10; i++) {

                        writer.write(i+"");
                        Thread.sleep(10);
                    }
                } catch (Exception e) {

                } finally {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //LOGGER.info("running2");
                System.out.println(Thread.currentThread().getName()+"running2");
                int msg = 0;
                try {
                    while ((msg = reader.read()) != -1) {
                        //LOGGER.info("msg={}", (char) msg);
                        System.out.println("msg="+ (char) msg);
                    }

                } catch (Exception e) {

                }
            }
        });
        t1.start();
        t2.start();
    }


    public static void main(String[] args) throws IOException {
        piped();
    }
}

//    Java 虽说是基于内存通信的，但也可以使用管道通信。
//
//        需要注意的是，输入流和输出流需要首先建立连接。这样线程 B 就可以收到线程 A 发出的消息了。
//
//        实际开发中可以灵活根据需求选择最适合的线程通信方式。