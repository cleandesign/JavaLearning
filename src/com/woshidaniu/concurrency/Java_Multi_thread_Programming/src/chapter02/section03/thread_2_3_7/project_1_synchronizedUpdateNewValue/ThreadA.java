package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section03.thread_2_3_7.project_1_synchronizedUpdateNewValue;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}
}
