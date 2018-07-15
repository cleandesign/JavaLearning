package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section01.therad_3_1_3.project_3_wait_notify_size5;

public class Run {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(50);

			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
