package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section01.thread_2_1_2.project_1_t2;

public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
