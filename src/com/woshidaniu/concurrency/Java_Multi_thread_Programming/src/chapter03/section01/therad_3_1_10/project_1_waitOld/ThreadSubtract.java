package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section01.therad_3_1_10.project_1_waitOld;

public class ThreadSubtract extends Thread {

	private Subtract r;

	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		r.subtract();
	}

}