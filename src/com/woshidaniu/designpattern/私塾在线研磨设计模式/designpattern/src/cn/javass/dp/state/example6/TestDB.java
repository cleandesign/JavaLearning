package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example6;
import java.util.*;
public class TestDB {
	public static Map map = new HashMap();
	static{
		Thread t = new Thread( new MemoryDB());
		t.start();
	}
}
class MemoryDB implements Runnable{
	
	public void run() {
		while(true){
			//һֱ������
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
