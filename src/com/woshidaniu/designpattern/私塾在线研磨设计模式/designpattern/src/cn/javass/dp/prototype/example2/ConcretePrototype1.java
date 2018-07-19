package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example2;
/**
 * ��¡�ľ���ʵ�ֶ���
 */
public class ConcretePrototype1 implements Prototype {
	public Prototype clone() {
		//��򵥵Ŀ�¡���½�һ�������������û�����ԣ��Ͳ�ȥ����ֵ��
		Prototype prototype = new ConcretePrototype1();
		return prototype;
	}
}

