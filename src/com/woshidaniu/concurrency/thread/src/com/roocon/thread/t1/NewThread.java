package com.woshidaniu.concurrency.thread.src.com.roocon.thread.t1;

public class NewThread implements Runnable {

	@Override
	public synchronized void run() {
		while(true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("??????????????....");
		}
	}
	
	public static void main(String[] args) {
		
		NewThread n = new NewThread();
		
		// ???????
		Thread thread = new Thread(n); // ???????,????????????
		
		thread.start(); // ???????
		
		while(true) {
			synchronized (n) {
				System.out.println("??????????...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				n.notifyAll();
			}
			
		}
		
	}

}
