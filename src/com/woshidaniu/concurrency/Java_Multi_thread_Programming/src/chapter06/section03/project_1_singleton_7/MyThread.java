package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter06.section03.project_1_singleton_7;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
