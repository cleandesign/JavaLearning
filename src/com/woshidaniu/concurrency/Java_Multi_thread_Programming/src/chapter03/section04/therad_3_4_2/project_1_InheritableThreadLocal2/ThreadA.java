package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section04.therad_3_4_2.project_1_InheritableThreadLocal2;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadA线程中取值=" + Tools.tl.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
