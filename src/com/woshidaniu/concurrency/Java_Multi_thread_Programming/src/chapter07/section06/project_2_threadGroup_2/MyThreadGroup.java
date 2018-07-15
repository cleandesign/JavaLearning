package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section06.project_2_threadGroup_2;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		this.interrupt();
	}

}
