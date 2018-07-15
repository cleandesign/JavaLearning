package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section07.thread_1_7_1.project_1_t11;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
