package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section07.thread_1_7_5.project_1_useStopMethodThreadTest;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
