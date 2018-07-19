package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example2;
/**
 * ����Ĵ�����ʵ�ֶ���
 */
public class ConcreteCreator extends Creator {
	public Product factoryMethod() {
		//�ض��幤������������һ�������Product����
		return new ConcreteProduct();
	}
}

