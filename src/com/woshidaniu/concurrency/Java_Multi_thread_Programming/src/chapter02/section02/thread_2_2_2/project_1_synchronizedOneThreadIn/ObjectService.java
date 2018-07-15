package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section02.thread_2_2_2.project_1_synchronizedOneThreadIn;

public class ObjectService {

	public void serviceMethod() {
		try {
			synchronized (this) {
				System.out.println("begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end    end=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
