package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example2;
/**
 * ����Ĺ���ʵ�ֶ���ʵ�ִ�������Ĳ�Ʒ����Ĳ���
 */
public class ConcreteFactory1 implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}

