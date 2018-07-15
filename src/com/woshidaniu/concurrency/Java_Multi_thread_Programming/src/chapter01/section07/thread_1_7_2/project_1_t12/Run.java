package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section07.thread_1_7_2.project_1_t12;

public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(10);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？="+thread.interrupted());
			System.out.println("是否停止2？="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");

	}

}
