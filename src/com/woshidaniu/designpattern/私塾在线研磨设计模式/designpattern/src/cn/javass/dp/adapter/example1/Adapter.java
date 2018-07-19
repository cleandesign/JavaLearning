package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example1;
/**
 * ������
 */
public class Adapter implements Target {
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private Adaptee adaptee;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param adaptee ��Ҫ������Ķ���
	 */
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request() {
		//����ת���Ѿ�ʵ���˵ķ�������������
		adaptee.specificRequest();
	}
}

