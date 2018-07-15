package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section06.project_1_runThread;

public class Test {

	public static void main(String[] args) {
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId() );
	}
	
}
