package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section03.project_2_currentThreadExt;

public class Run {
	
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	//	c.setName("b");
//	c.start();
	}


}
