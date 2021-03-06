package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter04.section01.thread_4_1_13.project_3_tryLockTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();

		Runnable runnableRef = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};

		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}
}
