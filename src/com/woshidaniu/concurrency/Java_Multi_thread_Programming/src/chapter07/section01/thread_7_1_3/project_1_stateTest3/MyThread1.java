package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section01.thread_7_1_3.project_1_stateTest3;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}

}
