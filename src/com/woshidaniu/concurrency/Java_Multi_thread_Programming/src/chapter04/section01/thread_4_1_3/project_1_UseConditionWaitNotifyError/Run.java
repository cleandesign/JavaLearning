package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError;

public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}

}
