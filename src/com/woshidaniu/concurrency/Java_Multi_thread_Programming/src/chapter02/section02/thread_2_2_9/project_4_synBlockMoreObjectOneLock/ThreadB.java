package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section02.thread_2_2_9.project_4_synBlockMoreObjectOneLock;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printB();
	}
}
