package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section04.project_2_isaliveOtherTest;

public class Run {
	
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
