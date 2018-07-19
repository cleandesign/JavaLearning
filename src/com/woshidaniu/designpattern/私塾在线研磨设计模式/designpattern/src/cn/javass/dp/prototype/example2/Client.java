package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example2;
/**
 * ʹ��ԭ�͵Ŀͻ���
 */
public class Client {
	/**
	 * ������Ҫʹ�õ�ԭ�ͽӿڶ���
	 */
	private Prototype prototype;
	/**
	 * ���췽����������Ҫʹ�õ�ԭ�ͽӿڶ���
	 * @param prototype ��Ҫʹ�õ�ԭ�ͽӿڶ���
	 */
	public Client(Prototype prototype){
		this.prototype = prototype;
	}
	/**
	 * ʾ�ⷽ����ִ��ĳ�����ܲ���
	 */
	public void operation(){
		//����Ҫ����ԭ�ͽӿڵĶ���
		Prototype newPrototype = prototype.clone();
	}
}