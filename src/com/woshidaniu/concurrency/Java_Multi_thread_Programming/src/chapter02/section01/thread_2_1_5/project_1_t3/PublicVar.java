package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter02.section01.thread_2_1_5.project_1_t3;

public class PublicVar {

	public String username = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;

			System.out.println("setValue method threaddemo name="
					+ Thread.currentThread().getName() + " username="
					+ username + " password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getValue() {
		System.out.println("getValue method threaddemo name="
				+ Thread.currentThread().getName() + " username=" + username
				+ " password=" + password);
	}
}
