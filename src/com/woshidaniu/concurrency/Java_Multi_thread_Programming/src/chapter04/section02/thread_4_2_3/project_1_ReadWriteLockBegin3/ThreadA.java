package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter04.section02.thread_4_2_3.project_1_ReadWriteLockBegin3;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.read();
	}

}
