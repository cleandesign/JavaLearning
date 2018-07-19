package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example4;
/**
 * �ͻ���ʹ��Creator���������£�Creator�Ļ���ʵ�ֽṹ
 */
public abstract class Creator {
	/**
	 * ����������һ�㲻����
	 * @return �����Ĳ�Ʒ����
	 */
	protected abstract Product factoryMethod();
	/**
	 * �ṩ���ⲿʹ�õķ�����
	 * �ͻ���һ��ʹ��Creator�ṩ����Щ�������������Ҫ�Ĺ���
	 */
	public void someOperation(){
		//������ʹ�ù�������
		Product p = factoryMethod();
	}
}
