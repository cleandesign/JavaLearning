package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section04.project_1_t7;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}

