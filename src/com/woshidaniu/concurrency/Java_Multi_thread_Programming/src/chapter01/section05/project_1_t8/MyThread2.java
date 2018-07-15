package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section05.project_1_t8;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run threadName="
					+ this.currentThread().getName() + " begin ="
					+ System.currentTimeMillis());
			System.out.println(this.currentThread().getId());
			Thread.sleep(2000);
			System.out.println("run threadName="
					+ this.currentThread().getName() + " end   ="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
