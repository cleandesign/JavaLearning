package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example2;

public class Client {

	public static void main(String[] args) {
		//�������󹤳�����
		AbstractFactory af = new ConcreteFactory1();
		//ͨ�����󹤳�����ȡһϵ�еĶ������ƷA�Ͳ�ƷB
		af.createProductA();
		af.createProductB();
	}
}
