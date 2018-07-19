package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example2;

public class Client {
	public static void main(String[] args) {
//		//����Facade����Ҫ�Լ������ģ�齻��
//		AModuleApi a = new AModuleImpl();
//		a.testA();
//		BModuleApi b = new BModuleImpl();
//		b.testB();
//		CModuleApi c = new CModuleImpl();
//		c.testC();
//		
//		System.out.println("ʹ��Facade----------------------��");
		//ʹ����Facade
		new Facade().test();		
	}
}
