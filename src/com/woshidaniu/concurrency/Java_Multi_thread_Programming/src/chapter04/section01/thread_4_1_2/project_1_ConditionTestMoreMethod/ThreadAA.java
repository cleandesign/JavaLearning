package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter04.section01.thread_4_1_2.project_1_ConditionTestMoreMethod;

public class ThreadAA extends Thread {

	private MyService service;

	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}

