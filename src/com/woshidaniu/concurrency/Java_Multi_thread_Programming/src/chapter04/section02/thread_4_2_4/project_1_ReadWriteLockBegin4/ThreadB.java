package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter04.section02.thread_4_2_4.project_1_ReadWriteLockBegin4;


public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}