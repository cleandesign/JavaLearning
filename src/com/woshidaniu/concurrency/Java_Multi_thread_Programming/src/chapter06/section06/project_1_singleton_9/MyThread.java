package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter06.section06.project_1_singleton_9;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.connectionFactory.getConnection()
					.hashCode());
		}
	}
}
