package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section01.therad_3_1_11.project_2_p_c_allWait;

public class ThreadP extends Thread {

	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}

}
