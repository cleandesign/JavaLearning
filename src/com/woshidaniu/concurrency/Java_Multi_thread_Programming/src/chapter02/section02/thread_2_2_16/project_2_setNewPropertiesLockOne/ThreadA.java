package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class ThreadA extends Thread {

	private Service service;
	private Userinfo userinfo;

	public ThreadA(Service service, 
			Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}

}
