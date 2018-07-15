package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section07.thread_1_7_2.project_1_t12;

public class MyThread  extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}
