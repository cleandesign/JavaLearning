package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section05.project_1_t8;

public class Run2 {
	
	public static void main(String[] args) {
		MyThread2 mythread = new MyThread2();
		System.out.println("begin =" + System.currentTimeMillis());
		System.out.println(Thread.currentThread().getId());
		mythread.start();
		System.out.println("end   =" + System.currentTimeMillis());
	}

}
